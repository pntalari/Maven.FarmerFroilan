package com.zipcodewilmington.froilansfarm.vehicles;
import com.zipcodewilmington.froilansfarm.Farm;
import com.zipcodewilmington.froilansfarm.factories.CropFactory;
import com.zipcodewilmington.froilansfarm.interfaces.Edible;
import com.zipcodewilmington.froilansfarm.people.FarmWorker;
import com.zipcodewilmington.froilansfarm.people.FarmerDecorator;
import com.zipcodewilmington.froilansfarm.people.Person;
import com.zipcodewilmington.froilansfarm.people.RiderDecorator;
import com.zipcodewilmington.froilansfarm.produce.*;
import com.zipcodewilmington.froilansfarm.storage.Field;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;


public class CropDusterTest {
    Field field =  Field.getInstance();
    CropDuster cropDusterObj = new CropDuster();
    CropRow<CornStalk> cropRow;
    Person farmer;
     Farm farm = new Farm();

     @Before
     public void setup() {
         List<CornStalk> crop = new CropFactory().createCornStalk(10);
         cropRow = new CropRow(crop, false);
     }


    @Test
    public void makeNoiseTest() {
        String expectedNoise = "Zoom!";
        String actualNoise = cropDusterObj.makeNoise();
        Assert.assertEquals(expectedNoise, actualNoise);
    }

    @Test
    public void fertilizeTest() {
        cropDusterObj.fertilize(cropRow);

        List<CornStalk> crops = cropRow.getCrops();
        for(CornStalk stalk: crops) {
            Assert.assertTrue(stalk.isFertilized());
        }
    }

    @Test
    public void operateTest() {
         int expectedMiles = 10;

         cropDusterObj.operate();

         Assert.assertEquals(expectedMiles, cropDusterObj.getTotalMilesFlown());
    }

    @Test
    public void rideTest() {
            //Given
            Boolean beforeFlown = false;
            //When
            cropDusterObj.ride();
            Boolean afterFlown = cropDusterObj.getCropDusterFlown();
            //Then
            Assert.assertNotEquals(beforeFlown, afterFlown);



    }
}