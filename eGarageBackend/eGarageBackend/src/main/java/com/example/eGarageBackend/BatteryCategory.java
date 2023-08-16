package com.example.eGarageBackend;


import jakarta.persistence.*;

@Entity
@Table(name = "battery_categories")
public class BatteryCategory {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "battery_category")
    private String batteryCategory;

    //Constructors
    public BatteryCategory(Long id, String batteryCategory) {
        this.id = id;
        this.batteryCategory = batteryCategory;
    }

    //Getter and Setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getBatteryCategory() {
        return batteryCategory;
    }

    public void setBatteryCategory(String batteryCategory) {
        this.batteryCategory = batteryCategory;
    }

    //Default constructor
    public BatteryCategory() {
        // Empty constructor
    }

}
