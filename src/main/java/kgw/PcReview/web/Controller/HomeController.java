package kgw.PcReview.web.Controller;

import org.springframework.stereotype.Controller;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;

//import kgw.PcReviewService.MemberLoginService;

//@CrossOrigin
//@RestController
@Controller
public class HomeController {
//	@Autowired
//	MemberLoginService MemberLoginService;
	@RequestMapping("index")
	public String home() {		
		return "index";
	}
	@RequestMapping("/pcReviewForWeb")
	public String forWeb() {
		return "pcReviewForWeb";
	}
	@RequestMapping("/pcReviewForPC")
	public String forPC() {
		return "pcReviewForPC";
	}
	@RequestMapping("/resume")
	public String resume() {
		return "resume";
	}
}

