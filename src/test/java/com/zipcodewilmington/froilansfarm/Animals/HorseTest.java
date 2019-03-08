package com.zipcodewilmington.froilansfarm.Animals;

import org.junit.Assert;
import org.junit.Test;

class HorseTest {
    Horse horseObj = new Horse();

    @Test
    void makeNoiseTest() {
        String expectedNoise = "neigh!";
        String actualNoise = horseObj.makeNoise();
        Assert.assertEquals(expectedNoise, actualNoise);
    }

    @Test
    void rideTest() {

    }

    @Test
    void eatTest() {
    }
}