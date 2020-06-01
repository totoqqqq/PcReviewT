package kgw.PcReview.web.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import kgw.PcReview.web.Service.MemberLoginServiceImpl;
import kgw.PcReview.web.Vo.MemberVo;
@Controller
public class LoginController {
	@Autowired
	MemberLoginServiceImpl MemberLoginServiceImpl;
	@RequestMapping("/login")
	public String login() {
		return "login";
	}
	@RequestMapping(value="/loginAction", method=RequestMethod.POST)
	public String loginAction(@ModelAttribute(value = "loginAction") MemberVo vo, Model model) {
		if(vo.getId().toString().replace(" ","").equals("")||vo.getId().equals(null)||vo.getPass().toString().replace(" ","").equals("")||vo.getPass().equals(null)) {
			return login();
			//공란 경고창 기입예정
		}
		vo=MemberLoginServiceImpl.checklogin(vo.getId(),vo.getPass());
		System.out.println(vo.getId()+vo.getPass()+vo.getLevels());
		return "loginAction";
	}
}