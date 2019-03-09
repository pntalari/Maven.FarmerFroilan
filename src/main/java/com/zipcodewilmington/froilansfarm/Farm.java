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
    private Person froilan;
    private Person froilanda;
    private FarmWorker friolindaWorker;
    private FarmWorker froilanWorker;
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


    public Farm() {
        fieldObj = Field.getInstance();


        animalFactory = new AnimalFactory();
        storageFactory = new StorageFactory();
        vehicleFactory = new VehicleFactory();
        cropFactory = new CropFactory();
        cropRowFactory = new CropRowFactory();

        froilanda = new FarmerDecorator(new RiderDecorator(new PilotDecorator(friolindaWorker)));
        froilan = new FarmerDecorator(new BotanistDecorator(new RiderDecorator(froilanWorker)));

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



        farmHouseList.get(0).addToStorage(froilan);
        farmHouseList.get(0).addToStorage(froilanda);



        fieldObj.addToStorage(cropRowList.get(0));
        fieldObj.addToStorage(cropRowList.get(1));
        fieldObj.addToStorage(cropRowList.get(2));
    }


}
