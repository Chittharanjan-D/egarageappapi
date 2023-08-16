package com.example.eGarageBackend;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BatteryTypeServiceImpl implements BatteryTypeService {

    @Autowired
    private BatteryTypeRepository batteryTypeRepository;

    @Override
    public List<BatteryType> getAllBatteryTypes() {
        return batteryTypeRepository.findAll();
    }

    @Override
    public BatteryType getBatteryTypeById(Long id) {
        return batteryTypeRepository.findById(id).orElse(null);
    }

    @Override
    public BatteryType createBatteryType(BatteryType batteryType) {
        return batteryTypeRepository.save(batteryType);
    }

    @Override
    public BatteryType updateBatteryType(Long id, BatteryType batteryType) {
        BatteryType existingType = batteryTypeRepository.findById(id).orElse(null);
        if (existingType != null) {
            existingType.setBatteryType(batteryType.getBatteryType());
            return batteryTypeRepository.save(existingType);
        }
        return null;
    }

    @Override
    public void deleteBatteryType(Long id) {
        batteryTypeRepository.deleteById(id);
    }

}
