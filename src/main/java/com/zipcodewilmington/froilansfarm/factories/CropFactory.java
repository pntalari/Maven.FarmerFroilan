package com.zipcodewilmington.froilansfarm.factories;

import com.zipcodewilmington.froilansfarm.produce.*;

import java.util.ArrayList;
import java.util.List;

public class CropFactory {

    public List<TomatoPlant> createTomatoPlant(Integer numberOfTomatoPlants) {
        List<TomatoPlant> tomatoPlants = new ArrayList<TomatoPlant>();
        for (int i = 0; i < numberOfTomatoPlants; i++) {
            tomatoPlants.add(new TomatoPlant());
        }
        return tomatoPlants;
    }

    public List<CornStalk> createCornStalk(Integer numberOfCornStalks) {
        List<CornStalk> cornStalks = new ArrayList<>();
        for (int i = 0; i <numberOfCornStalks ; i++) {
            cornStalks.add(new CornStalk());
        }
        return cornStalks;
    }

    public List<WheatStalk> createWheatStalk(Integer numberOfWheatStalks) {
        List<WheatStalk> wheatStalks = new ArrayList<>();
        for (int i = 0; i <numberOfWheatStalks ; i++) {
            wheatStalks.add(new WheatStalk());
        }
        return wheatStalks;
    }

    public List<CarrotPlant> createCarrotPlant(Integer numberOfCarrotPlants) {
        List<CarrotPlant> carrotPlants = new ArrayList<>();
        for (int i = 0; i <numberOfCarrotPlants ; i++) {
            carrotPlants.add(new CarrotPlant());
        }
        return carrotPlants;
    }

    public List<PotatoPlant> createPotatoPlant(Integer numberOfPotatoPlants) {
        List<PotatoPlant> potatoPlants = new ArrayList<>();
        for (int i = 0; i <numberOfPotatoPlants ; i++) {
            potatoPlants.add(new PotatoPlant());
        }
        return potatoPlants;
    }

}
