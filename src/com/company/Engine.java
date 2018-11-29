package com.company;

public class Engine extends Thread {

    private Float engineFuelVolume = 0.0F;

    void burnEngineFuel(){
        this.engineFuelVolume = 0.0F;
    }

    public void run(){
        burnEngineFuel();
    }

    // GETTER n SETTER + ToString
    public Float getEngineFuelvolume ( ) {
        return engineFuelVolume;
    }

    public void setEngineFuelvolume ( Float engineFuelvolume ) {
        this.engineFuelVolume = engineFuelvolume;
    }

    @Override
    public String toString() {
        return "Fuel in the ENGINE: " + engineFuelVolume + " liters";
    }



}
