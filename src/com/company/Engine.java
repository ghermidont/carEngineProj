package com.company;

public class Engine extends Thread {

    private Float engineFuelVolume = 0.0F;

    private void burnEngineFuel(){
        this.engineFuelVolume = 0.0F;
    }

    public synchronized void run(Tank tankLink){
        while ( tankLink.getfuelInTheTank ( ) >= 0.05F){
            burnEngineFuel ();
        }
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
