package kgw.PcReview.web.Service;

import org.springframework.beans.factory.annotation.Autowired;

import kgw.PcReview.web.Dao.MemberDao;
import kgw.PcReview.web.Vo.MemberVo;

public class MemberLoginServiceImpl implements MemberLoginService {
	@Autowired
	private MemberDao MemberDao;
	@Override
	public MemberVo checklogin() {
		MemberVo member=MemberDao.checklogin();
		return member;
	}
	@Override
	public MemberVo insertlogin() {
		MemberVo member=MemberDao.insertlogin();
		return member;
	}
	@Override
	public MemberVo updatelogin() {
		MemberVo member=MemberDao.updatelogin();
		return member;
	}
	@Override
	public MemberVo deletelogin() {
		MemberVo member=MemberDao.deletelogin();
		return member;
	}
}
