package com.example.Backend.assets;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Assets {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
   private Long assetId;// [cite: 25]
    private String name;// [cite: 26]
    private String type; // RIG, PIPELINE, STORAGE [cite: 27]
    private String location;// [cite: 28]
    private String status; //[cite: 29]
}

