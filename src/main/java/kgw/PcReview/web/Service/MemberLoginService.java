package kgw.PcReview.web.Service;

import kgw.PcReview.web.Vo.MemberVo;

public interface MemberLoginService {
	MemberVo checklogin();
	MemberVo insertlogin();
	MemberVo updatelogin();
	MemberVo deletelogin();
}