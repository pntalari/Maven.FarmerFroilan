package com.zipcodewilmington.froilansfarm.animals;
import com.zipcodewilmington.froilansfarm.interfaces.Animal;
import com.zipcodewilmington.froilansfarm.interfaces.Edible;
import com.zipcodewilmington.froilansfarm.interfaces.Ridable;
import com.zipcodewilmington.froilansfarm.produce.EarCorn;

public class Horse implements Animal, Ridable {
    private Boolean isHorseRidden = false;
    private Boolean isHorseFed = false;
    private EarCorn horsefood;

    public Horse() {
        this.isHorseRidden = false;
        this.horsefood = null;
        this.isHorseFed = false;
    }

    public String makeNoise() {
        return "neigh!";
    }

    public void eat(Edible food) {
        this.horsefood = (EarCorn) food;
        if (horsefood != null && horsefood instanceof EarCorn) {
            this.isHorseFed = true;
        }
    }

    public void ride() {
        this.isHorseRidden = true;
    }

    public Boolean getHorseRidden() {
        return this.isHorseRidden;
    }

    public Boolean getHorseFed() {
        return this.isHorseFed;
    }

    @Override
    public void work() {

    }
}
