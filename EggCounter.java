package com.Heather;

import java.util.*;

/**
 * Created by iv2070fj on 3/24/2016.
 */
public class EggCounter implements Observer {
    HashMap<Chicken, Integer>eggs=new HashMap<>();

    @Override
    public void update(Observable observable, Object arg){
        Chicken chicken=(Chicken)observable; //cast Observable to Chicken
        if (eggs.containsKey(chicken)){//increment egg count for each egg
            int egg=eggs.get(chicken);
            egg++;
            eggs.put(chicken,egg);
        }
        else{//chicken's first egg
            eggs.put(chicken, 1);
        }
    }

    public void printReport(){
        int total=0;
        for (Chicken c: eggs.keySet()){
            System.out.println(c.name+" laid: "+eggs.get(c)+" eggs");
            total=total+eggs.get(c);
        }
        System.out.println("Total eggs laid this session: "+total);
    }
}
