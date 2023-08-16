package com.example.eGarageBackend;

import java.util.List;

public interface BatteryTypeService {

    List<BatteryType> getAllBatteryTypes();

    BatteryType getBatteryTypeById(Long id);

    BatteryType createBatteryType(BatteryType batteryType);

    BatteryType updateBatteryType(Long id, BatteryType batteryType);

    void deleteBatteryType(Long id);
}
