package com.company;

public class Car extends Thread{
    private Engine engine;
    private Pump pump;
    private Tank tank;

    public Car (Float tankVolume) {
        this.engine = new Engine();
        this.pump = new Pump ();
        this.tank = new Tank(tankVolume);
    }

    public void run(){
       while(tank.getfuelInTheTank ()>=0.2F) {
           pump.run (tank, engine);
           engine.run (tank);
       }
    }

}
