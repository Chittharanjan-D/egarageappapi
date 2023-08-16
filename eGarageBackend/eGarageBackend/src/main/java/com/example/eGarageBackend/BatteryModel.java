package com.example.eGarageBackend;

import jakarta.persistence.*;

//import java.math.BigDecimal;

@Entity
@Table(name = "battery_models")
public class BatteryModel {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
     private Long id;

    @Column(name = "battery_model")
    private String batteryModel;

    @Column(name = "battery_categories_id")
    private Long batteryCategoriesId;

    @Column(name = "battery_type_id")
    private Long batteryTypeId;

    @Column(name = "battery_oem_id")
    private Long batteryOemId;

    @Column(name = "voltage")
    private Integer voltage;

    @Column(name = "ah")
    private Float ah;

    @Column(name = "kwh")
    private Float kwh;

    @Column(name = "weight")
    private Integer weight;

    @Column(name = "lithium")
    private Float lithium;

    @Column(name = "nickel")
    private Float nickel;

    @Column(name = "manganese")
    private Float manganese;

    @Column(name = "cobalt")
    private Float cobalt;

    @Column(name = "titanium")
    private Float titanium;

    @Column(name = "copper")
    private Float copper;

    @Column(name = "aluminium")
    private Float aluminium;

    @Column(name = "iron_steel")
    private Float ironSteel;

    @Column(name = "graphite")
    private Float graphite;

    @Column(name = "zinc")
    private Float zinc;

    @Column(name = "lead_min")
    private Float leadMin;

    @Column(name = "lead_max")
    private Float leadMax;

    @Column(name = "phosphate")
    private Integer phosphate;

    @Column(name = "electrolyte")
    private Float electrolyte;

    @Column(name = "magnesium_dioxide")
    private String magnesiumDioxide;

    @Column(name = "potassium_hydroxide_solid")
    private String potassiumHydroxideSolid;

    @Column(name = "potassium_hydroxide_sol")
    private String potassiumHydroxideSol;

    @Column(name = "sulphuric_acid")
    private String sulphuricAcid;

    @Column(name = "cadmium_hydroxide")
    private Float cadmiumHydroxide;

    @Column(name = "ammonium_chloride")
    private Float ammoniumChloride;

    @Column(name = "silver_oxide")
    private Float silverOxide;

    @Column(name = "sodium")
    private String sodium;

    @Column(name = "sulphur")
    private String sulphur;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getBatteryModel() {
        return batteryModel;
    }

    public void setBatteryModel(String batteryModel) {
        this.batteryModel = batteryModel;
    }

    public Long getBatteryCategoriesId() {
        return batteryCategoriesId;
    }

    public void setBatteryCategoriesId(Long batteryCategoriesId) {
        this.batteryCategoriesId = batteryCategoriesId;
    }

    public Long getBatteryTypeId() {
        return batteryTypeId;
    }

    public void setBatteryTypeId(Long batteryTypeId) {
        this.batteryTypeId = batteryTypeId;
    }

    public Long getBatteryOemId() {
        return batteryOemId;
    }

    public void setBatteryOemId(Long batteryOemId) {
        this.batteryOemId = batteryOemId;
    }

    public Integer getVoltage() {
        return voltage;
    }

    public void setVoltage(Integer voltage) {
        this.voltage = voltage;
    }

    public Float getAh() {
        return ah;
    }

    public void setAh(Float ah) {
        this.ah = ah;
    }

    public Float getKwh() {
        return kwh;
    }

    public void setKwh(Float kwh) {
        this.kwh = kwh;
    }

    public Integer getWeight() {
        return weight;
    }

    public void setWeight(Integer weight) {
        this.weight = weight;
    }

    public Float getLithium() {
        return lithium;
    }

    public void setLithium(Float lithium) {
        this.lithium = lithium;
    }

    public Float getNickel() {
        return nickel;
    }

    public void setNickel(Float nickel) {
        this.nickel = nickel;
    }

    public Float getManganese() {
        return manganese;
    }

    public void setManganese(Float manganese) {
        this.manganese = manganese;
    }

    public Float getCobalt() {
        return cobalt;
    }

    public void setCobalt(Float cobalt) {
        this.cobalt = cobalt;
    }

    public Float getTitanium() {
        return titanium;
    }

    public void setTitanium(Float titanium) {
        this.titanium = titanium;
    }

    public Float getCopper() {
        return copper;
    }

    public void setCopper(Float copper) {
        this.copper = copper;
    }

    public Float getAluminium() {
        return aluminium;
    }

    public void setAluminium(Float aluminium) {
        this.aluminium = aluminium;
    }

    public Float getIronSteel() {
        return ironSteel;
    }

    public void setIronSteel(Float ironSteel) {
        this.ironSteel = ironSteel;
    }

    public Float getGraphite() {
        return graphite;
    }

    public void setGraphite(Float graphite) {
        this.graphite = graphite;
    }

    public Float getZinc() {
        return zinc;
    }

    public void setZinc(Float zinc) {
        this.zinc = zinc;
    }

    public Float getLeadMin() {
        return leadMin;
    }

    public void setLeadMin(Float leadMin) {
        this.leadMin = leadMin;
    }

    public Float getLeadMax() {
        return leadMax;
    }

    public void setLeadMax(Float leadMax) {
        this.leadMax = leadMax;
    }

    public Integer getPhosphate() {
        return phosphate;
    }

    public void setPhosphate(Integer phosphate) {
        this.phosphate = phosphate;
    }

    public Float getElectrolyte() {
        return electrolyte;
    }

    public void setElectrolyte(Float electrolyte) {
        this.electrolyte = electrolyte;
    }

    public String getMagnesiumDioxide() {
        return magnesiumDioxide;
    }

    public void setMagnesiumDioxide(String magnesiumDioxide) {
        this.magnesiumDioxide = magnesiumDioxide;
    }

    public String getPotassiumHydroxideSolid() {
        return potassiumHydroxideSolid;
    }

    public void setPotassiumHydroxideSolid(String potassiumHydroxideSolid) {
        this.potassiumHydroxideSolid = potassiumHydroxideSolid;
    }

    public String getPotassiumHydroxideSol() {
        return potassiumHydroxideSol;
    }

    public void setPotassiumHydroxideSol(String potassiumHydroxideSol) {
        this.potassiumHydroxideSol = potassiumHydroxideSol;
    }

    public String getSulphuricAcid() {
        return sulphuricAcid;
    }

    public void setSulphuricAcid(String sulphuricAcid) {
        this.sulphuricAcid = sulphuricAcid;
    }

    public Float getCadmiumHydroxide() {
        return cadmiumHydroxide;
    }

    public void setCadmiumHydroxide(Float cadmiumHydroxide) {
        this.cadmiumHydroxide = cadmiumHydroxide;
    }

    public Float getAmmoniumChloride() {
        return ammoniumChloride;
    }

    public void setAmmoniumChloride(Float ammoniumChloride) {
        this.ammoniumChloride = ammoniumChloride;
    }

    public Float getSilverOxide() {
        return silverOxide;
    }

    public void setSilverOxide(Float silverOxide) {
        this.silverOxide = silverOxide;
    }

    public String getSodium() {
        return sodium;
    }

    public void setSodium(String sodium) {
        this.sodium = sodium;
    }

    public String getSulphur() {
        return sulphur;
    }

    public void setSulphur(String sulphur) {
        this.sulphur = sulphur;
    }

    public BatteryModel(Long id, String batteryModel, Long batteryCategoriesId, Long batteryTypeId, Long batteryOemId, Integer voltage, Float ah, Float kwh, Integer weight, Float lithium, Float nickel, Float manganese, Float cobalt, Float titanium, Float copper, Float aluminium, Float ironSteel, Float graphite, Float zinc, Float leadMin, Float leadMax, Integer phosphate, Float electrolyte, String magnesiumDioxide, String potassiumHydroxideSolid, String potassiumHydroxideSol, String sulphuricAcid, Float cadmiumHydroxide, Float ammoniumChloride, Float silverOxide, String sodium, String sulphur) {
        this.id = id;
        this.batteryModel = batteryModel;
        this.batteryCategoriesId = batteryCategoriesId;
        this.batteryTypeId = batteryTypeId;
        this.batteryOemId = batteryOemId;
        this.voltage = voltage;
        this.ah = ah;
        this.kwh = kwh;
        this.weight = weight;
        this.lithium = lithium;
        this.nickel = nickel;
        this.manganese = manganese;
        this.cobalt = cobalt;
        this.titanium = titanium;
        this.copper = copper;
        this.aluminium = aluminium;
        this.ironSteel = ironSteel;
        this.graphite = graphite;
        this.zinc = zinc;
        this.leadMin = leadMin;
        this.leadMax = leadMax;
        this.phosphate = phosphate;
        this.electrolyte = electrolyte;
        this.magnesiumDioxide = magnesiumDioxide;
        this.potassiumHydroxideSolid = potassiumHydroxideSolid;
        this.potassiumHydroxideSol = potassiumHydroxideSol;
        this.sulphuricAcid = sulphuricAcid;
        this.cadmiumHydroxide = cadmiumHydroxide;
        this.ammoniumChloride = ammoniumChloride;
        this.silverOxide = silverOxide;
        this.sodium = sodium;
        this.sulphur = sulphur;
    }

    // Default constructor
    public BatteryModel() {
        // Empty constructor required by JPA
    }
}
