package com.example.CricketAPI.controller;

import com.example.CricketAPI.service.HitService;
import com.example.CricketAPI.utils.cricketUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class cricketController extends cricketUtils {

    private HitService hitService;

    public cricketController(HitService hitService) {
        this.hitService = hitService;
    }

    @GetMapping("/getdetails")
    public String Handler() {

        hitService.recordHit("getdetails");
        return getMatchesDetails();

    }
	@GetMapping("/getSeriesDetails")
    public String SeriesHandler() {

        hitService.recordHit("getSeriesDetails");
        return getSeriesDetails();
    }


}
