package com.zipcodewilmington.froilansfarm;

import com.zipcodewilmington.froilansfarm.Produce.CornStalk;
import com.zipcodewilmington.froilansfarm.Produce.Crop;
import com.zipcodewilmington.froilansfarm.Produce.TomatoPlant;
import com.zipcodewilmington.froilansfarm.Storage.ChickenCoop;
import com.zipcodewilmington.froilansfarm.Storage.FarmHouse;

/**
 * Created by leon on 2/26/18.
 */
public class Farm {
    private java.util.List<com.zipcodewilmington.froilansfarm.Storage.Stable> stables;
    private java.util.List<ChickenCoop> chickenCoops;
    private FarmHouse farmHouse;

    private CornStalk cornStalk;

    public  Farm(){
        cornStalk = new CornStalk();
        cornStalk.yield();
    }
}
