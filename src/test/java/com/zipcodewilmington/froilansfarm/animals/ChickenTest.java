package com.zipcodewilmington.froilansfarm.animals;
import com.zipcodewilmington.froilansfarm.interfaces.Edible;
import com.zipcodewilmington.froilansfarm.produce.EarCorn;
import com.zipcodewilmington.froilansfarm.produce.EdibleEgg;
import org.junit.Assert;
import org.junit.Test;

public class ChickenTest {
    Chicken chickObj = new Chicken();
    EdibleEgg egg = new EdibleEgg();
    @Test
   public void makeNoiseTest() {
        String expectedNoise = "Cock-a-doodle-do!!";
        String actualNoise = chickObj.makeNoise();
        Assert.assertEquals(expectedNoise, actualNoise);
    }

    @Test
    public void fertilizeTest() {
        Boolean expectedBool = true;
        Boolean actualBool = chickObj.fertilize();
        Assert.assertEquals(expectedBool, actualBool);
    }

    @Test
    public void yieldTest() {
        //Given
        chickObj.fertilize();
        //When
        Object actualObj = chickObj.yield();
        //Then
        Assert.assertTrue(actualObj instanceof EdibleEgg);
    }


    @Test
    public void eatTest() {
        //Given
        Edible food = new EarCorn();
        Boolean beforeIsFed = false;
        //When
        chickObj.eat(food);
        Boolean afterIsFed = chickObj.getChicFed();
        Assert.assertNotEquals(beforeIsFed,afterIsFed);
    }
}