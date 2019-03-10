package com.zipcodewilmington.froilansfarm.factories;

import com.zipcodewilmington.froilansfarm.produce.CropRow;

import java.util.ArrayList;
import java.util.List;

public class CropRowFactory {

     public List<CropRow> createCropRows(Integer numberOfCropRows){
         List<CropRow> cropRowList = new ArrayList<>();
         for (int i = 0; i <numberOfCropRows ; i++) {
             cropRowList.add(new CropRow());
         }
         return cropRowList;

     }

}
