package com.zipcodewilmington.froilansfarm.farmindays;

import com.zipcodewilmington.froilansfarm.Farm;
import com.zipcodewilmington.froilansfarm.FarmBuilder;
import com.zipcodewilmington.froilansfarm.animals.Chicken;
import com.zipcodewilmington.froilansfarm.animals.Horse;
import com.zipcodewilmington.froilansfarm.people.*;
import com.zipcodewilmington.froilansfarm.produce.*;
import com.zipcodewilmington.froilansfarm.storage.ChickenCoop;
import com.zipcodewilmington.froilansfarm.storage.Stable;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;


public class MondayTest {

    private Farm farm;
    private FarmWorker workerFroiln;
    private FarmWorker workerFroilinda;
    private Monday monday = new Monday();

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
        Person froilin = new RiderDecorator(workerFroiln);
        Person frolinda = new RiderDecorator(workerFroilinda);
        Boolean ridden;

        List<Horse> horses = monday.getStableHorses(farm);

        //When
        monday.rideEachHorse(horses,froilin,frolinda);

        //Then
        ridden = monday.checkEachHorseRidden(horses);

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
        while (j < horses.size()) {
            for (int i = 0; i < 3; i++) {
                froilan.work();
                horses.get(j).eat(earCorns.get(i));

                froilinda.work();
                horses.get(j + 1).eat(earCorns.get(i + 1));
            }
            j += 2;
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

    @Test
    public void testEatBreakFast() {
        //Given
        List<CornStalk> cornStalks = farm.getCropRowList().get(0).getCrops();
        List<TomatoPlant> tomatoPlants = farm.getCropRowList().get(1).getCrops();
        List<Chicken> chickens = new ArrayList<>();
        List<EarCorn> earCorns = new ArrayList<>();
        List<Tomato> tomatoes = new ArrayList<>();
        List<EdibleEgg> edibleEggs = new ArrayList<>();
        int froilanAteEggsCount = 0, froilanAteCornCount = 0, froilanAteTomatoesCount = 0,
                froilindaAteEggsCount = 0, froilindaAteCornCount = 0, froilindaAteTomatoesCount = 0;

        for (ChickenCoop c : farm.getChickenCoopList()) {
            chickens.addAll(c.getStoredItems());
        }

        for (int i = 0; i < 7; i++) {
            chickens.get(i).fertilize();
            edibleEggs.add(chickens.get(i).yield());
        }

        for (int i = 0; i < 3; i++) {
            cornStalks.get(i).fertilize();
            cornStalks.get(i).harvest();

            tomatoPlants.get(i).fertilize();
            tomatoPlants.get(i).harvest();

            earCorns.add(cornStalks.get(i).yield());
            tomatoes.add(tomatoPlants.get(i).yield());
        }

        //When
        int count = 0;
        for (int i = 0; i < earCorns.size(); i++) {
            if (count == 0) {
                workerFroiln.eat(earCorns.get(i));
                froilanAteCornCount++;
                workerFroilinda.eat(tomatoes.get(i));
                froilindaAteTomatoesCount++;
                count++;
            } else {
                workerFroilinda.eat(earCorns.get(i));
                froilindaAteCornCount++;
                workerFroiln.eat(tomatoes.get(i));
                froilanAteTomatoesCount++;
            }
        }

        count = 0;
        for (int i = 0; i < edibleEggs.size(); i++) {
            if (count < 2) {
                workerFroilinda.eat(edibleEggs.get(i));
                froilindaAteEggsCount++;
                count++;
            } else {
                workerFroiln.eat(edibleEggs.get(i));
                froilanAteEggsCount++;
            }
        }

        //Then
        Assert.assertEquals(1, froilanAteCornCount);
        Assert.assertEquals(2, froilanAteTomatoesCount);
        Assert.assertEquals(5, froilanAteEggsCount);

        Assert.assertEquals(2, froilindaAteCornCount);
        Assert.assertEquals(1, froilindaAteTomatoesCount);
        Assert.assertEquals(2, froilindaAteEggsCount);
    }
}