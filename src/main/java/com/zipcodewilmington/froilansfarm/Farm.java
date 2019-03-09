package com.zipcodewilmington.froilansfarm;

import com.zipcodewilmington.froilansfarm.factories.CropFactory;
import com.zipcodewilmington.froilansfarm.interfaces.Edible;
import com.zipcodewilmington.froilansfarm.people.Person;
import com.zipcodewilmington.froilansfarm.produce.*;
import com.zipcodewilmington.froilansfarm.storage.ChickenCoop;
import com.zipcodewilmington.froilansfarm.storage.FarmHouse;
import com.zipcodewilmington.froilansfarm.storage.Field;
import com.zipcodewilmington.froilansfarm.storage.Storage;
import com.zipcodewilmington.froilansfarm.vehicles.CropDuster;

import java.util.ArrayList;

/**
 * Created by leon on 2/26/18.
 */
public class Farm {
    private java.util.List<com.zipcodewilmington.froilansfarm.storage.Stable> stables;
    private java.util.List<ChickenCoop> chickenCoops;
    private FarmHouse farmHouse;
    private Field field = Field.getInstance();

    private CornStalk cornStalk;
    private WheatStalk wheatStalk;
    private TomatoPlant tomatoPlant;
    private CropRow cropRowObj = new CropRow();
    private CropFactory cropFactory = new CropFactory();
    private CropDuster cropDuster = new CropDuster();


    public  Farm(){

      //  storage.add(field1);

        field.add(cropRowObj);

        cropFactory.createCornStalk(50);
        cropFactory.createTomatoPlant(50);
        cropFactory.createWheatStalk(50);

       // cropRowObj.addCrop();// listofCornstalk from factory;
        cropRowObj.addCrop(wheatStalk);
        cropRowObj.addCrop(tomatoPlant);

        tomatoPlant.fertilize();
       // cropDuster.fertilize(1,cornStalk);

        cornStalk = new CornStalk();
        cornStalk.yield();
        wheatStalk = new WheatStalk();
        wheatStalk.fertilize();
        tomatoPlant = new TomatoPlant();
        tomatoPlant.fertilize();


    }
}
