package com.zipcodewilmington.froilansfarm.vehicles;

import com.zipcodewilmington.froilansfarm.interfaces.Edible;
import com.zipcodewilmington.froilansfarm.interfaces.FarmVehicle;
import com.zipcodewilmington.froilansfarm.produce.Crop;
import com.zipcodewilmington.froilansfarm.produce.CropRow;
import com.zipcodewilmington.froilansfarm.storage.Field;
import com.zipcodewilmington.froilansfarm.storage.Storage;

import java.util.List;

public class CropDuster<T extends Edible> extends Aircraft implements FarmVehicle {

    private Boolean isCropDusterFlown = false;

    public CropDuster(){

        this.isCropDusterFlown = false;
    }

    public void fertilize(CropRow row) {
        List<Crop> crops = row.getCrops();
        for(Crop crop : crops){
            crop.fertilize();
        }

     }

    public void operate() {
        this.fly(10);
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
}
