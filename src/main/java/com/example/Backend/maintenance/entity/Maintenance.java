package com.example.Backend.maintenance;

import java.time.LocalDate;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Maintenance {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long workOrderId; //[cite: 54]
    private Long assetId;// [cite: 55]
    private String description;// [cite: 56]
    private LocalDate scheduledDate;// [cite: 57]
    private String status; // OPEN, IN_PROGRESS, COMPLETED [cite: 58]
}
