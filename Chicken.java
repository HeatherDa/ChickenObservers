package com.Heather;
import java.util.*;
/**
 * Created by iv2070fj on 3/24/2016.
 */
class Chicken extends Observable {

    String name;
    boolean laidEgg = false;

    Chicken(String name){
        this.name = name;
    }

    public void layEgg(){
        this.laidEgg = true;
        this.setChanged();
        this.notifyObservers();
        this.laidEgg = false;
    }

    public String toString() {
        return this.name;
    }

    public boolean laidEgg(){
        return laidEgg;
    }

}

