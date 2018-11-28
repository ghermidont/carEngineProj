package com.company;

public class tank {
    private Float tankFuel; //у бака есть максимальный обьем - 200 литров


    // CONSTRUCTOR
    public tank(Float tankFuel) {
        this.tankFuel = tankFuel;
    }

    // GETTER & SETTER + TO STRING
    public Float getVolume() {
        return tankFuel;
    }

    public void setVolume(Float tankFuel) {
        this.tankFuel = tankFuel;
    }

    @Override
    public String toString() {
        return "tank{" +
                "volume=" + tankFuel +
                '}';
    }
}
