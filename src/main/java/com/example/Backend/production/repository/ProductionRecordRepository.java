package com.example.Backend.production.repository;

import com.example.Backend.production.entity.ProductionRecord;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.time.LocalDate;
import java.util.List;

@Repository
public interface ProductionRecordRepository extends JpaRepository<ProductionRecord, Long> {

    
    List<ProductionRecord> findByProductionPlan_PlanId(Long planId);

    
    List<ProductionRecord> findByAsset_AssetId(Long assetId);

    
    List<ProductionRecord> findByAsset_AssetIdAndProductionDate(Long assetId, LocalDate productionDate);
}
