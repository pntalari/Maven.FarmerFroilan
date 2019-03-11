package com.zipcodewilmington.froilansfarm.produce;

import com.zipcodewilmington.froilansfarm.interfaces.Edible;
import com.zipcodewilmington.froilansfarm.interfaces.Producer;

import java.util.List;

public class CropRow <T extends Crop> implements Producer {
    private List<T> crops;
    private T crop;
    private boolean hasBeenHarvested;

    public CropRow() {
    }

    public CropRow(boolean hasBeenHarvested){
        this.hasBeenHarvested = hasBeenHarvested;
    }

    public CropRow(List<T> crop, boolean hasBeenHarvested) {
        this.crops = crop;
        this.hasBeenHarvested = hasBeenHarvested;
    }

    public Crop yield() {
        return null;
    }

    public void addCrop(T crop) {

        crops.add(crop);
    }

    public List<T> getCrops() {
        return crops;
    }

    public void setHasBeenHarvested(boolean hasBeenHarvested){

        this.hasBeenHarvested = hasBeenHarvested;
    }

    public Crop harvestCrops(){
        this.crops = null;
        return null;
    }

}
