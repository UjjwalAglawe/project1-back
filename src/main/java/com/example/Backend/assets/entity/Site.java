package com.example.Backend.assets.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDateTime;
import java.util.List;

@Entity
@Data
@Table(name = "sites")
public class Site {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long siteId;

    private String name;
    private String location;
    private String country;
    private String status;

    private LocalDateTime createdAt = LocalDateTime.now();

    @OneToMany(mappedBy = "site", fetch = FetchType.LAZY)
    private List<Asset> assets;

    // getters & setters
}
