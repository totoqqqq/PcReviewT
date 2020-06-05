package kgw.PcReview.web.Service;

import kgw.PcReview.web.Vo.PartinfoVo;
public interface PartinfoService {
	public PartinfoVo searchPart(String parttype, String partname);
	public PartinfoVo searchPartAll(String parttype);
	void insertPart(String parttype, String partname, String maker, String info1, String info2, String info3, String info4);
	void updatePart(String parttype, String partname, String maker, String info1, String info2, String info3, String info4);
	void deletePart(String parttype, String partname);
}