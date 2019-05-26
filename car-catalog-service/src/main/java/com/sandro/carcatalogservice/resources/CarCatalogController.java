package com.sandro.carcatalogservice.resources;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.sandro.carcatalogservice.model.CarInfo;
import com.sandro.carcatalogservice.model.CatalogItem;
import com.sandro.carcatalogservice.model.RatingData;
import com.sandro.carcatalogservice.model.RatingDataList;

@RestController
@RequestMapping("/catalog")
public class CarCatalogController {

	@GetMapping(value="/message/{userId}")
	public String getMessage(@PathVariable("userId") String userId) {
		return "some message";
	}
	
	@GetMapping(value="/user/{userId}")
	public List<CatalogItem> getCatalogByUser(@PathVariable("userId") String userId) {
		
		System.out.println("In method getCatalogByUser()");


		
//		List<RatingData> ratings = Arrays.asList(new RatingData(2000, 11, 21, 31, 1),
//												 new RatingData(2000, 12, 22, 31, 2), 
//												 new RatingData(2000, 13, 23, 31, 3), 
//												 new RatingData(2000, 14, 24, 31, 4) );
		
		// Contact Ratings service
		RestTemplate templateRatings = new RestTemplate();
		RatingDataList ratings = templateRatings.getForObject("http://localhost:8083/rating/byuser/{userId}", RatingDataList.class, 31);
		
		// For each rating, contact CarInfo service
		List<CatalogItem> catalog = new ArrayList<CatalogItem>(); 
		RestTemplate templateCarInfo = new RestTemplate();
		for (RatingData rating : ratings.getRatings()) {
			System.out.println("checking values on CarInfo service");
			String carDesc = templateCarInfo.getForObject("http://localhost:8082/CarDesc/{carId}", String.class, rating.brandId);
			catalog.add( new CatalogItem(0, carDesc, rating.rating) );
		}
		//return Collections.singletonList(new CatalogItem(1, "2015 Mazda CX-5", 5));
		return catalog;
	}
}
