package com.company;

public class engine extends Thread {

    private Float engineFuel = 0.0F;

    void burnEngineFuel(){
        this.engineFuel = 0.0F;
    }

    public void setEngineFuel(Float fuelToEngineFromPump) {
        this.engineFuel = fuelToEngineFromPump;
    }

    public void run(){
        while( engineFuel >= 0.05F && engineFuel <= 1.0F ){
            engineFuel+=0.15F;
        }
        burnEngineFuel();
    }

}
