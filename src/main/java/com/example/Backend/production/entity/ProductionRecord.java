package com.example.Backend.production.entity;

import jakarta.persistence.*;
import java.time.LocalDate;
import java.time.LocalDateTime;

@Entity
@Table(name = "production_records",
       indexes = {
           @Index(columnList = "asset_id, productionDate"),
           @Index(columnList = "plan_id")
       })
public class ProductionRecord {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long recordId;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "plan_id")
    private ProductionPlan productionPlan;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "asset_id")
    private Asset asset;

    private Double actualVolume;
    private LocalDate productionDate;
    private LocalDateTime createdAt = LocalDateTime.now();

    // getters & setters
}
