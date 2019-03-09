package com.zipcodewilmington.froilansfarm.vehicles;

import com.zipcodewilmington.froilansfarm.interfaces.FarmVehicle;
import com.zipcodewilmington.froilansfarm.produce.Crop;

public class Tractor implements FarmVehicle {
    public void harvest(Crop crop) {
        crop.harvest();
    }

    public void operate() {

    }

    public String makeNoise() {
        return "Vroom!";
    }

    public void ride() {

    }
}
