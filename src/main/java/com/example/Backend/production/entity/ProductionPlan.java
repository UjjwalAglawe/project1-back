package com.example.Backend.production;

import java.time.LocalDate;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class ProductionPlan {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long planId; //[cite: 37]
    private Long assetId; //[cite: 38]
    private Double plannedVolume;// [cite: 39]
    private LocalDate startDate;// [cite: 40]
    private LocalDate endDate;// [cite: 41]
}

