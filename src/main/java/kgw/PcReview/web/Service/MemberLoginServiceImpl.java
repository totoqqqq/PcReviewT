package kgw.PcReview.web.Service;

import org.springframework.beans.factory.annotation.Autowired;

import kgw.PcReview.web.Dao.MemberDao;
import kgw.PcReview.web.Vo.MemberVo;

public class MemberLoginServiceImpl implements MemberLoginService {
	@Autowired
	private MemberDao MemberDao;
	@Override
	public MemberVo checklogin(String id, String password) {
		MemberVo member=MemberDao.checklogin(id, password);
		return member;
	}
	@Override
	public void insertlogin() {
		MemberDao.insertlogin();
	}
	@Override
	public void updatelogin() {
		MemberDao.updatelogin();
	}
	@Override
	public void deletelogin() {
		MemberDao.deletelogin();
	}
}
