package com.zipcodewilmington.froilansfarm.Interfaces;

public interface Person extends Eater, NoiseMaker {
    public void eat(Edible food);

    public String makeNoise();
}
