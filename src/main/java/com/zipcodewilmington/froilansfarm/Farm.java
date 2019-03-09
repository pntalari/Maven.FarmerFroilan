package com.zipcodewilmington.froilansfarm;

import com.zipcodewilmington.froilansfarm.factories.AnimalFactory;
import com.zipcodewilmington.froilansfarm.factories.CropFactory;
import com.zipcodewilmington.froilansfarm.factories.StorageFactory;
import com.zipcodewilmington.froilansfarm.factories.VehicleFactory;
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

    public  Farm(){
        Field fieldObj = Field.getInstance();
        CropRow cropRowobj1 = new CropRow();
        CropRow cropRowobj2 = new CropRow();
        CropRow cropRowobj3 = new CropRow();

        fieldObj.addToStorage(cropRowobj1);
        fieldObj.addToStorage(cropRowobj2);
        fieldObj.addToStorage(cropRowobj3);

        //create Crop factory
        CropFactory cropFactory = new CropFactory();
        cropFactory.createCornStalk(50);
        cropFactory.createWheatStalk(50);

        cropRowobj1.addCrop(cropFactory.createTomatoPlant(50));
        cropRowobj2.addCrop(cropFactory.createCornStalk(50));
        cropRowobj3.addCrop(cropFactory.createWheatStalk(50));

        AnimalFactory animalFactory = new AnimalFactory();

        StorageFactory storageFactory = new StorageFactory();

        List<ChickenCoop> chickenCoopList = storageFactory.createChickenCoops(4);
        List<Stable> stableList = storageFactory.createStables(3);
        List<FarmHouse> farmHouse = storageFactory.createFarmHouses(1);

        animalFactory.createHorse(10);

        chickenCoopList.get(0).addToStorage(animalFactory.createChicken(4));
        chickenCoopList.get(1).addToStorage(animalFactory.createChicken(4));
        chickenCoopList.get(2).addToStorage(animalFactory.createChicken(4));
        chickenCoopList.get(3).addToStorage(animalFactory.createChicken(3));

        stableList.get(0).addToStorage(animalFactory.createHorse(4));
        stableList.get(1).addToStorage(animalFactory.createHorse(3));
        stableList.get(2).addToStorage(animalFactory.createHorse(3));

        VehicleFactory vehicleFactory = new VehicleFactory();

        vehicleFactory.createCropDuster(1);
        vehicleFactory.createTractor(1);

        FarmWorker friolindaWorker = new FarmWorker();
        FarmWorker froilanWorker = new FarmWorker();

        froilanda = new FarmerDecorator(new RiderDecorator(new PilotDecorator(friolindaWorker)));
        froilan = new FarmerDecorator(new BotanistDecorator(new RiderDecorator(froilanWorker)));

        farmHouse.get(0).addToStorage(froilan);
        farmHouse.get(0).addToStorage(froilanda);
    }


}
