package com.zipcodewilmington.froilansfarm.produce;

import com.zipcodewilmington.froilansfarm.interfaces.Edible;
import com.zipcodewilmington.froilansfarm.interfaces.Producer;

public abstract class Crop<T extends Edible> implements Producer {
    private Boolean hasBeenFertilized;
    protected Boolean hasBeenHarvested;

    public Crop() {
        this.hasBeenFertilized = false;
        this.hasBeenHarvested = false;
    }

    public abstract int yield();

    public boolean fertilize(){
        hasBeenFertilized = true;
        return false;
    }

    public boolean harvest(){
        hasBeenHarvested = true;
        return false;
    }
}
