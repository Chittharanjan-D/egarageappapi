package com.example.eGarageBackend;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/battery_categories")
public class BatteryCategoryController {

    @Autowired
    private BatteryCategoryService batteryCategoryService;

    @GetMapping
    public ResponseEntity<List<BatteryCategory>> getAllBatteryCategories() {
        List<BatteryCategory> batteryCategories = batteryCategoryService.getAllBatteryCategories();
        return ResponseEntity.ok(batteryCategories);
    }

    @GetMapping("/{id}")
    public ResponseEntity<BatteryCategory> getBatteryCategoryById(@PathVariable Long id) {
        BatteryCategory batteryCategory = batteryCategoryService.getBatteryCategoryById(id);
        if (batteryCategory != null) {
            return ResponseEntity.ok(batteryCategory);
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    @PostMapping
    public ResponseEntity<BatteryCategory> createBatteryCategory(@RequestBody BatteryCategory batteryCategory) {
        BatteryCategory createdCategory = batteryCategoryService.createBatteryCategory(batteryCategory);
        return ResponseEntity.ok(createdCategory);
    }

    @PutMapping("/{id}")
    public ResponseEntity<BatteryCategory> updateBatteryCategory(@PathVariable Long id, @RequestBody BatteryCategory batteryCategory) {
        BatteryCategory updatedCategory = batteryCategoryService.updateBatteryCategory(id, batteryCategory);
        if (updatedCategory != null) {
            return ResponseEntity.ok(updatedCategory);
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteBatteryCategory(@PathVariable Long id) {
        batteryCategoryService.deleteBatteryCategory(id);
        return ResponseEntity.noContent().build();
    }
}
