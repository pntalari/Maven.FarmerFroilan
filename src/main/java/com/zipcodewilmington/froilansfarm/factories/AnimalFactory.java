package com.zipcodewilmington.froilansfarm.factories;

import com.zipcodewilmington.froilansfarm.animals.Chicken;
import com.zipcodewilmington.froilansfarm.animals.Horse;

import java.util.ArrayList;
import java.util.List;

public class AnimalFactory {
    public List<Chicken> createChicken(Integer numberOfChicken){
        return null;
    }
    public List<Horse> createHorse(Integer numberOfHorse){
        List<Horse> horses = new ArrayList<>();

        for (int i = 0; i < numberOfHorse; i++) {
           horses.add(new Horse());
        }
        return horses;
    }
}
