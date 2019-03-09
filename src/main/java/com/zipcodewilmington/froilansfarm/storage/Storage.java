package com.zipcodewilmington.froilansfarm.storage;

import com.zipcodewilmington.froilansfarm.animals.Chicken;

import java.util.ArrayList;
import java.util.List;

public abstract class Storage<T> {

    private List<T> itemsToBeStored = new ArrayList<T>();;

    public Storage() {

    }


    public void addToStorage(T item) {
        this.itemsToBeStored.add(item);
    }

    public void addToStorage(List<T> toBeStored) {
        this.itemsToBeStored = toBeStored;
    }

    public void removeOneFromStorage(T itemToBeRemoved) {

        this.itemsToBeStored.remove(itemToBeRemoved);
    }

    public void removeAllFromStorage(List<T> itemsToBeRemoved) {
        this.itemsToBeStored.removeAll(itemsToBeRemoved);

    }

    public void removeFewFromStorage(Integer startRange, Integer stopRange) {

    }

    public List<T> getStoredItems(){
        return itemsToBeStored;
    }

}
