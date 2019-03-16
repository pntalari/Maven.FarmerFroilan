package com.zipcodewilmington.froilansfarm.storage;

import com.zipcodewilmington.froilansfarm.animals.Chicken;
import com.zipcodewilmington.froilansfarm.factories.AnimalFactory;
import com.zipcodewilmington.froilansfarm.interfaces.Edible;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public abstract class Storage<T> {

    private List<T> itemsToBeStored;
    Storage storage;

    public Storage() {
        itemsToBeStored = new ArrayList<>();
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
//        LinkedList<Edible> retrievedItems = new LinkedList<Edible>();
//        retrievedItems.add(storage.retrieveItems());
//
//        while (!retrievedItems.getLast().getLabel().equals(type));
//        {
//        retrievedItems.add(storage.retrieveItems());
//            if(retrievedItems.getLast() == null)
//                break;
//        }
//        for (int i = 0; i <retrievedItems.size() - 2 ; i++) {
//            storage.addItem(retrievedItems.get(i));
//        }
//        return retrievedItems.getLast();

        return itemsToBeStored;
    }

}
