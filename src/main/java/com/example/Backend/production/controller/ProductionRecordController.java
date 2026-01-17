package com.example.Backend.production.controller;

import com.example.Backend.production.entity.ProductionRecord;
import com.example.Backend.production.service.ProductionRecordService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
import java.util.List;

@RestController
@RequestMapping("/api/production-records")
public class ProductionRecordController {

    @Autowired
    private ProductionRecordService service;

    
    @PostMapping
    public ProductionRecord createRecord(@RequestBody ProductionRecord record) {
        return service.saveRecord(record);
    }

    // READ ALL
    @GetMapping
    public List<ProductionRecord> getAllRecords() {
        return service.getAllRecords();
    }

    // READ BY ID
    @GetMapping("/{id}")
    public ProductionRecord getRecordById(@PathVariable Long id) {
        return service.getRecordById(id);
    }

    // UPDATE
    @PutMapping("/{id}")
    public ProductionRecord updateRecord(
            @PathVariable Long id,
            @RequestBody ProductionRecord record) {

        return service.updateRecord(id, record);
    }

    // GET BY PLAN
    @GetMapping("/plan/{planId}")
    public List<ProductionRecord> getByPlan(@PathVariable Long planId) {
        return service.getRecordsByPlan(planId);
    }

    // GET BY ASSET
    @GetMapping("/asset/{assetId}")
    public List<ProductionRecord> getByAsset(@PathVariable Long assetId) {
        return service.getRecordsByAsset(assetId);
    }

    // GET BY ASSET + DATE
    @GetMapping("/asset/{assetId}/date/{date}")
    public List<ProductionRecord> getByAssetAndDate(
            @PathVariable Long assetId,
            @PathVariable String date) {

        return service.getRecordsByAssetAndDate(
                assetId, LocalDate.parse(date)
        );
    }
}
