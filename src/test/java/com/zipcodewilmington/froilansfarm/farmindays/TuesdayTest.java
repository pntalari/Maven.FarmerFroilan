package com.zipcodewilmington.froilansfarm.farmindays;

import com.zipcodewilmington.froilansfarm.Farm;
import com.zipcodewilmington.froilansfarm.FarmBuilder;
import com.zipcodewilmington.froilansfarm.people.FarmWorker;
import com.zipcodewilmington.froilansfarm.people.FarmerDecorator;
import com.zipcodewilmington.froilansfarm.people.Person;
import com.zipcodewilmington.froilansfarm.people.RiderDecorator;
import com.zipcodewilmington.froilansfarm.produce.*;
import com.zipcodewilmington.froilansfarm.vehicles.Tractor;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class TuesdayTest {
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
    public void testTractorHarvestCrop(){

        //Given
        Person froilan = new FarmerDecorator(new RiderDecorator(workerFroiln));
        List<Tractor> tractors = new ArrayList<>();

        List<CropRow> cropRows = farm.getCropRowList();
        List<CornStalk> cornStalks = cropRows.get(0).getCrops();
        List<TomatoPlant> tomatoPlants = cropRows.get(1).getCrops();
        List<WheatStalk> wheatStalks = cropRows.get(2).getCrops();
        List<PotatoPlant> potatoPlants = cropRows.get(3).getCrops();
        List<CarrotPlant> carrotPlants = cropRows.get(4).getCrops();
        //When
        for (int i = 0; i < cropRows.size() ; i++) {
            cornStalks.get(i).harvest();
        }
        froilan.work();

        //Then

    }

}