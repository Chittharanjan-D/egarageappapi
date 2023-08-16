package com.example.eGarageBackend;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/battery_Oem")
public class BatteryOEMController {

    @Autowired
    private BatteryOEMService batteryOEMService;

    @GetMapping
    public ResponseEntity<List<BatteryOEM>> getAllBatteryOEMs() {
        List<BatteryOEM> batteryOEMs = batteryOEMService.getAllBatteryOEMs();
        return ResponseEntity.ok(batteryOEMs);
    }

    @GetMapping("/{id}")
    public ResponseEntity<BatteryOEM> getBatteryOEMById(@PathVariable Long id) {
        BatteryOEM batteryOEM = batteryOEMService.getBatteryOEMById(id);
        if (batteryOEM != null) {
            return ResponseEntity.ok(batteryOEM);
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    @PostMapping
    public ResponseEntity<BatteryOEM> createBatteryOEM(@RequestBody BatteryOEM batteryOEM) {
        BatteryOEM createdOEM = batteryOEMService.createBatteryOEM(batteryOEM);
        return ResponseEntity.ok(createdOEM);
    }

    @PutMapping("/{id}")
    public ResponseEntity<BatteryOEM> updateBatteryOEM(@PathVariable Long id, @RequestBody BatteryOEM batteryOEM) {
        BatteryOEM updatedOEM = batteryOEMService.updateBatteryOEM(id, batteryOEM);
        if (updatedOEM != null) {
            return ResponseEntity.ok(updatedOEM);
        } else {
            return ResponseEntity.notFound().build();
        }
    }
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteBatteryOEM(@PathVariable Long id) {
        batteryOEMService.deleteBatteryOEM(id);
        return ResponseEntity.noContent().build();
    }

}
