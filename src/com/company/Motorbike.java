package com.company;

public class Motorbike extends Vehicle {
    private int engine_size;

    public Motorbike(int engine_size){
        this.engine_size=engine_size;
    }

    public int getEngine_size() {
        return engine_size;
    }

    public void setEngine_size(int engine_size) {
        this.engine_size = engine_size;
    }
}
