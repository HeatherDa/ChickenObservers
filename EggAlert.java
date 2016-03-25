package com.Heather;

import java.util.*;

/**
 * Created by iv2070fj on 3/24/2016.
 */
class EggAlert implements Observer {

    public void update(Observable chicken, Object arg) {
        if (((Chicken)chicken).laidEgg() ){
            System.out.println(chicken + " has laid an egg");
        }

    }

}

