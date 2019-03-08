package com.zipcodewilmington.froilansfarm.Animals;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

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