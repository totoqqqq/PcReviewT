package kgw.PcReview.web.Controller;

import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import kgw.PcReview.web.Service.MemberLoginServiceImpl;
import kgw.PcReview.web.Vo.MemberVo;
@Controller
@SessionAttributes("login")
public class LoginController {
	@Autowired
	MemberLoginServiceImpl MemberLoginServiceImpl;
	@RequestMapping("/login")
	public String login() {
		return "login";
	}
	@RequestMapping(value="/loginAction", method=RequestMethod.POST)
	public String loginAction(MemberVo vo, Model model, RedirectAttributes redirectAttributes, HttpSession session) {
		if(vo.getId().toString().replace(" ","").equals("")||vo.getId().equals(null)||vo.getPass().toString().replace(" ","").equals("")||vo.getPass().equals(null)) {
			return login();
			//공란 경고창 기입예정
		}	
		vo=MemberLoginServiceImpl.checklogin(vo.getId(),vo.getPass());
		if(vo==null) {
			return login();
			//공란 경고창 기입예정
		}
		Map<String,Object> member=new HashMap<String,Object>();
		member.put("id",vo.getId());
		member.put("pass",vo.getPass());
		member.put("levels",vo.getLevels());
		model.addAttribute("login", vo);
		return "redirect:/PcReview/SinglePartReview";
	}
}