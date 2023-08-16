package com.example.eGarageBackend;

import java.util.List;

public interface BatteryCategoryService {
    List<BatteryCategory> getAllBatteryCategories();

    BatteryCategory getBatteryCategoryById(Long id);

    BatteryCategory createBatteryCategory(BatteryCategory batteryCategory);

    BatteryCategory updateBatteryCategory(Long id, BatteryCategory batteryCategory);

    void deleteBatteryCategory(Long id);
}
