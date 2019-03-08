package com.zipcodewilmington.froilansfarm.people;

import com.zipcodewilmington.froilansfarm.interfaces.Edible;
import com.zipcodewilmington.froilansfarm.vehicles.CropDuster;

public class PilotDecorator extends Person {
    private CropDuster cropDuster = new CropDuster();

    public PilotDecorator(Person person){

    }

    public void eat(Edible food) {

    }

    public String makeNoise() {
        return null;
    }
}
