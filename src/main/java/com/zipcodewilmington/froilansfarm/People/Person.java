package com.zipcodewilmington.froilansfarm.People;

import com.zipcodewilmington.froilansfarm.Interfaces.Animal;
import com.zipcodewilmington.froilansfarm.Interfaces.Edible;

public abstract class Person implements Animal {
    public abstract void eat(Edible food);

    public abstract String makeNoise();
}
