package com.zipcodewilmington.froilansfarm.People;

import com.zipcodewilmington.froilansfarm.Interfaces.Edible;
import com.zipcodewilmington.froilansfarm.Vehicles.CropDuster;

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
