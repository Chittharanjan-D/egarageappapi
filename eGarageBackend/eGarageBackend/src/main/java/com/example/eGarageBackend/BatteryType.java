package com.example.eGarageBackend;

import jakarta.persistence.*;

@Entity
@Table(name = "battery_type")
public class BatteryType {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "battery_type")
    private String batteryType;

    //Getter and Setter

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getBatteryType() {
        return batteryType;
    }

    public void setBatteryType(String batteryType) {
        this.batteryType = batteryType;
    }

    //Constructor

    public BatteryType(Long id, String batteryType) {
        this.id = id;
        this.batteryType = batteryType;
    }

    //Default Constructor
    public BatteryType(){

    }
}
