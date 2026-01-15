package com.example.petromanage.analytics.entity;

import jakarta.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name = "analytics_reports")
public class AnalyticsReport {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long reportId;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "asset_id")
    private Asset asset;

    private Double productionEfficiency;
    private Double downtimeHours;
    private LocalDate generatedDate;

    // getters & setters
}
