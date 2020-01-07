package com.company;

public class Car extends Vehicle{
    private int doors;
    private String colour;

    public Car(int doors,String colour) {
        this.doors=doors;
        this.colour=colour;
    }

    public int getDoors() {
        return doors;
    }

    public void setDoors(int doors) {
        this.doors = doors;
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }
}
