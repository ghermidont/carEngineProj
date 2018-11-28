package com.company;

public class engine extends Thread {

    private Float engineFuel = 0.0F; // у двигателя max -> 2 (литра)

    public engine( pump p ){
        this.engineFuel = ???;
    }

    void burnEngineFuel(){
        this.engineFuel=0.0F;
    }

    public void run(){
        while( engineFuel >= 0.05F && engineFuel <= 1.0F ){
            engineFuel+=0.15F;
        }
        burnEngineFuel();
    }

    // GETTERS & SETTERS + TO STRING
    public Float getEngineFuel() {
        return engineFuel;
    }

    public void setEngineFuel(Float engineFuel) {
        this.engineFuel = engineFuel;
    }

}
