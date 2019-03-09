package com.zipcodewilmington.froilansfarm.produce;

import com.zipcodewilmington.froilansfarm.interfaces.Producer;

import java.util.ArrayList;
import java.util.List;

public class WheatStalk extends Crop<Wheat> implements Producer {

    private List<Wheat> wheatList = new ArrayList<>();

    public int yield() {
        if(hasBeenHarvested){
            wheatList.add(new Wheat());
        }
        return wheatList.size();
    }
}
