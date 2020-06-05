package kgw.PcReview.web.Controller;

import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.bind.support.SessionStatus;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import kgw.PcReview.web.Service.MemberLoginServiceImpl;
import kgw.PcReview.web.Vo.MemberVo;
@Controller
@SessionAttributes("login")
public class LoginController {
	String url="";
	@Autowired
	MemberLoginServiceImpl MemberLoginServiceImpl;
	@RequestMapping("/login")
	public String login(HttpServletRequest request,Model model) {
		url=request.getHeader("Referer");
		return "login";
	}
	@RequestMapping(value="/loginAction", method=RequestMethod.POST)
	public String loginAction(MemberVo vo, Model model, RedirectAttributes redirectAttributes, HttpSession session, HttpServletRequest request) {
		if(vo.getId().toString().replace(" ","").equals("")||vo.getId().equals(null)||vo.getPass().toString().replace(" ","").equals("")||vo.getPass().equals(null)) {
			return "redirect:/login";
			//공란 경고창 기입예정
		}	
		vo=MemberLoginServiceImpl.checklogin(vo.getId(),vo.getPass());
		if(vo==null) {
			return "redirect:/login";
			//공란 경고창 기입예정
		}
		Map<String,Object> member=new HashMap<String,Object>();
		member.put("id",vo.getId());
		member.put("pass",vo.getPass());
		member.put("levels",vo.getLevels());
		model.addAttribute("login", vo);
		try {
			if(!url.equals(request.getHeader("Referer"))) {
				return "redirect:"+url;
			}
			else {
				return "redirect:index";
				}
			}
		catch(NullPointerException e){
			return "redirect:index";
		}
	}
	@RequestMapping("/logout")
	public String logout(SessionStatus status, HttpServletRequest request) {
		status.setComplete();
		url="";
		return "redirect:"+request.getHeader("Referer");
	}
	@RequestMapping("/memberSign")
	public String memberSign(SessionStatus status, HttpServletRequest request) {
		status.setComplete();
		url="";
		return "memberSign";
	}
	@RequestMapping("/signAction")
	public String SignAction(MemberVo vo, Model model, RedirectAttributes redirectAttributes, HttpSession session, HttpServletRequest request) {
		if(vo.getId().toString().replace(" ","").equals("")||vo.getId().equals(null)||vo.getPass().toString().replace(" ","").equals("")||vo.getPass().equals(null)) {
			return "redirect:/memberSign";
			//공란 경고창 기입예정
		}	
		MemberVo check=MemberLoginServiceImpl.check(vo.getId());
		if(check!=null) {
			return "redirect:/memberSign";
			//공란 경고창 기입예정
		}
		MemberLoginServiceImpl.insertlogin(vo.getId(),vo.getPass(),1);
		Map<String,Object> member=new HashMap<String,Object>();
		member.put("id",vo.getId());
		member.put("pass",vo.getPass());
		member.put("levels",vo.getLevels());
		model.addAttribute("login", vo);
		//회원 가입완료 메세지 입력예정 
		try {
			if(!url.equals(request.getHeader("Referer")))
				return "redirect:"+url;
			else
				return "redirect:index";
			}
		catch(NullPointerException e){
			return "redirect:index";
		}
	}
}