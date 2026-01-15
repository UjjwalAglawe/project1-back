package com.example.petromanage.maintenance.entity;

import jakarta.persistence.*;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;

@Entity
@Table(name = "work_orders")
public class WorkOrder {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long workOrderId;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "asset_id")
    private Asset asset;

    private String description;

    @Enumerated(EnumType.STRING)
    private MaintenanceType maintenanceType;

    private LocalDate scheduledDate;
    private LocalDate completedDate;

    @Enumerated(EnumType.STRING)
    private WorkOrderStatus status;

    private LocalDateTime createdAt = LocalDateTime.now();

    @OneToMany(mappedBy = "workOrder", fetch = FetchType.LAZY)
    private List<WorkOrderAssignment> assignments;

    // getters & setters
}
