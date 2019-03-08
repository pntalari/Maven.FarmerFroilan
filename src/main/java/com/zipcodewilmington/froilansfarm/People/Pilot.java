package com.zipcodewilmington.froilansfarm.People;

import com.zipcodewilmington.froilansfarm.Interfaces.Edible;
import com.zipcodewilmington.froilansfarm.Interfaces.Person;
import com.zipcodewilmington.froilansfarm.Vehicles.CropDuster;

public class Pilot extends PersonDecorator {
    private CropDuster cropDuster = new CropDuster();

    public Pilot(Person person){
        super(person);
    }

    public void eat(Edible food) {

    }
}
