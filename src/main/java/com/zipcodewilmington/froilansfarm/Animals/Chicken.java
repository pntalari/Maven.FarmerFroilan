package com.zipcodewilmington.froilansfarm.Animals;

import com.zipcodewilmington.froilansfarm.Interfaces.Animal;
import com.zipcodewilmington.froilansfarm.Interfaces.Edible;
import com.zipcodewilmington.froilansfarm.Interfaces.Producer;
import com.zipcodewilmington.froilansfarm.Produce.EdibleEgg;

public class Chicken implements Producer, Animal {
    private Boolean hasBeenFertilized;

    public Chicken() {
        this.hasBeenFertilized = false;
    }

    public String makeNoise() {
        return null;
    }

    public EdibleEgg yield() {
        return null;
    }

    public Boolean fertilize() {
        return null;
    }

    public void eat(Edible food) {

    }
}
