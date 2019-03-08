package com.zipcodewilmington.froilansfarm.People;

import com.zipcodewilmington.froilansfarm.Interfaces.Edible;
import com.zipcodewilmington.froilansfarm.Interfaces.Person;
import com.zipcodewilmington.froilansfarm.Produce.Crop;

public class Botanist extends PersonDecorator{
    public Botanist(Person decoratedPerson) {
        super(decoratedPerson);
    }

    public void plant(Crop crop){

    }

    public void eat(Edible food) {

    }

    public String makeNoise() {
        return null;
    }
}
