package kgw.PcReview.web.Controller;

import org.springframework.stereotype.Controller;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;

//@CrossOrigin
//@RestController
@Controller
public class LoginController {
	@RequestMapping("/login")
	public String login() {
		return "login";
	}
}