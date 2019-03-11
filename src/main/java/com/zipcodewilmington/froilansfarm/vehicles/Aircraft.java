package com.zipcodewilmington.froilansfarm.vehicles;

import com.zipcodewilmington.froilansfarm.interfaces.Vehicle;

public abstract class Aircraft implements Vehicle {
    int totalMilesFlown;

    public void fly(int miles){
        totalMilesFlown += miles;
    }

    public int getTotalMilesFlown() {
        return totalMilesFlown;
    }
}
