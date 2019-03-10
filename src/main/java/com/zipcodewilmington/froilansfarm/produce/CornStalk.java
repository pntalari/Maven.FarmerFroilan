package com.zipcodewilmington.froilansfarm.produce;

import com.zipcodewilmington.froilansfarm.interfaces.Edible;

import java.util.ArrayList;
import java.util.List;

public class CornStalk extends Crop<EarCorn>{

    private List<EarCorn> corn = new ArrayList<>();

    public  EarCorn yield() {
        if(hasBeenHarvested){
            return new EarCorn();
        }
        else
            return null;
    }
}
