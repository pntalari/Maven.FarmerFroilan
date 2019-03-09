package com.zipcodewilmington.froilansfarm;

import com.zipcodewilmington.froilansfarm.factories.*;
import com.zipcodewilmington.froilansfarm.interfaces.Edible;
import com.zipcodewilmington.froilansfarm.people.*;
import com.zipcodewilmington.froilansfarm.produce.*;
import com.zipcodewilmington.froilansfarm.storage.*;
import com.zipcodewilmington.froilansfarm.vehicles.CropDuster;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by leon on 2/26/18.
 */
public class Farm {

    private Field fieldObj;
    private AnimalFactory animalFactory;
    private StorageFactory storageFactory;
    private CropFactory cropFactory;
    private VehicleFactory vehicleFactory;
    private CropRowFactory cropRowFactory;
    private List<ChickenCoop> chickenCoopList;
    private List<Stable> stableList;
    private List<FarmHouse> farmHouseList;
    private List<CropRow> cropRowList;
    private List<FarmWorker> farmWorkerList;
    private Integer numberOfChickens;
    private Integer numberOfStables;
    private Integer numberOfFarmHouse;
    private Integer numberOfChickenCoops;
    private Integer numberOfHorses;
    private Integer numberOfCropDusters;
    private Integer numberOfTractors;
    private Integer numberOfCropRows;
    private Integer numberOfCornStalks;
    private Integer numberOfWheatStalks;
    private Integer numberOfTomatoPlants;
    private Integer numberOfPotatoPlants;
    private Integer numberOfCarrotPlants;


    public Farm(List<FarmWorker> farmWorkerList, Integer numberOfChickens, Integer numberOfStables, Integer numberOfFarmHouse, Integer numberOfChickenCoops, Integer numberOfHorses, Integer numberOfCropDusters, Integer numberOfTractors, Integer numberOfCropRows, Integer numberOfCornStalks, Integer numberOfWheatStalks, Integer numberOfTomatoPlants, Integer numberOfPotatoPlants, Integer numberOfCarrotPlants) {
        this.farmWorkerList = farmWorkerList;
        this.numberOfChickens = numberOfChickens;
        this.numberOfStables = numberOfStables;
        this.numberOfFarmHouse = numberOfFarmHouse;
        this.numberOfChickenCoops = numberOfChickenCoops;
        this.numberOfHorses = numberOfHorses;
        this.numberOfCropDusters = numberOfCropDusters;
        this.numberOfTractors = numberOfTractors;
        this.numberOfCropRows = numberOfCropRows;
        this.numberOfCornStalks = numberOfCornStalks;
        this.numberOfWheatStalks = numberOfWheatStalks;
        this.numberOfTomatoPlants = numberOfTomatoPlants;
        this.numberOfPotatoPlants = numberOfPotatoPlants;
        this.numberOfCarrotPlants = numberOfCarrotPlants;
    }

    public Farm() {
        fieldObj = Field.getInstance();


        animalFactory = new AnimalFactory();
        storageFactory = new StorageFactory();
        vehicleFactory = new VehicleFactory();
        cropFactory = new CropFactory();
        cropRowFactory = new CropRowFactory();

//        froilanda = new FarmerDecorator(new RiderDecorator(new PilotDecorator(friolindaWorker)));
//        froilan = new FarmerDecorator(new BotanistDecorator(new RiderDecorator(froilanWorker)));

        cropRowList = cropRowFactory.createCropRows(5);

        cropFactory.createCornStalk(50);
        cropFactory.createWheatStalk(50);
        chickenCoopList = storageFactory.createChickenCoops(4);
        stableList = storageFactory.createStables(3);
        farmHouseList = storageFactory.createFarmHouses(1);

        animalFactory.createHorse(10);

        chickenCoopList.get(0).addToStorage(animalFactory.createChicken(4));
        chickenCoopList.get(1).addToStorage(animalFactory.createChicken(4));
        chickenCoopList.get(2).addToStorage(animalFactory.createChicken(4));
        chickenCoopList.get(3).addToStorage(animalFactory.createChicken(3));

        stableList.get(0).addToStorage(animalFactory.createHorse(4));
        stableList.get(1).addToStorage(animalFactory.createHorse(3));
        stableList.get(2).addToStorage(animalFactory.createHorse(3));


        vehicleFactory.createCropDuster(1);
        vehicleFactory.createTractor(1);



//        farmHouseList.get(0).addToStorage(froilan);
//        farmHouseList.get(0).addToStorage(froilanda);
//




        fieldObj.addToStorage(cropRowList.get(0));
        fieldObj.addToStorage(cropRowList.get(1));
        fieldObj.addToStorage(cropRowList.get(2));
    }


}
