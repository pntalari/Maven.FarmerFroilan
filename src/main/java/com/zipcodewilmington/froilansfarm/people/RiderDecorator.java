package com.zipcodewilmington.froilansfarm.people;

import com.zipcodewilmington.froilansfarm.interfaces.Animal;
import com.zipcodewilmington.froilansfarm.interfaces.Edible;
import com.zipcodewilmington.froilansfarm.interfaces.Ridable;

public class RiderDecorator extends Person {

    Animal p;

    public RiderDecorator(Animal decoratedPerson) {
        this.p = decoratedPerson;
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

    @Override
    public void work() {
        p.work();
        this.ride();
    }

    private void ride() {
        System.out.println("Riding");
    }
}
