package com.zipcodewilmington.froilansfarm.produce;

import java.util.ArrayList;
import java.util.List;

public class TomatoPlant extends Crop<Tomato>{

    private List<Tomato> tomatoes = new ArrayList<>();

    public Tomato yield() {
        if (hasBeenHarvested) {
            tomatoes.add(new Tomato());
        }
        return null;
    }


}
