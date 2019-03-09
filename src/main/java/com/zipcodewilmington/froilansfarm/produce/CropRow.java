package com.zipcodewilmington.froilansfarm.produce;

import com.zipcodewilmington.froilansfarm.interfaces.Edible;
import com.zipcodewilmington.froilansfarm.interfaces.Producer;

import java.util.List;

public class CropRow <T extends Crop> implements Producer {
    private List<T> crops;

    public CropRow() {
    }

    public CropRow(List<T> crop) {
        this.crops = crop;
    }

    public Edible yield() {
        return null;
    }

    public void addCrop(List<T> crops) {
        this.crops = crops;
    }

    public List<T> getCrops() {
        return crops;
    }

    public Crop harvestCrops(){
        this.crops = null;
        return null;
    }
}
