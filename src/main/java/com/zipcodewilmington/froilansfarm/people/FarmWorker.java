package com.zipcodewilmington.froilansfarm.people;

import com.zipcodewilmington.froilansfarm.interfaces.Animal;
import com.zipcodewilmington.froilansfarm.interfaces.Edible;
import com.zipcodewilmington.froilansfarm.produce.EdibleEgg;

public class FarmWorker implements Animal {
    Boolean isEatten = false;
    @Override
    public void work() {

    }

    @Override
    public void eat(Edible food) {
        if(food != null){
            this.isEatten = true;
            makeNoise();
        }
    }

    @Override
    public String makeNoise() {
        System.out.println("ate!");
        return "ate!";
    }
}
