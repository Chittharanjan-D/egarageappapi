package com.example.eGarageBackend;

import java.util.List;

public interface BatteryModelService {

    List<BatteryModel> getAllBatteryModels();
    BatteryModel getBatteryModelById(Long id);
    BatteryModel createBatteryModel(BatteryModel batteryModel);
    BatteryModel updateBatteryModel(Long id, BatteryModel batteryModel);
    void deleteBatteryModel(Long id);
}
