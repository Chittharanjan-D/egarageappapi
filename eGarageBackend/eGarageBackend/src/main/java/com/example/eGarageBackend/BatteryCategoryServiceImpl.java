package com.example.eGarageBackend;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BatteryCategoryServiceImpl implements BatteryCategoryService {

    @Autowired
    private BatteryCategoryRepository batteryCategoryRepository;

    @Override
    public List<BatteryCategory> getAllBatteryCategories() {
        return batteryCategoryRepository.findAll();
    }

    @Override
    public BatteryCategory getBatteryCategoryById(Long id) {
        return batteryCategoryRepository.findById(id).orElse(null);
    }

    @Override
    public BatteryCategory createBatteryCategory(BatteryCategory batteryCategory) {
        return batteryCategoryRepository.save(batteryCategory);
    }

    @Override
    public BatteryCategory updateBatteryCategory(Long id, BatteryCategory batteryCategory) {
        BatteryCategory existingCategory = batteryCategoryRepository.findById(id).orElse(null);
        if (existingCategory != null) {
            existingCategory.setBatteryCategory(batteryCategory.getBatteryCategory());
            return batteryCategoryRepository.save(existingCategory);
        }
        return null;
    }

    @Override
    public void deleteBatteryCategory(Long id) {
        batteryCategoryRepository.deleteById(id);
    }
}
