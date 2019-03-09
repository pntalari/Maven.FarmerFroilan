package com.zipcodewilmington.froilansfarm.produce;

import java.util.ArrayList;
import java.util.List;

public class TomatoPlant extends Crop<Tomato>{
    private List<Tomato> tomatoes = new ArrayList<>();

    public int yield() {
        if(hasBeenHarvested){
            tomatoes.add(new Tomato());
        }
        return tomatoes.size();
    }
}
