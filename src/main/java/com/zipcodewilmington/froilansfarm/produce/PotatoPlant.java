package com.zipcodewilmington.froilansfarm.produce;

import java.util.ArrayList;
import java.util.List;

public class PotatoPlant extends Crop<Potato>{

    private List<Potato> potatoes = new ArrayList<>();

    public Potato yield() {
        if(hasBeenHarvested){
            potatoes.add(new Potato());
            return new Potato();
        }
        return null;
    }
}
