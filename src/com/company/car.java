package com.company;

public class car {
    tank Tank = new tank(100.0F);
    pump Pump = new pump();
    engine Engine = new engine(Pump);

    //Engine.start();
    //Pump.start();
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
