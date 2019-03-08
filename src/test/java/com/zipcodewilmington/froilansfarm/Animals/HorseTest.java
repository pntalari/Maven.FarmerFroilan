package com.zipcodewilmington.froilansfarm.Animals;

import com.sun.org.apache.xpath.internal.operations.Bool;
import com.zipcodewilmington.froilansfarm.Interfaces.Edible;
import com.zipcodewilmington.froilansfarm.Interfaces.Person;
import com.zipcodewilmington.froilansfarm.People.Rider;
import com.zipcodewilmington.froilansfarm.Produce.EarCorn;
import org.junit.Assert;
import org.junit.Test;

public class HorseTest {
    Horse horseObj = new Horse();

    @Test
   public void makeNoiseTest() {
        //Given
        String expectedNoise = "neigh!";
        //When
        String actualNoise = horseObj.makeNoise();
        //Then
        Assert.assertEquals(expectedNoise, actualNoise);
    }

    @Test
    public void eatTest() {
        //Given
        Edible food = new EarCorn();
        Boolean beforeIsFed = false;
        //When
        horseObj.eat(food);
        Boolean afterIsFed = horseObj.getHorseFed();
        Assert.assertNotEquals(beforeIsFed,afterIsFed);
    }

    @Test
    //This should be updated with person/farmer object who should invoke the ride method
    public void rideTest() {
        //Given
        Boolean beforeRide = false;
        //When
        horseObj.ride();
        Boolean afterRide = horseObj.getHorseRidden();
        //Then
        Assert.assertNotEquals(beforeRide,afterRide);
    }


}