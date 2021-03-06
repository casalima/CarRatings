package com.sandro.carcatalogservice.model;

import java.util.ArrayList;
import java.util.List;

public class RatingDataList {
	
	private List<RatingData> ratings;

	// Constructors
	
	public RatingDataList() {
		this.ratings = new ArrayList<RatingData>();
	}

	public RatingDataList(List<RatingData> ratings) {
		super();
		this.ratings = ratings;
	}

	// Getters/setters
	
	public List<RatingData> getRatings() {
		return ratings;
	}

	public void setRatings(List<RatingData> ratings) {
		this.ratings = ratings;
	}
	
}
