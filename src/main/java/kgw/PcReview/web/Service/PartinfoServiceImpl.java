package kgw.PcReview.web.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kgw.PcReview.web.Dao.MemberDao;
import kgw.PcReview.web.Dao.PartinfoDao;
import kgw.PcReview.web.Vo.MemberVo;
import kgw.PcReview.web.Vo.PartinfoVo;
@Service
public class PartinfoServiceImpl implements PartinfoService {
	@Autowired
	private PartinfoDao PartinfoDao;
	@Override
	public PartinfoVo searchPart(String parttype, String partname) {
		try {
		return PartinfoDao.searchPart(parttype, partname);
		}
		catch(NullPointerException e) {
			return null;
		}
	}
	@Override
	public PartinfoVo searchPartAll(String parttype) {
		try {
		return PartinfoDao.searchPartAll(parttype);
		}
		catch(NullPointerException e) {
			return null;
		}
	}

	@Override
	public void insertPart(String parttype, String partname, String maker, String info1, String info2, String info3, String info4) {
		PartinfoDao.insertPart(parttype, partname, maker, info1, info2, info3, info4);
	}
	@Override
	public void updatePart(String parttype, String partname, String maker, String info1, String info2, String info3, String info4) {
		PartinfoDao.updatePart(parttype, partname, maker, info1, info2, info3, info4);
	}
	@Override
	public void deletePart(String parttype, String partname) {
		PartinfoDao.deletePart(parttype, partname);
	}
}
