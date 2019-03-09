package com.zipcodewilmington.froilansfarm.produce;

import java.util.ArrayList;
import java.util.List;

public class TomatoPlant extends Crop<Tomato>{
<<<<<<< HEAD
    private List<Tomato> tomatoes = new ArrayList<>();

    public int yield() {
        if(hasBeenHarvested){
            tomatoes.add(new Tomato());
        }
        return tomatoes.size();
=======
    public TomatoPlant() {
    }

    public Tomato yield() {
        return null;
>>>>>>> 85bad255e3f84a4e6ab7242fd3954f0f5d4434b4
    }
}
