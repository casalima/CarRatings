package com.sandro.ratingdataservice.resource;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sandro.ratingdataservice.model.RatingData;
import com.sandro.ratingdataservice.model.RatingDataList;

@RestController
@RequestMapping("/rating")
public class RatingDataController {

	@GetMapping("/byuser/{userId}")
	public RatingDataList getRatingDataByUser(@PathVariable int userId) {			// userId = 31
		
		System.out.println("In method getRatingDataByUser()    ");
		
		List<RatingData> ratings = Arrays.asList( 	new RatingData(2011, 11, 21, 31, 1),
													new RatingData(2012, 12, 22, 31, 2),
													new RatingData(2013, 13, 23, 31, 3),
													new RatingData(2014, 14, 24, 31, 4) );
		
		return new RatingDataList(ratings);
		
	}
	
}
