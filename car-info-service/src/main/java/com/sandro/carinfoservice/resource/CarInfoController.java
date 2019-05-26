package com.sandro.carinfoservice.resource;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.sandro.carinfoservice.model.CarInfo;

@RestController
public class CarInfoController {

	@GetMapping(value="/CarDesc/{carId}")
	public String getCarDesc(@PathVariable int carId) {
		
		return "2015 Mazda CX-5";
		
	}
	
	// scardenas : More detailed way to do variable mapping
	//@GetMapping(value="/CarInfo/{someCarId}")
	//public CarInfo getCarInfo(@PathVariable(name="someCarId") int carId) {
	
	@GetMapping(value="/CarInfo/{carId}")
	public CarInfo getCarInfo(@PathVariable int carId) {
		
		return new CarInfo(1, 2015, 11, 21, "2015 Mazda CX-5");
		
	}

	
}
