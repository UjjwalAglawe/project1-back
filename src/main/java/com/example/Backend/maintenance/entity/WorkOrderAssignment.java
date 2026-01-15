package com.example.Backend.maintenance.entity;

import jakarta.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name = "work_order_assignments")
public class WorkOrderAssignment {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "work_order_id")
    private WorkOrder workOrder;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "technician_id")
    private Technician technician;

    private LocalDate assignedDate;

    // getters & setters
}
