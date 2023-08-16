package com.example.eGarageBackend;

import java.util.List;

public interface BatteryOEMService {

    List<BatteryOEM> getAllBatteryOEMs();

    BatteryOEM getBatteryOEMById(Long id);

    BatteryOEM createBatteryOEM(BatteryOEM batteryOEM);

    BatteryOEM updateBatteryOEM(Long id, BatteryOEM batteryOEM);

    void deleteBatteryOEM(Long id);
}
