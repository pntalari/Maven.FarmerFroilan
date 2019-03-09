package com.zipcodewilmington.froilansfarm.Produce;
import com.zipcodewilmington.froilansfarm.produce.CornStalk;
import com.zipcodewilmington.froilansfarm.produce.Crop;
import com.zipcodewilmington.froilansfarm.produce.TomatoPlant;
import org.junit.Test;
import org.junit.Assert;

public class CropTest {
    Crop crop = new Crop() {
        @Override
        public int yield() {
            return null;
        }
    };

    @Test
    public void hasBeenFertilizedTest(){
        //Given
        TomatoPlant tomatoPlant = new TomatoPlant();

        //When
        boolean expected = false;
        boolean actual = tomatoPlant.fertilize();

        //Then
        Assert.assertEquals(expected,actual);

    }

    @Test
    public void hasBeenHarvestedTest(){
        //Given
        CornStalk cornStalk = new CornStalk();

        //When
        boolean expected = false;
        boolean actual = cornStalk.harvest();

        //Then
        Assert.assertEquals(expected,actual);
    }


}
