package com.company;

public class Car extends Thread{
    private Engine engine = new Engine();
    private Pump pump = new Pump ();
    private Tank tank = new Tank ( 100.0F );

    public Engine getEngine ( ) {
        return engine;
    }

    public void run(){
       while(tank.getfuelInTheTank()>=0.05F) {
           pump.take ( tank );
           pump.put ( engine );
       }
   }

}
