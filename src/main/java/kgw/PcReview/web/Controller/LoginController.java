package kgw.PcReview.web.Controller;

import org.springframework.stereotype.Controller;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

//@CrossOrigin
//@RestController
@Controller
public class LoginController {
	@RequestMapping("/login")
	public String login() {
		return "login";
	}
	@RequestMapping(method=RequestMethod.POST, path="/loginAction")
	public String loginAction() {

		return "loginAction";
	}
}
//	@PostMapping("/loginAction")
//	public MemberVo postMapping(@RequestBody MemberVo memberVo) {
//		return memberVo;
//	}
//}