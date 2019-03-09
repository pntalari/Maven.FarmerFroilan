package com.zipcodewilmington.froilansfarm.Produce;

import com.zipcodewilmington.froilansfarm.produce.Crop;
import com.zipcodewilmington.froilansfarm.produce.CropRow;
import com.zipcodewilmington.froilansfarm.produce.TomatoPlant;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class CropRowTest {

    @Test
    public void addCropTest() {
        //Given
        CropRow cropRow = new CropRow();

        TomatoPlant tomatoPlant1 = new TomatoPlant();
        //When
        cropRow.addCrop(tomatoPlant1);
        Crop actual = cropRow.getCrops();
        //Then
        Assert.assertEquals(tomatoPlant1, actual);
    }

     @Test
    public void getCropsTest() {
        //Given
        CropRow cropRow = new CropRow();
        TomatoPlant tomatoPlant1 = new TomatoPlant();
        TomatoPlant tomatoPlant2 = new TomatoPlant();

        //When
        cropRow.addCrop(tomatoPlant1);
        cropRow.addCrop(tomatoPlant2);

        Crop actual = cropRow.getCrops();

        //Then
       Assert.assertNotNull(cropRow.getCrops());

     }

    @Test
    public void harvestCropsTest() {
        //Given
        CropRow cropRow = new CropRow();
        TomatoPlant tomatoPlant = new TomatoPlant();
        //When
        cropRow.addCrop(tomatoPlant);
        Crop actual = cropRow.harvestCrops();

        //Then
        Assert.assertNull(cropRow.getCrops());
    }
}