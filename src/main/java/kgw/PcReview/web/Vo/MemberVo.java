package kgw.PcReview.web.Vo;

import lombok.Data;

@Data
public class MemberVo {
	private String id;
	private String pass;
	private int levels;
	public MemberVo() {
		
	}
	public MemberVo(String id,String pass,int levels){
		this.id=id;
		this.pass=pass;
		this.levels=levels;
	}
}