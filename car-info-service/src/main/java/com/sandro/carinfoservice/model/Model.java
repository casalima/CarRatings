package com.sandro.carinfoservice.model;

public class Model {

	public int modelId;
	public int brandId;
	public String modelDesc;
	
	public Model(int modelId, int brandId, String modelDesc) {
		super();
		this.modelId = modelId;
		this.brandId = brandId;
		this.modelDesc = modelDesc;
	}
	
	public int getModelId() {
		return modelId;
	}
	public void setModelId(int modelId) {
		this.modelId = modelId;
	}
	public int getBrandId() {
		return brandId;
	}
	public void setBrandId(int brandId) {
		this.brandId = brandId;
	}
	public String getModelDesc() {
		return modelDesc;
	}
	public void setModelDesc(String modelDesc) {
		this.modelDesc = modelDesc;
	}
	
	
	
}
