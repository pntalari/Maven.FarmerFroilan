package com.zipcodewilmington.froilansfarm.vehicles;
import com.zipcodewilmington.froilansfarm.produce.CarrotPlant;
import com.zipcodewilmington.froilansfarm.produce.CornStalk;
import com.zipcodewilmington.froilansfarm.produce.CropRow;
import com.zipcodewilmington.froilansfarm.produce.EarCorn;
import com.zipcodewilmington.froilansfarm.storage.Field;
import org.junit.Assert;
import org.junit.Test;

import java.util.List;


public class CropDusterTest {
    Field field;
    CropDuster cropDusterObj = new CropDuster();
    CropRow cropRow = new CropRow();

    @Test
    public void makeNoiseTest() {
        String expectedNoise = "Zoom!";
        String actualNoise = cropDusterObj.makeNoise();
        Assert.assertEquals(expectedNoise, actualNoise);
    }

    @Test
    public void fertilizeTest() {
        //get field croprows
        //get field crops
        //fertilize the crops

        Boolean isNotFertilized = false;

        field.getStoredItems().get(0).getCrops();
        cropDusterObj.fertilize(cropRow);

        Assert.assertNotEquals(isNotFertilized, cropDusterObj.getCropDusterFertilized());


    }

    @Test
    public void operateTest() {
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