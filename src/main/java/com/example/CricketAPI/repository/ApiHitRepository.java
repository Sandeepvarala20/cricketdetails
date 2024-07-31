package com.example.CricketAPI.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.CricketAPI.entity.ApiHits;

public interface ApiHitRepository extends JpaRepository<ApiHits, Long> {
    ApiHits findByApiName(String apiName);
}
