package com.zipcodewilmington.froilansfarm.People;

import com.zipcodewilmington.froilansfarm.Interfaces.Edible;
import com.zipcodewilmington.froilansfarm.Interfaces.Person;
import com.zipcodewilmington.froilansfarm.Interfaces.Ridable;

public class Rider extends PersonDecorator {

    public Rider(Person decoratedPerson) {
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
