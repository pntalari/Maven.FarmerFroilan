package com.zipcodewilmington.froilansfarm.Animals;

import com.zipcodewilmington.froilansfarm.Interfaces.Animal;
import com.zipcodewilmington.froilansfarm.Interfaces.Edible;
import com.zipcodewilmington.froilansfarm.Interfaces.Producer;
import com.zipcodewilmington.froilansfarm.Produce.EarCorn;
import com.zipcodewilmington.froilansfarm.Produce.EdibleEgg;

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

    public EdibleEgg yield() {
        if(this.hasBeenFertilized){
            EdibleEgg egg = new EdibleEgg();
            return egg;
        }
        else{
            return null;
        }
    }

    public Boolean fertilize() {
        this.hasBeenFertilized = true;
        return hasBeenFertilized;
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
}
