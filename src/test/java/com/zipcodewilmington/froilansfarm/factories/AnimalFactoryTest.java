package com.zipcodewilmington.froilansfarm.factories;

import com.zipcodewilmington.froilansfarm.animals.Chicken;
import com.zipcodewilmington.froilansfarm.animals.Horse;
import org.junit.Assert;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.*;

public class AnimalFactoryTest {

    @Test
    public void createChicken() {
        //Given
        AnimalFactory animalFactory = new AnimalFactory();
        Integer expected = 10;

        //When
        List<Chicken> chickenList = animalFactory.createChicken(10);
        Integer actual = chickenList.size();

        //Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void createHorse() {
        //Given
        AnimalFactory animalFactory = new AnimalFactory();
        Integer expected = 15;

        //When
        List<Horse> horseList = animalFactory.createHorse(15);
        Integer actual = horseList.size();

        //Then
        Assert.assertEquals(expected, actual);
    }
}