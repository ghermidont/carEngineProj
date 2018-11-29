package com.company;

public class tank {

    private Float tankFuel;

    // CONSTRUCTOR
    public tank(Float tankFuel) {
        this.tankFuel = tankFuel;
    }

    // GETTER & SETTER + TO STRING
    public Float getTankFuel() {
        this.tankFuel -= 0.2F;
        return tankFuel;
    }


    @Override
    public String toString() {
        return "tank{" +
                "volume=" + tankFuel +
                '}';
    }

}
