package com.example.eGarageBackend;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/battery_type")
public class BatteryTypeController {

    @Autowired
    private BatteryTypeService batteryTypeService;

    @GetMapping
    public ResponseEntity<List<BatteryType>> getAllBatteryTypes() {
        List<BatteryType> batteryTypes = batteryTypeService.getAllBatteryTypes();
        return ResponseEntity.ok(batteryTypes);
    }

    @GetMapping("/{id}")
    public ResponseEntity<BatteryType> getBatteryTypeById(@PathVariable Long id) {
        BatteryType batteryType = batteryTypeService.getBatteryTypeById(id);
        if (batteryType != null) {
            return ResponseEntity.ok(batteryType);
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    @PostMapping
    public ResponseEntity<BatteryType> createBatteryType(@RequestBody BatteryType batteryType) {
        BatteryType createdType = batteryTypeService.createBatteryType(batteryType);
        return ResponseEntity.ok(createdType);
    }

    @PutMapping("/{id}")
    public ResponseEntity<BatteryType> updateBatteryType(@PathVariable Long id, @RequestBody BatteryType batteryType) {
        BatteryType updatedType = batteryTypeService.updateBatteryType(id, batteryType);
        if (updatedType != null) {
            return ResponseEntity.ok(updatedType);
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteBatteryType(@PathVariable Long id) {
        batteryTypeService. deleteBatteryType(id);
        return ResponseEntity.noContent().build();
    }

}
