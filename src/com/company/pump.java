package com.company;

public class pump extends Thread{
    //constructor getter setter to String.
    private Float fuelInThePump = 0.0F;
    private Float fuelToTheEngine = 0.0F;

    void takeFromTank(tank fuelFromTank){
        this.fuelInThePump += fuelFromTank.getTankFuel();
    }

    void putToEngine(engine engineLink) {
        fuelToTheEngine-=this.fuelInThePump-0.15F;
        engineLink.setEngineFuel(this.fuelToTheEngine);
    }

    //public void run(){
        // while( tankFuel != 0 ){
        //    takeFromTank();
        //    putToEngine();
        // }
    //}

}
