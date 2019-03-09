package com.zipcodewilmington.froilansfarm.produce;

import com.zipcodewilmington.froilansfarm.interfaces.Edible;
import com.zipcodewilmington.froilansfarm.interfaces.Producer;

public class CropRow< T extends Crop> implements Producer {
    private  T crops;

    public CropRow() {
    }

    public CropRow(T crop) {
        this.crops = crop;
    }

    @Override
    public Edible yield() {
        return null;
    }

    public void addCrop(T crops) {
        this.crops = crops;
    }

     public T getCrops() {
        return crops;
    }



    public Crop harvestCrops(){
        this.crops = null;
        return null;
    }
}
