package com.zipcodewilmington.froilansfarm.animals;

import com.zipcodewilmington.froilansfarm.interfaces.Animal;
import com.zipcodewilmington.froilansfarm.interfaces.Edible;
import com.zipcodewilmington.froilansfarm.interfaces.Producer;
import com.zipcodewilmington.froilansfarm.produce.EarCorn;
import com.zipcodewilmington.froilansfarm.produce.EdibleEgg;

public class Chicken implements Producer, Animal {

    private Boolean hasBeenFertilized;
    private EarCorn chicFood;

    private Boolean isChicFed;

    public Chicken() {

        this.hasBeenFertilized = false;
        this.isChicFed = false;
    }

    public String makeNoise() {
        return "Cock-a-doodle-do!!";
    }

    public int yield() {
        if(this.hasBeenFertilized){
            EdibleEgg egg = new EdibleEgg();
            return egg;
        }
        else{
            return null;
        }
    }

    public void fertilize() {
        this.hasBeenFertilized = true;
    }

    public void eat(Edible food) {
        this.chicFood = (EarCorn) food;
        if (chicFood != null && chicFood instanceof EarCorn) {
            this.isChicFed = true;
        }
    }

    public Boolean getHasBeenFertilized() {
        return hasBeenFertilized;
    }

    public Boolean getChicFed() {
        return isChicFed;
    }

    @Override
    public void work() {

    }
}
