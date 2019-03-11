package com.zipcodewilmington.froilansfarm.produce;


import java.util.ArrayList;
import java.util.List;

public class CarrotPlant extends Crop<Carrot> {

    private List<Carrot> carrots = new ArrayList<>();

    public Carrot yield() {
        if(hasBeenHarvested){
            carrots.add(new Carrot());
            return new Carrot();
        }
        return null;
    }
}
