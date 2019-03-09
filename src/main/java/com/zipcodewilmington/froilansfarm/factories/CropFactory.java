package com.zipcodewilmington.froilansfarm.factories;

import com.zipcodewilmington.froilansfarm.produce.*;

import java.util.ArrayList;
import java.util.List;

public class CropFactory {


    public List<CarrotPlant> createCarrotPlant(Integer numberOfCarrotPlants){return null;}
    public List<PotatoPlant> createPotatoPlant(Integer numberOfPotatoPlants){return null;}

    Integer i = 0;


    public List<TomatoPlant> createTomatoPlant(Integer numberOfTomatoPlants) {
        List<TomatoPlant> cropList = new ArrayList<TomatoPlant>();
        while (i < numberOfTomatoPlants) {
            cropList.add(new TomatoPlant());
            i++;
        }
        return cropList;
    }

    public List<CornStalk> createCornStalk(Integer numberOfCornStalks) {
        return null;
    }

    public List<WheatStalk> createWheatStalk(Integer numberOfWheatStalks) {
        return null;
    }

}
