package com.example.Backend.production.service;

import com.example.Backend.production.entity.ProductionRecord;
import com.example.Backend.production.repository.ProductionRecordRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;

@Service
public class ProductionRecordService {

    @Autowired
    private ProductionRecordRepository repository;

    // CREATE
    public ProductionRecord saveRecord(ProductionRecord record) {
        return repository.save(record);
    }

    // READ ALL
    public List<ProductionRecord> getAllRecords() {
        return repository.findAll();
    }

    // READ BY ID
    public ProductionRecord getRecordById(Long id) {
        return repository.findById(id)
                .orElseThrow(() ->
                        new RuntimeException("Production record not found with id: " + id));
    }

    // UPDATE
    public ProductionRecord updateRecord(Long id, ProductionRecord updatedRecord) {

        return repository.findById(id).map(record -> {

            record.setProductionPlan(updatedRecord.getProductionPlan());
            record.setAsset(updatedRecord.getAsset());
            record.setActualVolume(updatedRecord.getActualVolume());
            record.setProductionDate(updatedRecord.getProductionDate());

            return repository.save(record);

        }).orElseThrow(() ->
                new RuntimeException("Production record not found with id: " + id));
    }

    // GET BY PLAN
    public List<ProductionRecord> getRecordsByPlan(Long planId) {
        return repository.findByProductionPlan_PlanId(planId);
    }

    // GET BY ASSET
    public List<ProductionRecord> getRecordsByAsset(Long assetId) {
        return repository.findByAsset_AssetId(assetId);
    }

    // GET BY ASSET + DATE
    public List<ProductionRecord> getRecordsByAssetAndDate(
            Long assetId, LocalDate date) {

        return repository.findByAsset_AssetIdAndProductionDate(assetId, date);
    }
}
