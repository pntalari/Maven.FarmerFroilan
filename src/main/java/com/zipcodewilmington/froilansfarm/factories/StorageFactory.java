package com.zipcodewilmington.froilansfarm.factories;

import com.zipcodewilmington.froilansfarm.storage.ChickenCoop;
import com.zipcodewilmington.froilansfarm.storage.FarmHouse;
import com.zipcodewilmington.froilansfarm.storage.Stable;
import com.zipcodewilmington.froilansfarm.storage.Storage;

import java.util.ArrayList;
import java.util.List;

public class StorageFactory <T extends Storage> {

    public List<ChickenCoop> createChickenCoops(Integer numberOfCoops){
        return null;
    }
    public List<FarmHouse> createFarmHouses(Integer numberOfFarmHouses){
        return null;
    }

    public List<Stable> createStables(Integer numberOfStables){
        List<Stable> result = new ArrayList<>();
        for (int i = 0; i < numberOfStables; i++) {
            result.add(new Stable());
        }
        return result;
    }
}
