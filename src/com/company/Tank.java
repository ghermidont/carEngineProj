package com.company;

public class Tank{

    private Float fuelInTheTank;

    // CONSTRUCTOR
    public Tank ( Float fuelInTheTank ) {
        this.fuelInTheTank = fuelInTheTank;
    }

    // GETTER & SETTER + TO STRING
    public Float getfuelInTheTank(){
       return fuelInTheTank;
    }

    public void setTankFuelVolume ( Float fuelInTheTank) {
        this.fuelInTheTank = fuelInTheTank;
    }

    @Override
    public String toString() {
            return "Fuel in the TANK: " + fuelInTheTank +
                    " liters";
    }

}
