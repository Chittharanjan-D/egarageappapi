package com.example.eGarageBackend;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BatteryOEMServiceImpl implements BatteryOEMService {

    @Autowired
    private BatteryOEMRepository batteryOEMRepository;

    @Override
    public List<BatteryOEM> getAllBatteryOEMs() {
        return batteryOEMRepository.findAll();
    }

    @Override
    public BatteryOEM getBatteryOEMById(Long id) {
        return batteryOEMRepository.findById(id).orElse(null);
    }

    @Override
    public BatteryOEM createBatteryOEM(BatteryOEM batteryOEM) {
        return batteryOEMRepository.save(batteryOEM);
    }

    @Override
    public BatteryOEM updateBatteryOEM(Long id, BatteryOEM batteryOEM) {
        BatteryOEM existingOEM = batteryOEMRepository.findById(id).orElse(null);
        if (existingOEM != null) {
            existingOEM.setBatteryOEM(batteryOEM.getBatteryOEM());
            return batteryOEMRepository.save(existingOEM);
        }
        return null;
    }

    @Override
    public void deleteBatteryOEM(Long id) {
        batteryOEMRepository.deleteById(id);
    }
}
