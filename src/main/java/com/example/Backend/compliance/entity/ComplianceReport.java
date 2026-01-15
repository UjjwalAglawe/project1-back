package com.example.Backend.compliance.entity;

import jakarta.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name = "compliance_reports")
public class ComplianceReport {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long reportId;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "asset_id")
    private Asset asset;

    private Integer safetyScore;

    @Enumerated(EnumType.STRING)
    private ComplianceStatus complianceStatus;

    private String remarks;
    private LocalDate generatedDate;

    // getters & setters
}
