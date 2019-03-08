package com.zipcodewilmington.froilansfarm.People;

import com.zipcodewilmington.froilansfarm.Interfaces.Edible;
import com.zipcodewilmington.froilansfarm.Interfaces.Person;

public abstract class PersonDecorator implements Person {

    protected Person decoratedPerson;

    public PersonDecorator(Person decoratedPerson) {
        this.decoratedPerson = decoratedPerson;
    }

    public abstract void eat(Edible food);

    public String makeNoise() {
        return "Yee Haaw!!\nDag Nabbit!";

    }
}
