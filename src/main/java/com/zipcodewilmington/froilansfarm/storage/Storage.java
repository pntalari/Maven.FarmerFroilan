package com.zipcodewilmington.froilansfarm.storage;

import java.util.ArrayList;
import java.util.List;

public abstract class Storage<T> {

    List<T> itemsToBeStored;

    public Storage() {
        this.itemsToBeStored = new ArrayList<T>();
    }

    public void add(T toBeStored){
        this.itemsToBeStored.add(toBeStored);
    }

    public void remove(T toBeRemoved){
        this.itemsToBeStored.remove(toBeRemoved);
    }
}
