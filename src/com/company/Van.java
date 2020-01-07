package com.company;

public class Van extends Vehicle {
    private int cargo_vol;

    public Van(int cargo_vol){
        this.cargo_vol=cargo_vol;
    }

    public int getCargo_vol() {
        return cargo_vol;
    }

    public void setCargo_vol(int cargo_vol) {
        this.cargo_vol = cargo_vol;
    }
}
