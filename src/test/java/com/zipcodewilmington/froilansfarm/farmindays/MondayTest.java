package com.zipcodewilmington.froilansfarm.farmindays;

import com.zipcodewilmington.froilansfarm.Farm;
import com.zipcodewilmington.froilansfarm.FarmBuilder;
import com.zipcodewilmington.froilansfarm.people.*;
import org.junit.Before;

import java.util.ArrayList;
import java.util.List;


public class MondayTest {

    private Farm farm;

    @Before
    public void setUp() throws Exception {
        List<Person> farmWorkerList = new ArrayList<>();

        FarmWorker workerFroiln = new FarmWorker();
        FarmWorker workerFroilinda = new FarmWorker();

        Person froilin = new FarmerDecorator(new BotanistDecorator(new RiderDecorator(workerFroiln)));
        Person froilinda = new FarmerDecorator(new PilotDecorator(workerFroilinda));

        farmWorkerList.add(froilin);
        farmWorkerList.add(froilinda);

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

        farm = new FarmBuilder().setFarmWorkerList(farmWorkerList)
                .setNumberOfCarrotPlants(numberOfCarrotPlants)
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



}