package com.zipcodewilmington.froilansfarm.storage;

import com.zipcodewilmington.froilansfarm.produce.CropRow;

public final class Field extends Storage<CropRow> {
    private Field() {
    }

    private static final Field INSTANCE = new Field();

    public static Field getInstance(){
        return INSTANCE;
    }

}
