package com.zipcodewilmington.froilansfarm.produce;

import java.util.ArrayList;
import java.util.List;

public class CornStalk extends Crop<EarCorn>{

    private List<EarCorn> corn = new ArrayList<>();

    public int yield() {
        if(hasBeenHarvested){
            corn.add(new EarCorn());
        }
        return corn.size();
    }
}
