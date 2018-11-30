package com.company;

public class Engine extends Thread {

    private Float engineFuelVolume = 0.0F;

    private void burnEngineFuel(){
        this.engineFuelVolume = 0.0F;
    }

    public void run(Tank tankLink){
       burnEngineFuel ();
       System.out.println ( toString() );
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
        return "The fuel is BURNING!!!" ;
    }

}
