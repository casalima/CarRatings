package com.sandro.carinfoservice.model;

public class Brand {

	public int brandId;
	public String desc;
	
	public Brand(int brandId, String desc) {
		super();
		this.brandId = brandId;
		this.desc = desc;
	}
	
	public int getBrandId() {
		return brandId;
	}
	public void setBrandId(int brandId) {
		this.brandId = brandId;
	}
	public String getDesc() {
		return desc;
	}
	public void setDesc(String desc) {
		this.desc = desc;
	}
	
	
}
