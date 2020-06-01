package kgw.PcReview.web.Service;

import kgw.PcReview.web.Vo.MemberVo;
public interface MemberLoginService {
	public MemberVo checklogin(String id, String password);
	public void insertlogin(String id, String password,int levels);
	public void updatelogin(String id, String password,int levels);
	public void deletelogin(String id, String password);
}