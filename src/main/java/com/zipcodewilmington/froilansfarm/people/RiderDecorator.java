package com.zipcodewilmington.froilansfarm.people;

import com.zipcodewilmington.froilansfarm.Farm;
import com.zipcodewilmington.froilansfarm.interfaces.Edible;
import com.zipcodewilmington.froilansfarm.interfaces.Ridable;

public class RiderDecorator extends FarmWorker {

    public RiderDecorator(Person decoratedPerson) {
        super(decoratedPerson);
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
