package com.sandro.carinfoservice.model;

public class CarInfo {

	public int carId;
	public int year;
	public int brandId;
	public int modelId;
	public String notes;
	
	public CarInfo(int carId, int year, int brandId, int modelId, String notes) {
		super();
		this.carId = carId;
		this.year = year;
		this.brandId = brandId;
		this.modelId = modelId;
		this.notes = notes;
	}
	
	public int getCarId() {
		return carId;
	}
	public void setCarId(int carId) {
		this.carId = carId;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	public int getBrandId() {
		return brandId;
	}
	public void setBrandId(int brandId) {
		this.brandId = brandId;
	}
	public int getModelId() {
		return modelId;
	}
	public void setModelId(int modelId) {
		this.modelId = modelId;
	}
	public String getNotes() {
		return notes;
	}
	public void setNotes(String notes) {
		this.notes = notes;
	}
	
	
	
	
	
}
