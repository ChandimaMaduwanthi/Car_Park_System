package com.company;

public abstract class Vehicle {
    private String id;
    private String brand;
    String entry_time_date;

    public Vehicle() {
    }

    public Vehicle(String id,String brand,String entry_time_date) {
        this.id = id;
        this.brand=brand;
        this.entry_time_date=entry_time_date;
    }


    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getEntry_time_date() {
        return entry_time_date;
    }

    public void setEntry_time_date(String entry_time_date) {
        this.entry_time_date = entry_time_date;
    }

}
