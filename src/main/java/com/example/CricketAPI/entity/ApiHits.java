package com.example.CricketAPI.entity;


import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
public class ApiHits {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String apiName;
    private int hitCount;

    // Getters and Setters
}
