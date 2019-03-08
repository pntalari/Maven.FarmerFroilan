package com.zipcodewilmington.froilansfarm.people;

import com.zipcodewilmington.froilansfarm.interfaces.Animal;
import com.zipcodewilmington.froilansfarm.interfaces.Edible;

public abstract class Person implements Animal {
    public abstract void eat(Edible food);

    public abstract String makeNoise();
}
