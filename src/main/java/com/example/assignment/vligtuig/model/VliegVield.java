package com.example.assignment.vligtuig.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class VliegVield {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private String name;
    private String location;
    private int id;


    public VliegVield() {
    }

    public VliegVield(String name, String location, int id) {
        this.name = name;
        this.location = location;
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
