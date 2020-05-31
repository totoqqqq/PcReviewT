package kgw.PcReview.web.Dao;

import org.springframework.stereotype.Repository;

import kgw.PcReview.web.Vo.MemberVo;
@Repository
public interface MemberDao {
	MemberVo checklogin(String id, String password);
	MemberVo insertlogin();
	MemberVo updatelogin();
	MemberVo deletelogin();
}