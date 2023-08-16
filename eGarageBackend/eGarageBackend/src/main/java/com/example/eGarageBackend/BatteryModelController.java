package com.example.eGarageBackend;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/battery_models")
public class BatteryModelController {

    private final BatteryModelService batteryModelService;

    @Autowired
    public BatteryModelController(BatteryModelService batteryModelService) {
        this.batteryModelService = batteryModelService;
    }

    @GetMapping
    public ResponseEntity<List<BatteryModel>> getAllBatteryModels() {
        List<BatteryModel> batteryModels = batteryModelService.getAllBatteryModels();
        return new ResponseEntity<>(batteryModels, HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<BatteryModel> getBatteryModelById(@PathVariable Long id) {
        BatteryModel batteryModel = batteryModelService.getBatteryModelById(id);
        if (batteryModel != null) {
            return new ResponseEntity<>(batteryModel, HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    @PostMapping
    public ResponseEntity<BatteryModel> createBatteryModel(@RequestBody BatteryModel batteryModel) {
        BatteryModel createdBatteryModel = batteryModelService.createBatteryModel(batteryModel);
        return new ResponseEntity<>(createdBatteryModel, HttpStatus.CREATED);
    }

    @PutMapping("/{id}")
    public ResponseEntity<BatteryModel> updateBatteryModel(@PathVariable Long id, @RequestBody BatteryModel batteryModel) {
        BatteryModel updatedBatteryModel = batteryModelService.updateBatteryModel(id, batteryModel);
        if (updatedBatteryModel != null) {
            return new ResponseEntity<>(updatedBatteryModel, HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteBatteryModel(@PathVariable Long id) {
        batteryModelService.deleteBatteryModel(id);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }
}
