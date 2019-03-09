package com.zipcodewilmington.froilansfarm.people;

import com.zipcodewilmington.froilansfarm.interfaces.Edible;
import com.zipcodewilmington.froilansfarm.vehicles.CropDuster;

public class PilotDecorator extends FarmWorker {
    private CropDuster cropDuster = new CropDuster();

    public PilotDecorator(Person person){
        super(person);
    }

    public void eat(Edible food) {

    }

    public String makeNoise() {
        return null;
    }
}
