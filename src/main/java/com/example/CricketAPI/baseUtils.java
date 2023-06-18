package com.example.CricketAPI;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;

public class baseUtils {
	
	public static String cricketHandler(Request request) {

		OkHttpClient client = new OkHttpClient();
        try {
            Response response = client.newCall(request).execute();
            String jsonResponse = response.body().string();

           System.out.println("API Response:\n"+jsonResponse);

            Gson gson = new GsonBuilder().setPrettyPrinting().create();
            String formattedJsonResponse = gson.toJson(gson.fromJson(jsonResponse, Object.class));

            System.out.println("Formatted API Response:\n" + formattedJsonResponse);
            return formattedJsonResponse;

         
        } catch (Exception e) {
            e.printStackTrace();
        }
		return null;
		
    
	}
}
