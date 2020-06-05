package kgw.PcReview.web.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kgw.PcReview.web.Dao.MemberDao;
import kgw.PcReview.web.Vo.MemberVo;
@Service
public class MemberLoginServiceImpl implements MemberLoginService {
	@Autowired
	private MemberDao MemberDao;
	@Override
	public MemberVo checklogin(String id, String pass) {
		try {
		return MemberDao.checklogin(id,pass);
		}
		catch(NullPointerException e) {
			return null;
		}
	}
	@Override
	public MemberVo check(String id) {
		try {
		return MemberDao.check(id);
		}
		catch(NullPointerException e) {
			return null;
		}
	}
	@Override
	public void insertlogin(String id, String pass,int levels) {
		MemberDao.insertlogin(id,pass,levels);
	}
	@Override
	public void updatelogin(String id, String pass,int levels) {
		MemberDao.updatelogin(id,pass,levels);
	}
	@Override
	public void deletelogin(String id, String pass) {
		MemberDao.deletelogin(id,pass);
	}
}
