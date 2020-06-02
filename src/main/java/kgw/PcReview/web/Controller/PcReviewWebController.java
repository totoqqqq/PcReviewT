package kgw.PcReview.web.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.SessionAttributes;

import kgw.PcReview.web.Vo.MemberVo;
@Controller
@RequestMapping("/PcReview")
@SessionAttributes("login")
public class PcReviewWebController {
	@RequestMapping("/SinglePartReview")
	public String SingPartHome(Model model){
		MemberVo member=(MemberVo) model.getAttribute("login");
		return "SinglePartHome";
	}
}