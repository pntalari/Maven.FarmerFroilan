package com.zipcodewilmington.froilansfarm.Storage;

import com.zipcodewilmington.froilansfarm.Interfaces.Animal;
import com.zipcodewilmington.froilansfarm.Produce.Crop;

import java.util.ArrayList;
import java.util.List;

public abstract class Storage<T> {

    List<T> storage;

    public Storage() {
        this.storage = new ArrayList<T>();
    }

    public void add(T toBeStored){
        this.storage.add(toBeStored);
    }

    public void remove(T toBeRemoved){
        this.storage.remove(toBeRemoved);
    }
}
