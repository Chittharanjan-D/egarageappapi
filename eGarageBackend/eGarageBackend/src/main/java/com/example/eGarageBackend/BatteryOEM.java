package com.example.eGarageBackend;


import jakarta.persistence.*;

@Entity
@Table(name = "battery_oem")
public class BatteryOEM {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "battery_oem")
    private String batteryOEM;

    //Constructor
    public BatteryOEM(Long id, String batteryOEM) {
        this.id = id;
        this.batteryOEM = batteryOEM;
    }

    //Getter and Setter
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getBatteryOEM() {
        return batteryOEM;
    }

    public void setBatteryOEM(String batteryOEM) {
        this.batteryOEM = batteryOEM;
    }

    //Default Constructor
    public BatteryOEM(){

    }
}
