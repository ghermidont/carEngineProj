package com.company;

public class Pump extends Thread{
    private static final Float ENGINE_INTAKE = 0.15F;
    private static final Float PUMP_INTAKE = 0.2F;

    //Deduce fuelInTheTank - 0.2F
    private void take( Tank tankLink ){
        Float fuelInTheTankReduced = tankLink.getfuelInTheTank()- PUMP_INTAKE;
        tankLink.setTankFuelVolume ( fuelInTheTankReduced );
        System.out.println ( tankLink );
        if( fuelInTheTankReduced <= 0.2F){
            System.out.println ( "No more fuel in the tank!!!" );
        }
    }

    //Put 0.15 liters to engine volume
    private void put( Engine engineLink ){
        Float fuelPushedTofTheEngine = engineLink.getEngineFuelvolume () + ENGINE_INTAKE;
        engineLink.setEngineFuelvolume ( fuelPushedTofTheEngine );
        System.out.println ( engineLink );
    }

    public void run( Tank tankLink, Engine engineLink ) {
           take( tankLink );
           put( engineLink );
    }

}

