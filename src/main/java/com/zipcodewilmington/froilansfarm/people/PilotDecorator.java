package com.zipcodewilmington.froilansfarm.people;

import com.zipcodewilmington.froilansfarm.interfaces.Edible;
import com.zipcodewilmington.froilansfarm.vehicles.CropDuster;

public class PilotDecorator extends Person {

    Person p;

    public PilotDecorator(Person person){
        this.p = person;
    }

    public void eat(Edible food) {

    }

    public String makeNoise() {
        return null;
    }

    @Override
    public void work() {
        p.work();
        this.fly();
    }

    private void fly() {
        System.out.println("Flying");
    }

}
