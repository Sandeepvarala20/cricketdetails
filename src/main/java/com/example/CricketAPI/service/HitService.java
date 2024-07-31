package com.example.CricketAPI.service;

import com.example.CricketAPI.entity.ApiHits;
import com.example.CricketAPI.repository.ApiHitRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class HitService {
    @Autowired
    private ApiHitRepository apiHitRepository;

    public String recordHit(String apiName) {
        ApiHits apiHits = apiHitRepository.findByApiName(apiName);
        if (apiHits == null) {
            apiHits = new ApiHits();
            apiHits.setApiName(apiName);
            apiHits.setHitCount(1);
        } else {
            apiHits.setHitCount(apiHits.getHitCount() + 1);
        }
        apiHitRepository.save(apiHits);
        return "Hit count for " + apiName + " is now " + apiHits.getHitCount();
    }
}

