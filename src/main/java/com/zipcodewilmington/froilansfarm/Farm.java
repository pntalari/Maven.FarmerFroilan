package com.zipcodewilmington.froilansfarm;

import com.zipcodewilmington.froilansfarm.produce.CornStalk;
import com.zipcodewilmington.froilansfarm.storage.ChickenCoop;
import com.zipcodewilmington.froilansfarm.storage.FarmHouse;

/**
 * Created by leon on 2/26/18.
 */
public class Farm {
    private java.util.List<com.zipcodewilmington.froilansfarm.storage.Stable> stables;
    private java.util.List<ChickenCoop> chickenCoops;
    private FarmHouse farmHouse;

    private CornStalk cornStalk;

    public  Farm(){
        cornStalk = new CornStalk();
        cornStalk.yield();
    }
}
