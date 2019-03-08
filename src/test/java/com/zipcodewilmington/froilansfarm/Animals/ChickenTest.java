package com.zipcodewilmington.froilansfarm.Animals;

import com.zipcodewilmington.froilansfarm.Produce.EdibleEgg;
import org.junit.Assert;
import org.junit.jupiter.api.Test;

class ChickenTest {
    Chicken chickObj = new Chicken();
    EdibleEgg egg = new EdibleEgg();

    @Test
    void makeNoiseTest() {
        String expectedNoise = "Cock-a-doodle-do!!";
        String actualNoise = chickObj.makeNoise();
        Assert.assertEquals(expectedNoise, actualNoise);
    }

    @Test
    void fertilizeTest() {
        Boolean expectedBool = true;
        Boolean actualBool = chickObj.fertilize();
        Assert.assertEquals(expectedBool, actualBool);
    }

    @Test
    void yieldTest() {
        //Given
        chickObj.fertilize();
        //When
        Object actualObj = chickObj.yield();
        //Then
        Assert.assertTrue(actualObj instanceof EdibleEgg);
    }

    @Test
    void eatTest() {

    }
}