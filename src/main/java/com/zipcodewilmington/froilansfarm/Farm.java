package com.zipcodewilmington.froilansfarm;

import com.zipcodewilmington.froilansfarm.animals.Chicken;
import com.zipcodewilmington.froilansfarm.animals.Horse;
import com.zipcodewilmington.froilansfarm.factories.*;
import com.zipcodewilmington.froilansfarm.people.Person;
import com.zipcodewilmington.froilansfarm.produce.*;
import com.zipcodewilmington.froilansfarm.storage.*;
import com.zipcodewilmington.froilansfarm.vehicles.CropDuster;
import com.zipcodewilmington.froilansfarm.vehicles.Tractor;

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
    private List<Person> farmWorkerList;
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


    public Farm(Integer numberOfChickens, Integer numberOfStables, Integer numberOfFarmHouse, Integer numberOfChickenCoops, Integer numberOfHorses, Integer numberOfCropDusters, Integer numberOfTractors, Integer numberOfCropRows, Integer numberOfCornStalks, Integer numberOfWheatStalks, Integer numberOfTomatoPlants, Integer numberOfPotatoPlants, Integer numberOfCarrotPlants) {
        fieldObj = Field.getInstance();

        animalFactory = new AnimalFactory();
        storageFactory = new StorageFactory();
        vehicleFactory = new VehicleFactory();
        cropFactory = new CropFactory();
        cropRowFactory = new CropRowFactory();

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

        this.createFarmHouse();
        this.createStable();
        this.createChickenCoop();

        this.createTractors();
        this.createCropDuster();

        this.createCropRows();

        this.createTomatoPlant();
        this.createWheatStalk();
        this.createCornStalk();
        this.createPotatoPlant();
        this.createCarrotPlant();

        this.addChickensToCoop();
        this.addCropRowsToField();
        this.addHorsesToStable();
        this.addCropsToCropRow();
        this.addWorkersToFarmHouse();
    }

    public Farm() {


    }

    public List<FarmHouse> createFarmHouse(){
        return storageFactory.createFarmHouses(numberOfFarmHouse);
    }

    public List<Stable> createStable(){
        return storageFactory.createStables(numberOfStables);
    }

    public List<ChickenCoop> createChickenCoop(){
        return storageFactory.createChickenCoops(numberOfChickenCoops);
    }

    public List<Chicken> createChicken() {
        return animalFactory.createChicken(numberOfChickens);
    }

    public List<Horse> createHorse() {
        return animalFactory.createHorse(numberOfHorses);
    }

    public List<CropRow> createCropRows() {
        return cropRowFactory.createCropRows(numberOfCropRows);
    }

    public List<CornStalk> createCornStalk() {
        return cropFactory.createCornStalk(numberOfCornStalks);
    }

    public List<TomatoPlant> createTomatoPlant() {
        return cropFactory.createTomatoPlant(numberOfTomatoPlants);
    }

    public List<WheatStalk> createWheatStalk() {
        return cropFactory.createWheatStalk(numberOfWheatStalks);
    }

    public List<PotatoPlant> createPotatoPlant() {
        return cropFactory.createPotatoPlant(numberOfPotatoPlants);
    }

    public List<CarrotPlant> createCarrotPlant() {
        return cropFactory.createCarrotPlant(numberOfCarrotPlants);
    }

    public List<Tractor> createTractors(){
        return vehicleFactory.createTractor(numberOfTractors);
    }

    public List<CropDuster> createCropDuster(){
        return vehicleFactory.createCropDuster(numberOfCropDusters);
    }

    public void setStorageFactory(StorageFactory storageFactory) {
        this.storageFactory = storageFactory;
    }

    public void setCropFactory(CropFactory cropFactory) {
        this.cropFactory = cropFactory;
    }

    public void setVehicleFactory(VehicleFactory vehicleFactory) {
        this.vehicleFactory = vehicleFactory;
    }

    public void setCropRowFactory(CropRowFactory cropRowFactory) {
        this.cropRowFactory = cropRowFactory;
    }

    public Field getFieldObj() {
        return fieldObj;
    }

    public List<ChickenCoop> getChickenCoopList() {
        return chickenCoopList;
    }

    public List<Stable> getStableList() {
        return stableList;
    }

    public List<FarmHouse> getFarmHouseList() {
        return farmHouseList;
    }

    public List<CropRow> getCropRowList() {
        return cropRowList;
    }

    public List<Person> getFarmWorkerList() {
        return farmWorkerList;
    }
    public Integer getNumberOfChickens() {
        return numberOfChickens;
    }

    public Integer getNumberOfStables() {
        return numberOfStables;
    }

    public Integer getNumberOfFarmHouse() {
        return numberOfFarmHouse;
    }

    public Integer getNumberOfChickenCoops() {
        return numberOfChickenCoops;
    }

    public Integer getNumberOfHorses() {
        return numberOfHorses;
    }

    public Integer getNumberOfCropDusters() {
        return numberOfCropDusters;
    }

    public Integer getNumberOfTractors() {
        return numberOfTractors;
    }

    public Integer getNumberOfCropRows() {
        return numberOfCropRows;
    }

    public Integer getNumberOfCornStalks() {
        return numberOfCornStalks;
    }

    public Integer getNumberOfWheatStalks() {
        return numberOfWheatStalks;
    }

    public Integer getNumberOfTomatoPlants() {
        return numberOfTomatoPlants;
    }

    public Integer getNumberOfPotatoPlants() {
        return numberOfPotatoPlants;
    }

    public Integer getNumberOfCarrotPlants() {
        return numberOfCarrotPlants;
    }

    public void addChickensToCoop()
    {

    }

    public void addHorsesToStable() {
        List<Horse> horses = this.createHorse();
        this.stableList = this.createStable();

        for (Stable s: stableList) {
            addFourHorsesToStable(horses, s);
        }
    }

    private void addFourHorsesToStable(List<Horse> horses, Stable s) {
        for (int i = 0; i < 4; i++) {
            if(horses == null){
                break;
            }
            else{
                s.addToStorage(horses.get(0));
                horses.remove(0);
            }
        }
    }

    public void addWorkersToFarmHouse(){

    }

    public void addCropsToCropRow(){

    }

    public void addCropRowsToField(){

    }


}
