package com.sandro.carcatalogservice.model;

public class RatingData {

	public int year;
	public int brandId;
	public int modelId;
	public int userId;
	public int rating;
	
	// Constructors
	
	public RatingData() {
		super();
	}

	public RatingData(int year, int brandId, int modelId, int userId, int rating) {
		super();
		this.year = year;
		this.brandId = brandId;
		this.modelId = modelId;
		this.userId = userId;
		this.rating = rating;
	}

	// Getters/Setters
	
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

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public int getRating() {
		return rating;
	}

	public void setRating(int rating) {
		this.rating = rating;
	}
	
	
}
