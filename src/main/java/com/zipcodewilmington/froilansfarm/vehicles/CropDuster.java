package com.zipcodewilmington.froilansfarm.vehicles;

import com.zipcodewilmington.froilansfarm.interfaces.Edible;
import com.zipcodewilmington.froilansfarm.interfaces.FarmVehicle;
import com.zipcodewilmington.froilansfarm.produce.Crop;
import com.zipcodewilmington.froilansfarm.produce.CropRow;
import com.zipcodewilmington.froilansfarm.storage.Field;
import com.zipcodewilmington.froilansfarm.storage.Storage;

public class CropDuster<T extends Edible> extends Aircraft implements FarmVehicle {

    Crop<T> crop;
    private Boolean isCropDusterFlown = false;
    private boolean cropRowIsFertilized = false;

    public CropDuster(){

        this.isCropDusterFlown = false;
        this.cropRowIsFertilized = false;
    }

    public void fertilize(CropRow row) {
        row.getCrops();
         this.crop.fertilize();
         this.cropRowIsFertilized = false;
     }

    public void operate() {
        this.fly();
    }

    public String makeNoise() {
        return "Zoom!";
    }

    public void ride() {
        this.isCropDusterFlown = true;
    }

    public Boolean getCropDusterFlown(){
        return this.isCropDusterFlown = true;
    }

    public Boolean getCropDusterFertilized(){
        return this.cropRowIsFertilized = true;
    }
}
