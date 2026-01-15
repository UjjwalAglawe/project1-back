package com.example.Backend.compliance;

import java.time.LocalDateTime;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Compliance {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long reportId; // [cite: 65]
    private Long assetId; // [cite: 66]
    private Integer safetyScore; // [cite: 67]
    private String complianceStatus; // [cite: 67]
    private LocalDateTime generatedDate; // [cite: 67]
}
