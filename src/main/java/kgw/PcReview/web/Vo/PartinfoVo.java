package kgw.PcReview.web.Vo;

import lombok.Data;

@Data
public class PartinfoVo {
	private String parttype;
	private String partname;
	private String maker;
	private String info1;
	private String info2;
	private String info3;
	private String info4;
	public PartinfoVo() {
		
	}
	public PartinfoVo(String parttype,String partname,String maker,String info1,String info2,String info3,String info4){
		this.parttype=parttype;
		this.partname=partname;
		this.maker=maker;
		this.info1=info1;
		this.info2=info2;
		this.info3=info3;
		this.info4=info4;
	}
}