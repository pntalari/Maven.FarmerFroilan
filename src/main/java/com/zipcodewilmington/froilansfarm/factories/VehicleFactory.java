package com.zipcodewilmington.froilansfarm.factories;

import com.zipcodewilmington.froilansfarm.interfaces.Vehicle;
import com.zipcodewilmington.froilansfarm.vehicles.CropDuster;
import com.zipcodewilmington.froilansfarm.vehicles.Tractor;

import java.util.ArrayList;
import java.util.List;

public class VehicleFactory {
    public List<Tractor> createTractor(Integer numberOfTractors) {
        List<Tractor> tractors = new ArrayList<>();
        for (int i = 0; i < numberOfTractors ; i++) {
            tractors.add(new Tractor());
        }
        return tractors;
    }
    public List<CropDuster> createCropDuster(Integer numberOfCropDuster) {
        List<CropDuster> cropDusters = new ArrayList<>();
        for (int i = 0; i < numberOfCropDuster ; i++) {
            cropDusters.add(new CropDuster());
        }

        return cropDusters;
    }
}
