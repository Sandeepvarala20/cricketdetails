package com.example.CricketAPI;

import org.springframework.web.bind.annotation.GetMapping;

public class weatherReportController extends weatherUtil{
	
	@GetMapping("/getSeriesDetails")
    public String weatherReport() {
		return "test";
    }
	
	
}
