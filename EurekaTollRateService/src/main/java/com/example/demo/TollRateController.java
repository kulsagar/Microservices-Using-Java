package com.example.demo;

import java.math.BigDecimal;
import java.time.Instant;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TollRateController {

	@RequestMapping("/tollrate/{stationId}")
	public TollRate getTollRate(@PathVariable int stationId) {
				
		switch(stationId){
		case 1:
			return new TollRate(stationId, new BigDecimal("55.55"), Instant.now().toString());
		case 2:
			return new TollRate(stationId, new BigDecimal("1.05"), Instant.now().toString());
		case 3:
			return new TollRate(stationId, new BigDecimal("0.60"), Instant.now().toString());
		default:
			return  new TollRate(stationId, new BigDecimal("1.00"), Instant.now().toString());
		}
	}
	
}
