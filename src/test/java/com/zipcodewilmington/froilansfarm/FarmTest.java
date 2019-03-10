package com.zipcodewilmington.froilansfarm;

import com.zipcodewilmington.froilansfarm.people.FarmWorker;
import com.zipcodewilmington.froilansfarm.people.Person;
import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class FarmTest {

    @Test
    public void testFarmConstructor(){
        {
            //Given
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

            Integer[] exptectNumberOfFarmObjects = {numberOfChickens, numberOfStables, numberOfFarmHouse,
                    numberOfChickenCoops, numberOfHorses, numberOfCropDusters, numberOfTractors, numberOfCropRows,
                    numberOfCornStalks, numberOfWheatStalks, numberOfTomatoPlants, numberOfPotatoPlants,
                    numberOfCarrotPlants};

            //When
            Farm farm = new Farm(numberOfChickens, numberOfStables, numberOfFarmHouse, numberOfChickenCoops,
                    numberOfHorses, numberOfCropDusters, numberOfTractors, numberOfCropRows, numberOfCornStalks,
                    numberOfWheatStalks, numberOfTomatoPlants, numberOfPotatoPlants, numberOfCarrotPlants);

            Integer[] actualNumberOfFarmObjects = {farm.getNumberOfChickens(), farm.getNumberOfStables(),
                    farm.getNumberOfFarmHouse(), farm.getNumberOfChickenCoops(), farm.getNumberOfHorses(),
                    farm.getNumberOfCropDusters(), farm.getNumberOfTractors(), farm.getNumberOfCropRows(),
                    farm.getNumberOfCornStalks(), farm.getNumberOfWheatStalks(),farm.getNumberOfTomatoPlants(),
                    farm.getNumberOfPotatoPlants(), farm.getNumberOfCarrotPlants()};

            //Then
            Assert.assertArrayEquals(exptectNumberOfFarmObjects, actualNumberOfFarmObjects);
        }
    }

    @Test
    public void testNulleryFarmConstructor(){

        //Given
        Integer numberOfChickens = 1;
        Integer numberOfStables = 1;
        Integer numberOfFarmHouse = 1;
        Integer numberOfChickenCoops = 1;
        Integer numberOfHorses = 1;
        Integer numberOfCropDusters = 1;
        Integer numberOfTractors = 1;
        Integer numberOfCropRows = 1;
        Integer numberOfCornStalks = 1;
        Integer numberOfWheatStalks = 1;
        Integer numberOfTomatoPlants = 1;
        Integer numberOfPotatoPlants = 1;
        Integer numberOfCarrotPlants = 1;

        Integer[] exptectNumberOfFarmObjects = {numberOfChickens, numberOfStables, numberOfFarmHouse,
                numberOfChickenCoops, numberOfHorses, numberOfCropDusters, numberOfTractors, numberOfCropRows,
                numberOfCornStalks, numberOfWheatStalks, numberOfTomatoPlants, numberOfPotatoPlants,
                numberOfCarrotPlants};

        //When
        Farm farm = new Farm();

        Integer[] actualNumberOfFarmObjects = {farm.getNumberOfChickens(), farm.getNumberOfStables(),
                farm.getNumberOfFarmHouse(), farm.getNumberOfChickenCoops(), farm.getNumberOfHorses(),
                farm.getNumberOfCropDusters(), farm.getNumberOfTractors(), farm.getNumberOfCropRows(),
                farm.getNumberOfCornStalks(), farm.getNumberOfWheatStalks(),farm.getNumberOfTomatoPlants(),
                farm.getNumberOfPotatoPlants(), farm.getNumberOfCarrotPlants()};

        //Then
        Assert.assertArrayEquals(exptectNumberOfFarmObjects, actualNumberOfFarmObjects);
    }

    @Test
    public void addHorsesToStable() {
    }
}