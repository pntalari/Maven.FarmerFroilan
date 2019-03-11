package com.zipcodewilmington.froilansfarm.farmindays;

import com.zipcodewilmington.froilansfarm.Farm;
import com.zipcodewilmington.froilansfarm.animals.Chicken;
import com.zipcodewilmington.froilansfarm.animals.Horse;
import com.zipcodewilmington.froilansfarm.people.FarmWorker;
import com.zipcodewilmington.froilansfarm.people.Person;
import com.zipcodewilmington.froilansfarm.produce.*;
import com.zipcodewilmington.froilansfarm.storage.ChickenCoop;
import com.zipcodewilmington.froilansfarm.storage.Stable;

import java.util.ArrayList;
import java.util.List;

public class Monday {

    public void rideEachHorse(List<Horse> horses, Person froilan, Person froilinda) {
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

    public List<EarCorn> getEdibleCornStalks(Farm farm, List<CornStalk> cornStalks) {
        List<EarCorn> earCorns = new ArrayList<>();
        for (int i = 0; i < farm.getCropRowList().get(0).getCrops().size(); i++) {
            cornStalks.get(i).fertilize();
            cornStalks.get(i).harvest();
            earCorns.add(cornStalks.get(i).yield());
        }
        return earCorns;
    }

    public void feedEachHorse(List<Horse> horses, Person froilan, Person froilinda, List<EarCorn> earCorns) {
        int j = 0;
        while (j < horses.size()) {
            for (int i = 0; i < 3; i++) {
                froilan.work();
                horses.get(j).eat(earCorns.get(i));

                froilinda.work();
                horses.get(j + 1).eat(earCorns.get(i + 1));
            }
            j += 2;
        }
    }

    public Boolean checkEachHorseAte(List<Horse> horses) {
        Boolean horseFed = false;
        for (Horse h : horses) {
            if (!h.getHorseFed()) {
                horseFed = false;
                break;
            } else
                horseFed = true;
        }
        return horseFed;
    }

    public List<Chicken> getCoopChickens(Farm farm) {
        List<Chicken> chickens = new ArrayList<>();
        for (ChickenCoop c : farm.getChickenCoopList()) {
            chickens.addAll(c.getStoredItems());
        }
        return chickens;
    }

    public List<EdibleEgg> getSevenEggs(List<Chicken> chickens) {
        List<EdibleEgg> edibleEggs = new ArrayList<>();
        for (int i = 0; i < 7; i++) {
            chickens.get(i).fertilize();
            edibleEggs.add(chickens.get(i).yield());
        }
        return edibleEggs;
    }


    public int froilanAteCorn(FarmWorker workerFroiln, List<EarCorn> earCorns) {
        int count = 0, froilanAteCornCount = 0;
        for (int i = 0; i < earCorns.size(); i++) {
            if (count == 0) {
                workerFroiln.eat(earCorns.get(i));
                froilanAteCornCount++;
                break;
            }
        }
        return froilanAteCornCount;
    }
}
