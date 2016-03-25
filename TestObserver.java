package com.Heather;

import java.util.*;

public class TestObserver {

    public static void main(String[] args) {

        EggAlert eggMonitor = new EggAlert();//create new observer
        EggCounter eggCounter = new EggCounter();//create new observer

        Chicken a = new Chicken("Mavis");//new Chicken object
        a.addObserver(eggMonitor);  //add an observer
        a.addObserver(eggCounter);  //add an observer

        Chicken b = new Chicken("Betty");//new Chicken object
        b.addObserver(eggMonitor);  //add an observer
        b.addObserver(eggCounter);  //add an observer
        Chicken c = new Chicken ("Clara");//new Chicken object
        c.addObserver(eggMonitor);  //add an observer
        c.addObserver(eggCounter);  //add an observer

        //laying eggs
        a.layEgg();
        b.layEgg();
        a.layEgg();
        c.layEgg();
        c.layEgg();
        a.layEgg();

        //print totals
        eggCounter.printReport();

    }

}

