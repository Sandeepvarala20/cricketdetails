package com.example.CricketAPI.controller;

import com.example.CricketAPI.service.HitService;
import com.example.CricketAPI.utils.weatherUtil;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class weatherReportController extends weatherUtil {

	private HitService hitService;
	 private static final String[] cities = {"Bangalore", "Delhi", "kolkata", "Mumbai", "Hyderabad"};

    public weatherReportController(HitService hitService) {
        this.hitService = hitService;
    }


    @GetMapping("/getweatherreport")
	    public String getWeather() {
			hitService.recordHit("getweatherreport");
	        StringBuilder result = new StringBuilder();
	        for (String city : cities) {
	            String weatherReport = getWeatherReport(city);
	            result.append(weatherReport).append(System.lineSeparator());
	        }
	        return result.toString();
	    }
	
}
 