package com.zipcodewilmington.froilansfarm.storage;

import com.zipcodewilmington.froilansfarm.animals.Chicken;

import java.util.List;

public class ChickenCoop extends Storage<Chicken> {

    List<Chicken> chickenList;
    public ChickenCoop() {
    }

//    public void addChickenToCoop(List<Chicken> chickenList){
//        this.chickenList = chickenList;
//    }

//    public void removeAllChickenFromCoop(List<Chicken> chicken){
//
//    }
//
//    public void removeFewChickenFromCoop(List<Chicken> chicken){
//
//    }

//    public void removeAChickenFromCoop(Integer chickenIndex){
//        this.chickenList.remove(chickenIndex);
//    }

    public List<Chicken> getChickenList() {
        return chickenList;
    }
}
