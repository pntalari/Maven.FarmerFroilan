package com.zipcodewilmington.froilansfarm.farmindays;

import com.zipcodewilmington.froilansfarm.Farm;
import com.zipcodewilmington.froilansfarm.animals.Horse;
import com.zipcodewilmington.froilansfarm.people.Person;
import com.zipcodewilmington.froilansfarm.storage.Stable;

import java.util.ArrayList;
import java.util.List;

public class Monday {



    public void feedEachHorse(List<Horse> horses, Person froilan, Person froilinda) {
        for (int i = 0; i < horses.size(); i++) {
            froilan.work();
            horses.get(i).ride();

            froilinda.work();
            horses.get(i + 1).ride();

            i++;
        }
    }


    public Boolean checkEachHorseRidden(List<Horse> horses) {
        Boolean ridden = false;
        for (Horse h : horses) {
            if (!h.getHorseRidden()) {
                ridden = false;
                break;
            } else {
                ridden = true;
            }
        }
        return ridden;
    }

    public List<Horse> getStableHorses(Farm farm) {
        List<Horse> horses = new ArrayList<>();
        for (Stable s : farm.getStableList()) {
            horses.addAll(s.getStoredItems());
        }
        return horses;
    }
}
