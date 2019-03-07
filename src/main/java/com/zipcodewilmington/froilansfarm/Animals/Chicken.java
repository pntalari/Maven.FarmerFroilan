package com.zipcodewilmington.froilansfarm.Animals;

import com.zipcodewilmington.froilansfarm.Interfaces.Animal;
import com.zipcodewilmington.froilansfarm.Interfaces.Producer;
import com.zipcodewilmington.froilansfarm.Produce.EdibleEgg;

public class Chicken implements Producer, Animal {
    public void eat() {

    }

    public String makeNoise() {
        return null;
    }

    public EdibleEgg yield() {
        return null;
    }
}
