package com.zipcodewilmington.froilansfarm.people;

import com.zipcodewilmington.froilansfarm.interfaces.Edible;
import com.zipcodewilmington.froilansfarm.interfaces.Ridable;

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
