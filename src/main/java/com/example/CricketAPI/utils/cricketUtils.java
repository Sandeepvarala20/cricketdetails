package com.example.CricketAPI.utils;

import com.example.CricketAPI.utils.util;
import okhttp3.Request;

public class cricketUtils extends util {
	
private static final String API_KEY = "5c8d10a2-bf43-4e95-940b-d7d50ac162cc";
	
	public static String getMatchesDetails() {

       
        String url = "https://api.cricapi.com/v1/currentMatches?apikey=5c8d10a2-bf43-4e95-940b-d7d50ac162cc&offset=0" + API_KEY;

        Request request = new Request.Builder().url(url).build();
		return cricketHandler(request);		
	}
	public static String getSeriesDetails() {
 
	        String url = "https://api.cricapi.com/v1/series?apikey=5c8d10a2-bf43-4e95-940b-d7d50ac162cc&offset=0" + API_KEY;

	        Request request = new Request.Builder().url(url).build();
			return cricketHandler(request);		
    
	}


}
