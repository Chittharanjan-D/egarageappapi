package com.example.eGarageBackend;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class BatteryModelServiceImpl implements BatteryModelService {

    private final BatteryModelRepository batteryModelRepository;
    @Autowired
    public BatteryModelServiceImpl(BatteryModelRepository batteryModelRepository) {
        this.batteryModelRepository = batteryModelRepository;
    }

    @Override
    public List<BatteryModel> getAllBatteryModels() {
        return batteryModelRepository.findAll();
    }

    @Override
    public BatteryModel getBatteryModelById(Long id) {
        Optional<BatteryModel> batteryModelOptional = batteryModelRepository.findById(id);
        return batteryModelOptional.orElse(null);
    }

    @Override
    public BatteryModel createBatteryModel(BatteryModel batteryModel) {
        return batteryModelRepository.save(batteryModel);
    }

    @Override
    public BatteryModel updateBatteryModel(Long id, BatteryModel updatedBatteryModel) {
        Optional<BatteryModel> batteryModelOptional = batteryModelRepository.findById(id);
        if (batteryModelOptional.isPresent()) {
            BatteryModel existingBatteryModel = batteryModelOptional.get();
            existingBatteryModel.setBatteryModel(updatedBatteryModel.getBatteryModel());
            existingBatteryModel.setBatteryCategoriesId(updatedBatteryModel.getBatteryCategoriesId());
            existingBatteryModel.setBatteryTypeId(updatedBatteryModel.getBatteryTypeId());
            existingBatteryModel.setBatteryOemId(updatedBatteryModel.getBatteryOemId());
            existingBatteryModel.setVoltage(updatedBatteryModel.getVoltage());
            existingBatteryModel.setAh(updatedBatteryModel.getAh());
            existingBatteryModel.setKwh(updatedBatteryModel.getKwh());
            existingBatteryModel.setWeight(updatedBatteryModel.getWeight());
            existingBatteryModel.setLithium(updatedBatteryModel.getLithium());
            existingBatteryModel.setNickel(updatedBatteryModel.getNickel());
            existingBatteryModel.setManganese(updatedBatteryModel.getManganese());
            existingBatteryModel.setCobalt(updatedBatteryModel.getCobalt());
            existingBatteryModel.setTitanium(updatedBatteryModel.getTitanium());
            existingBatteryModel.setCopper(updatedBatteryModel.getCopper());
            existingBatteryModel.setAluminium(updatedBatteryModel.getAluminium());
            existingBatteryModel.setIronSteel(updatedBatteryModel.getIronSteel());
            existingBatteryModel.setGraphite(updatedBatteryModel.getGraphite());
            existingBatteryModel.setZinc(updatedBatteryModel.getZinc());
            existingBatteryModel.setLeadMin(updatedBatteryModel.getLeadMin());
            existingBatteryModel.setLeadMax(updatedBatteryModel.getLeadMax());
            existingBatteryModel.setPhosphate(updatedBatteryModel.getPhosphate());
            existingBatteryModel.setElectrolyte(updatedBatteryModel.getElectrolyte());
            existingBatteryModel.setMagnesiumDioxide(updatedBatteryModel.getMagnesiumDioxide());
            existingBatteryModel.setPotassiumHydroxideSolid(updatedBatteryModel.getPotassiumHydroxideSolid());
            existingBatteryModel.setPotassiumHydroxideSol(updatedBatteryModel.getPotassiumHydroxideSol());
            existingBatteryModel.setSulphuricAcid(updatedBatteryModel.getSulphuricAcid());
            existingBatteryModel.setCadmiumHydroxide(updatedBatteryModel.getCadmiumHydroxide());
            existingBatteryModel.setAmmoniumChloride(updatedBatteryModel.getAmmoniumChloride());
            existingBatteryModel.setSilverOxide(updatedBatteryModel.getSilverOxide());
            existingBatteryModel.setSodium(updatedBatteryModel.getSodium());
            existingBatteryModel.setSulphur(updatedBatteryModel.getSulphur());

            return batteryModelRepository.save(existingBatteryModel);
        }
        return null;
    }

    @Override
    public void deleteBatteryModel(Long id) {
        batteryModelRepository.deleteById(id);
    }

}
