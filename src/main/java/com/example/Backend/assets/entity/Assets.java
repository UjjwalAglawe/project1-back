package com.example.petromanage.assets.entity;

import jakarta.persistence.*;
import java.time.LocalDate;
import java.time.LocalDateTime;

@Entity
@Table(name = "assets")
public class Asset {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long assetId;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "site_id")
    private Site site;

    private String name;

    @Enumerated(EnumType.STRING)
    private AssetType assetType;

    private String location;

    @Enumerated(EnumType.STRING)
    private AssetStatus status;

    private LocalDate commissionedDate;
    private LocalDateTime createdAt = LocalDateTime.now();

    // getters & setters
}
