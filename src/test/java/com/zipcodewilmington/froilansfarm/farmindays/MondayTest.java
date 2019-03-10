package com.zipcodewilmington.froilansfarm.farmindays;

import com.zipcodewilmington.froilansfarm.Farm;
import com.zipcodewilmington.froilansfarm.FarmBuilder;
import com.zipcodewilmington.froilansfarm.animals.Horse;
import com.zipcodewilmington.froilansfarm.people.*;
import com.zipcodewilmington.froilansfarm.produce.CornStalk;
import com.zipcodewilmington.froilansfarm.produce.CropRow;
import com.zipcodewilmington.froilansfarm.produce.EarCorn;
import com.zipcodewilmington.froilansfarm.storage.Stable;
import jdk.nashorn.internal.ir.WhileNode;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;


public class MondayTest {

    private Farm farm;
    private FarmWorker workerFroiln;
    private FarmWorker workerFroilinda;

    @Before
    public void setUp() throws Exception {
        List<Person> farmWorkerList = new ArrayList<>();

        workerFroiln = new FarmWorker();
        workerFroilinda = new FarmWorker();

        Integer numberOfChickens = 15;
        Integer numberOfStables = 3;
        Integer numberOfFarmHouse = 1;
        Integer numberOfChickenCoops = 4;
        Integer numberOfHorses = 10;
        Integer numberOfCropDusters = 1;
        Integer numberOfTractors = 1;
        Integer numberOfCropRows = 5;
        Integer numberOfCornStalks = 50;
        Integer numberOfWheatStalks = 50;
        Integer numberOfTomatoPlants = 50;
        Integer numberOfPotatoPlants = 50;
        Integer numberOfCarrotPlants = 50;

        farm = new FarmBuilder().setNumberOfCarrotPlants(numberOfCarrotPlants)
                .setNumberOfChickenCoops(numberOfChickenCoops)
                .setNumberOfChickens(numberOfChickens)
                .setNumberOfCornStalks(numberOfCornStalks)
                .setNumberOfCropDusters(numberOfCropDusters)
                .setNumberOfCropRows(numberOfCropRows)
                .setNumberOfFarmHouse(numberOfFarmHouse)
                .setNumberOfHorses(numberOfHorses)
                .setNumberOfPotatoPlants(numberOfPotatoPlants)
                .setNumberOfTomatoPlants(numberOfTomatoPlants)
                .setNumberOfStables(numberOfStables)
                .setNumberOfTractors(numberOfTractors)
                .setNumberOfWheatStalks(numberOfWheatStalks)
                .build();
    }

    @Test
    public void testRideHorses() {
        //Given
        List<Horse> horses = new ArrayList<>();
        Person froilin = new RiderDecorator(workerFroiln);
        Person frolinda = new RiderDecorator(workerFroilinda);
        Boolean ridden = false;
        for (Stable s : farm.getStableList()) {
            horses.addAll(s.getStoredItems());
        }

        //When
        for (int i = 0; i < horses.size(); i++) {
            froilin.work();
            horses.get(i).ride();

            frolinda.work();
            horses.get(i + 1).ride();

            i++;
        }

        //Then
        for (Horse h : horses) {
            if (!h.getHorseRidden()) {
                ridden = false;
                break;
            } else {
                ridden = true;
            }
        }
        Assert.assertTrue(ridden);
    }

    @Test
    public void testFeedHorse() {
        //Given
        ArrayList<Horse> horses = new ArrayList<>();
        Person froilan = new FarmerDecorator(workerFroiln);
        Person froilinda = new FarmerDecorator(workerFroilinda);
        Boolean horseFed = false;

        List<CornStalk> cornStalks = farm.getCropRowList().get(0).getCrops();
        List<EarCorn> earCorns = new ArrayList<>();

        for (int i = 0; i < farm.getCropRowList().get(0).getCrops().size(); i++) {
            cornStalks.get(i).fertilize();
            cornStalks.get(i).harvest();
            earCorns.add(cornStalks.get(i).yield());
        }

        for (Stable s : farm.getStableList()) {
            horses.addAll(s.getStoredItems());
        }

        //When
        int j = 0;
        while(j<horses.size()) {
            for (int i = 0; i < 3; i++) {
                froilan.work();
                horses.get(j).eat(earCorns.get(i));

                froilinda.work();
                horses.get(j + 1).eat(earCorns.get(i + 1));
            }
            j+=2;
        }

        //Then
        for (Horse h : horses) {
            if (!h.getHorseFed()) {
                horseFed = false;
                break;
            } else
                horseFed = true;
        }
        Assert.assertTrue(horseFed);

    }
}