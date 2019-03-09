package com.zipcodewilmington.froilansfarm;

import com.zipcodewilmington.froilansfarm.factories.*;
import com.zipcodewilmington.froilansfarm.people.FarmWorker;
import com.zipcodewilmington.froilansfarm.people.Person;
import com.zipcodewilmington.froilansfarm.produce.CropRow;
import com.zipcodewilmington.froilansfarm.storage.ChickenCoop;
import com.zipcodewilmington.froilansfarm.storage.FarmHouse;
import com.zipcodewilmington.froilansfarm.storage.Field;
import com.zipcodewilmington.froilansfarm.storage.Stable;

import java.util.List;

public class FarmBuilder {
    private Person froilan;
    private Person froilanda;
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

    public FarmBuilder setFroilan(Person froilan) {
        this.froilan = froilan;
        return this;
    }

    public FarmBuilder setFroilanda(Person froilanda) {
        this.froilanda = froilanda;
        return this;
    }

    public FarmBuilder setFieldObj(Field fieldObj) {
        this.fieldObj = fieldObj;
        return this;
    }

    public FarmBuilder setAnimalFactory(AnimalFactory animalFactory) {
        this.animalFactory = animalFactory;
        return this;
    }

    public FarmBuilder setStorageFactory(StorageFactory storageFactory) {
        this.storageFactory = storageFactory;
        return this;
    }

    public FarmBuilder setCropFactory(CropFactory cropFactory) {
        this.cropFactory = cropFactory;
        return this;
    }

    public FarmBuilder setVehicleFactory(VehicleFactory vehicleFactory) {
        this.vehicleFactory = vehicleFactory;
        return this;
    }

    public FarmBuilder setCropRowFactory(CropRowFactory cropRowFactory) {
        this.cropRowFactory = cropRowFactory;
        return this;
    }

    public FarmBuilder setChickenCoopList(List<ChickenCoop> chickenCoopList) {
        this.chickenCoopList = chickenCoopList;
        return this;
    }

    public FarmBuilder setStableList(List<Stable> stableList) {
        this.stableList = stableList;
        return this;
    }

    public FarmBuilder setFarmHouseList(List<FarmHouse> farmHouseList) {
        this.farmHouseList = farmHouseList;
        return this;
    }

    public FarmBuilder setCropRowList(List<CropRow> cropRowList) {
        this.cropRowList = cropRowList;
        return this;
    }

    public FarmBuilder setFarmWorkerList(List<FarmWorker> farmWorkerList) {
        this.farmWorkerList = farmWorkerList;
        return this;
    }

    public Farm build(){
        return null;
    }
}
