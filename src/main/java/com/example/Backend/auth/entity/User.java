package com.example.Backend.analytics;

import java.time.LocalDateTime;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Analytics {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long reportId; // [cite: 75]
    private Double productionEfficiency; // [cite: 76]
    private Double downtime; // [cite: 76]
    private LocalDateTime generatedDate; // [cite: 77]
}