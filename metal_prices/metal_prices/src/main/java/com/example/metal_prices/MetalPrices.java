package com.example.metal_prices;

import jakarta.persistence.*;
import java.math.BigDecimal;



@Entity
@Table(name = "metal_prices")
public class MetalPrices {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long key;

    private BigDecimal lithium;
    private BigDecimal nickel;
    private BigDecimal manganese;
    private BigDecimal cobalt;
    private BigDecimal titanium;
    private BigDecimal copper;
    private BigDecimal aluminium;
    private BigDecimal iron_steel;
    private BigDecimal graphite;
    private BigDecimal zinc;
    private BigDecimal lead_min;
    private BigDecimal lead_max;
    private BigDecimal phosphate;
    private BigDecimal electrolyte;
    private BigDecimal magnesium_dioxide;
    private BigDecimal potassium_hydroxide_solid;
    private BigDecimal potassium_hydroxide_sol;
    private BigDecimal sulphuric_acid;
    private BigDecimal cadmium_hydroxide;
    private BigDecimal ammonium_chloride;
    private BigDecimal silver_oxide;
    private BigDecimal sodium;
    private BigDecimal sulphur;

    public Long getKey() {
        return key;
    }

    public void setKey(Long key) {
        this.key = key;
    }

    public BigDecimal getLithium() {
        return lithium;
    }

    public void setLithium(BigDecimal lithium) {
        this.lithium = lithium;
    }

    public BigDecimal getNickel() {
        return nickel;
    }

    public void setNickel(BigDecimal nickel) {
        this.nickel = nickel;
    }

    public BigDecimal getManganese() {
        return manganese;
    }

    public void setManganese(BigDecimal manganese) {
        this.manganese = manganese;
    }

    public BigDecimal getCobalt() {
        return cobalt;
    }

    public void setCobalt(BigDecimal cobalt) {
        this.cobalt = cobalt;
    }

    public BigDecimal getTitanium() {
        return titanium;
    }

    public void setTitanium(BigDecimal titanium) {
        this.titanium = titanium;
    }

    public BigDecimal getCopper() {
        return copper;
    }

    public void setCopper(BigDecimal copper) {
        this.copper = copper;
    }

    public BigDecimal getAluminium() {
        return aluminium;
    }

    public void setAluminium(BigDecimal aluminium) {
        this.aluminium = aluminium;
    }

    public BigDecimal getIron_steel() {
        return iron_steel;
    }

    public void setIron_steel(BigDecimal iron_steel) {
        this.iron_steel = iron_steel;
    }

    public BigDecimal getGraphite() {
        return graphite;
    }

    public void setGraphite(BigDecimal graphite) {
        this.graphite = graphite;
    }

    public BigDecimal getZinc() {
        return zinc;
    }

    public void setZinc(BigDecimal zinc) {
        this.zinc = zinc;
    }

    public BigDecimal getLead_min() {
        return lead_min;
    }

    public void setLead_min(BigDecimal lead_min) {
        this.lead_min = lead_min;
    }

    public BigDecimal getLead_max() {
        return lead_max;
    }

    public void setLead_max(BigDecimal lead_max) {
        this.lead_max = lead_max;
    }

    public BigDecimal getPhosphate() {
        return phosphate;
    }

    public void setPhosphate(BigDecimal phosphate) {
        this.phosphate = phosphate;
    }

    public BigDecimal getElectrolyte() {
        return electrolyte;
    }

    public void setElectrolyte(BigDecimal electrolyte) {
        this.electrolyte = electrolyte;
    }

    public BigDecimal getMagnesium_dioxide() {
        return magnesium_dioxide;
    }

    public void setMagnesium_dioxide(BigDecimal magnesium_dioxide) {
        this.magnesium_dioxide = magnesium_dioxide;
    }

    public BigDecimal getPotassium_hydroxide_solid() {
        return potassium_hydroxide_solid;
    }

    public void setPotassium_hydroxide_solid(BigDecimal potassium_hydroxide_solid) {
        this.potassium_hydroxide_solid = potassium_hydroxide_solid;
    }

    public BigDecimal getPotassium_hydroxide_sol() {
        return potassium_hydroxide_sol;
    }

    public void setPotassium_hydroxide_sol(BigDecimal potassium_hydroxide_sol) {
        this.potassium_hydroxide_sol = potassium_hydroxide_sol;
    }

    public BigDecimal getSulphuric_acid() {
        return sulphuric_acid;
    }

    public void setSulphuric_acid(BigDecimal sulphuric_acid) {
        this.sulphuric_acid = sulphuric_acid;
    }

    public BigDecimal getCadmium_hydroxide() {
        return cadmium_hydroxide;
    }

    public void setCadmium_hydroxide(BigDecimal cadmium_hydroxide) {
        this.cadmium_hydroxide = cadmium_hydroxide;
    }

    public BigDecimal getAmmonium_chloride() {
        return ammonium_chloride;
    }

    public void setAmmonium_chloride(BigDecimal ammonium_chloride) {
        this.ammonium_chloride = ammonium_chloride;
    }

    public BigDecimal getSilver_oxide() {
        return silver_oxide;
    }

    public void setSilver_oxide(BigDecimal silver_oxide) {
        this.silver_oxide = silver_oxide;
    }

    public BigDecimal getSodium() {
        return sodium;
    }

    public void setSodium(BigDecimal sodium) {
        this.sodium = sodium;
    }

    public BigDecimal getSulphur() {
        return sulphur;
    }

    public void setSulphur(BigDecimal sulphur) {
        this.sulphur = sulphur;
    }

    public MetalPrices(Long key, BigDecimal lithium, BigDecimal nickel, BigDecimal manganese, BigDecimal cobalt, BigDecimal titanium, BigDecimal copper, BigDecimal aluminium, BigDecimal iron_steel, BigDecimal graphite, BigDecimal zinc, BigDecimal lead_min, BigDecimal lead_max, BigDecimal phosphate, BigDecimal electrolyte, BigDecimal magnesium_dioxide, BigDecimal potassium_hydroxide_solid, BigDecimal potassium_hydroxide_sol, BigDecimal sulphuric_acid, BigDecimal cadmium_hydroxide, BigDecimal ammonium_chloride, BigDecimal silver_oxide, BigDecimal sodium, BigDecimal sulphur) {
        this.key = key;
        this.lithium = lithium;
        this.nickel = nickel;
        this.manganese = manganese;
        this.cobalt = cobalt;
        this.titanium = titanium;
        this.copper = copper;
        this.aluminium = aluminium;
        this.iron_steel = iron_steel;
        this.graphite = graphite;
        this.zinc = zinc;
        this.lead_min = lead_min;
        this.lead_max = lead_max;
        this.phosphate = phosphate;
        this.electrolyte = electrolyte;
        this.magnesium_dioxide = magnesium_dioxide;
        this.potassium_hydroxide_solid = potassium_hydroxide_solid;
        this.potassium_hydroxide_sol = potassium_hydroxide_sol;
        this.sulphuric_acid = sulphuric_acid;
        this.cadmium_hydroxide = cadmium_hydroxide;
        this.ammonium_chloride = ammonium_chloride;
        this.silver_oxide = silver_oxide;
        this.sodium = sodium;
        this.sulphur = sulphur;
    }

    // Default constructor (required by JPA)
    public MetalPrices() {
    }
}
