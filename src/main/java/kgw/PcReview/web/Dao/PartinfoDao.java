package kgw.PcReview.web.Dao;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import kgw.PcReview.web.Vo.PartinfoVo;
@Repository
@Mapper
public interface PartinfoDao {
	public PartinfoVo searchPart(String parttype, String partname);
	public PartinfoVo searchPartAll(String parttype);
	void insertPart(String parttype, String partname, String maker, String info1, String info2, String info3, String info4);
	void updatePart(String parttype, String partname, String maker, String info1, String info2, String info3, String info4);
	void deletePart(String parttype, String partname);
}