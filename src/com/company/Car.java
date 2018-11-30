package com.company;

public class Car extends Thread{
    private Engine engine = new Engine ();
    private Pump pump = new Pump ();
    private Tank tank = new Tank(100.0F);

   public void run(){
       pump.start ();
       engine.start ();
   }

}
