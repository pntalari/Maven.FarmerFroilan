package com.zipcodewilmington.froilansfarm;

import com.zipcodewilmington.froilansfarm.people.Person;

import java.util.List;

public class FarmBuilder {
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

    public FarmBuilder setNumberOfChickens(Integer numberOfChickens) {
        this.numberOfChickens = numberOfChickens;
        return this;
    }

    public FarmBuilder setNumberOfStables(Integer numberOfStables) {
        this.numberOfStables = numberOfStables;
        return this;
    }

    public FarmBuilder setNumberOfFarmHouse(Integer numberOfFarmHouse) {
        this.numberOfFarmHouse = numberOfFarmHouse;
        return this;
    }

    public FarmBuilder setNumberOfChickenCoops(Integer numberOfChickenCoops) {
        this.numberOfChickenCoops = numberOfChickenCoops;
        return this;
    }

    public FarmBuilder setNumberOfHorses(Integer numberOfHorses) {
        this.numberOfHorses = numberOfHorses;
        return this;
    }

    public FarmBuilder setNumberOfCropDusters(Integer numberOfCropDusters) {
        this.numberOfCropDusters = numberOfCropDusters;
        return this;
    }

    public FarmBuilder setNumberOfTractors(Integer numberOfTractors) {
        this.numberOfTractors = numberOfTractors;
        return this;
    }

    public FarmBuilder setNumberOfCropRows(Integer numberOfCropRows) {
        this.numberOfCropRows = numberOfCropRows;
        return this;
    }

    public FarmBuilder setNumberOfCornStalks(Integer numberOfCornStalks) {
        this.numberOfCornStalks = numberOfCornStalks;
        return this;
    }

    public FarmBuilder setNumberOfWheatStalks(Integer numberOfWheatStalks) {
        this.numberOfWheatStalks = numberOfWheatStalks;
        return this;
    }

    public FarmBuilder setNumberOfTomatoPlants(Integer numberOfTomatoPlants) {
        this.numberOfTomatoPlants = numberOfTomatoPlants;
        return this;
    }

    public FarmBuilder setNumberOfPotatoPlants(Integer numberOfPotatoPlants) {
        this.numberOfPotatoPlants = numberOfPotatoPlants;
        return this;
    }

    public FarmBuilder setNumberOfCarrotPlants(Integer numberOfCarrotPlants) {
        this.numberOfCarrotPlants = numberOfCarrotPlants;
        return this;
    }

    public Farm build() {
        return new Farm(numberOfChickens, numberOfStables, numberOfFarmHouse,
                numberOfChickenCoops, numberOfHorses, numberOfCropDusters, numberOfTractors, numberOfCropRows,
                numberOfCornStalks, numberOfWheatStalks, numberOfTomatoPlants, numberOfPotatoPlants,
                numberOfCarrotPlants);
    }
}
