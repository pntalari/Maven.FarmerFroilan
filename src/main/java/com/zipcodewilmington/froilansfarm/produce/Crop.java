package com.zipcodewilmington.froilansfarm.produce;

import com.zipcodewilmington.froilansfarm.interfaces.Edible;
import com.zipcodewilmington.froilansfarm.interfaces.Producer;

public abstract class Crop<T extends Edible> implements Producer {
    private Boolean hasBeenFertilized;
    private Boolean hasBeenHarvested;

    public Crop() {
        this.hasBeenFertilized = false;
        this.hasBeenHarvested = false;
    }

    public abstract T yield();

    public void fertilize(){
        hasBeenFertilized = true;
    }

    public void harvest(){
        hasBeenHarvested = true;
    }
}
