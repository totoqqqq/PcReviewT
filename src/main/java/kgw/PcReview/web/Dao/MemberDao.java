package kgw.PcReview.web.Dao;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import kgw.PcReview.web.Vo.MemberVo;
@Repository
@Mapper
public interface MemberDao {
	public MemberVo checklogin(String id, String pass);
	public MemberVo check(String id);
	void insertlogin(String id, String pass, int levels);
	void updatelogin(String id, String pass, int levels);
	void deletelogin(String id, String pass);
}