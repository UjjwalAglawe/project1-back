package com.example.Backend.production;

import java.time.LocalDate;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class ProductionRecord {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long recordId; //[cite: 43]
    private Long assetId; //[cite: 44]
    private Double actualVolume; //[cite: 45]
    private LocalDate date; //[cite: 46]
}
