package com.example.CricketAPI;

import org.springframework.web.bind.annotation.GetMapping;

public class cricketController extends cricketUtils{
	
	@GetMapping("/getdetails.json")
    public String Handler() {
		return getMatchesDetails();
    }
	@GetMapping("/getSeriesDetails.json")
    public String SeriesHandler() {
		return getSeriesDetails();
    }
}
