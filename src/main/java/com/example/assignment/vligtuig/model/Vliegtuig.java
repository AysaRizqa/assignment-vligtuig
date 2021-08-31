package com.example.assignment.vligtuig.model;

import org.springframework.beans.factory.annotation.Value;

import javax.persistence.*;

@Entity
public class Vliegtuig {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)

    private String typeOfPlane;
    private int id;
    private String currentAirField;
    private double fuelPerTon;

    @ManyToOne
    private VliegVield vliegvield;

    public Vliegtuig() {
    }

    public Vliegtuig(String typeOfPlane, int id, String currentAirField, double fuelPerTon, VliegVield vliegvield) {
        this.typeOfPlane = typeOfPlane;
        this.id = id;
        this.currentAirField = currentAirField;
        this.fuelPerTon = fuelPerTon;
        this.vliegvield = vliegvield;
    }

    public String getTypeOfPlane() {
        return typeOfPlane;
    }

    public void setTypeOfPlane(String typeOfPlane) {
        this.typeOfPlane = typeOfPlane;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCurrentAirField() {
        return currentAirField;
    }

    public void setCurrentAirField(String currentAirField) {
        this.currentAirField = currentAirField;
    }

    public double getFuelPerTon() {
        return fuelPerTon;
    }

    public void setFuelPerTon(double fuelPerTon) {
        this.fuelPerTon = fuelPerTon;
    }

    public VliegVield getVliegvield() {
        return vliegvield;
    }

    public void setVliegvield(VliegVield vliegvield) {
        this.vliegvield = vliegvield;
    }


}
