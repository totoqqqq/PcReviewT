package kgw.PcReview.web.Vo;

import lombok.Data;

@Data
public class PcestimateVo {
	private String id;
	private String name;
	private String inputdates;
	private String updatedates;
	private String cpu;
	private String mb;
	private String gpu;
	private String ram;
	private String ssd;
	private String hdd;
	public PcestimateVo() {
		
	}
	public PcestimateVo(String id,String name,String inputdates,String updatedates,String cpu,String mb,String gpu,String ram,String ssd,String hdd) {
		this.id=id;
		this.name=name;
		this.inputdates=inputdates;
		this.updatedates=updatedates;
		this.cpu=cpu;
		this.mb=mb;
		this.gpu=gpu;
		this.ram=ram;
		this.ssd=ssd;
		this.hdd=hdd;
	}
}