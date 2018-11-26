package com.company;

public class car {

    engine Engine = new engine();
    pump Pump = new pump();
    tank Tank = new tank(100.0F);

    Engine.start();
    Pump.start();
    //constructor
    //run();
    //в баке 100 Л
    //while() -> 1 итерациа должна состоять из
      //  1 take()
      //  1 put()
      //  2 burn()
   //  !!! но если в баке пусто (0 литров) цикл надо остановить и вывести сообщение - "Engine Stopped / no GAS"
   // ваша задача запустить выводя на экран каждый такт двигателя ( while () )

}
