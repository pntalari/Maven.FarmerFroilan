package com.zipcodewilmington.froilansfarm.Produce;

import com.zipcodewilmington.froilansfarm.Interfaces.Edible;
import com.zipcodewilmington.froilansfarm.Interfaces.Producer;

public abstract class Crop<T extends Edible> implements Producer {

    public abstract T yield();
}
