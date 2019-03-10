package com.zipcodewilmington.froilansfarm.factories;

import com.zipcodewilmington.froilansfarm.animals.Chicken;
import com.zipcodewilmington.froilansfarm.animals.Horse;

import java.util.ArrayList;
import java.util.List;

public class AnimalFactory {
    public List<Chicken> createChicken(Integer numberOfChicken){
        List<Chicken> chickens = new ArrayList<>();

        for (int i = 0; i < numberOfChicken; i++) {
            chickens.add(new Chicken());
        }
        return chickens;
    }

    public List<Horse> createHorse(Integer numberOfHorse){
        List<Horse> horses = new ArrayList<>();

        for (int i = 0; i < numberOfHorse; i++) {
           horses.add(new Horse());
        }
        return horses;
    }
}
