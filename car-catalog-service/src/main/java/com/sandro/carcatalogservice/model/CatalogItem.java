package com.sandro.carcatalogservice.model;

public class CatalogItem {

	public int carId;
	public String description;
	public int rating;

	
	public CatalogItem(int carId, String description, int rating) {
		super();
		this.carId = carId;
		this.description = description;
		this.rating = rating;
	}
	
	
	public int getCarId() {
		return carId;
	}
	public void setCarId(int carId) {
		this.carId = carId;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public int getRating() {
		return rating;
	}
	public void setRating(int rating) {
		this.rating = rating;
	}
		
	
}
