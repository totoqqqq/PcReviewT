package kgw.PcReview.web.Service;

import kgw.PcReview.web.Vo.MemberVo;

public interface MemberLoginService {
	public MemberVo checklogin(String id, String password);
	public void  insertlogin();
	public void  updatelogin();
	public void  deletelogin();
}