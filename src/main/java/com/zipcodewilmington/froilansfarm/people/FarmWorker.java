package com.zipcodewilmington.froilansfarm.people;

import com.zipcodewilmington.froilansfarm.interfaces.Animal;
import com.zipcodewilmington.froilansfarm.interfaces.Edible;

public class FarmWorker implements Animal {
    @Override
    public void work() {
        System.out.println("Ready to work");
    }

    @Override
    public void eat(Edible food) {

    }

    @Override
    public String makeNoise() {
        return null;
    }
}
