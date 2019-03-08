package com.zipcodewilmington.froilansfarm.storage;

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
