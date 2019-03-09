package com.zipcodewilmington.froilansfarm.people;

import com.zipcodewilmington.froilansfarm.interfaces.Animal;
import com.zipcodewilmington.froilansfarm.interfaces.Edible;

public class FarmerDecorator extends Person{

    Animal p;

    public FarmerDecorator(Animal decoratedPerson) {
        this.p = decoratedPerson;
    }

    public void eat(Edible food) {

    }

    public String makeNoise() {
        return null;
    }

    @Override
    public void work() {
        p.work();
        this.farm();
    }

    private void farm() {
        System.out.println("Farming");
    }
}
