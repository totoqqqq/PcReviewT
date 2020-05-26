package kgw.PcReview.web.Dao;

import kgw.PcReview.web.Vo.MemberVo;

public interface MemberDao {
	MemberVo checklogin();
	MemberVo insertlogin();
	MemberVo updatelogin();
	MemberVo deletelogin();
}