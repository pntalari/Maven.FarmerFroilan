package com.zipcodewilmington.froilansfarm.vehicles;

import com.zipcodewilmington.froilansfarm.interfaces.Edible;
import com.zipcodewilmington.froilansfarm.interfaces.FarmVehicle;
import com.zipcodewilmington.froilansfarm.produce.Crop;
import com.zipcodewilmington.froilansfarm.produce.CropRow;
import com.zipcodewilmington.froilansfarm.storage.Field;
import com.zipcodewilmington.froilansfarm.storage.Storage;

public class CropDuster<T extends Edible> extends Aircraft implements FarmVehicle {

    Crop<T> crop;

    public void fertilize(CropRow row) {
        row.getCrops();
       this.crop.fertilize();
    }

    public void operate() {
        this.fly();
    }

    public String makeNoise() {
        return "Zoom!";
    }

    public void ride() {

    }
}
