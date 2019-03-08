package com.zipcodewilmington.froilansfarm.People;

import com.zipcodewilmington.froilansfarm.Interfaces.Edible;
import com.zipcodewilmington.froilansfarm.Interfaces.Ridable;

public class RiderDecorator extends Person {

    public RiderDecorator(Person decoratedPerson) {

    }

    void mount(Ridable thing){

    }

    void dismount(Ridable thing){

    }

    public void eat(Edible food) {

    }

    public String makeNoise() {
        return null;
    }
}
