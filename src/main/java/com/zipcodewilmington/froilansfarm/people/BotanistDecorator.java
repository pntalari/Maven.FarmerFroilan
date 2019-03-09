package com.zipcodewilmington.froilansfarm.people;

import com.zipcodewilmington.froilansfarm.interfaces.Edible;
import com.zipcodewilmington.froilansfarm.produce.Crop;

public class BotanistDecorator extends FarmWorker{

    public BotanistDecorator(Person decoratedPerson) {
        super(decoratedPerson);
    }

    public void plant(Crop crop){

    }

}
