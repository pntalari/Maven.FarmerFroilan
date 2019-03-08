package com.zipcodewilmington.froilansfarm.vehicles;
import org.junit.Assert;
import org.junit.Test;


public class CropDusterTest {
    CropDuster cropDusterObj = new CropDuster();

    @Test
    public void makeNoiseTest() {
        String expectedNoise = "Sawing!!!";
        String actualNoise = cropDusterObj.makeNoise();
        Assert.assertEquals(expectedNoise, actualNoise);
    }

    @Test
    public void fertilizeTest() {
    }

    @Test
    public void operateTest() {
    }

    @Test
    public void rideTest() {
    }
}