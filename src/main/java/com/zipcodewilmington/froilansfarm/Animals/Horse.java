package com.zipcodewilmington.froilansfarm.Animals;

import com.zipcodewilmington.froilansfarm.Interfaces.Animal;
import com.zipcodewilmington.froilansfarm.Interfaces.Edible;
import com.zipcodewilmington.froilansfarm.Interfaces.Ridable;

public class Horse implements Animal, Ridable {

    public String makeNoise() {

        return "neigh!";
    }

    public void ride() {

    }

    public void eat(Edible food) {

    }
}
