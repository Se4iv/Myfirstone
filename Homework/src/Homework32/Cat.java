package Homework32;

import Homework32.Animal;

public class Cat extends Animal {
    private String clawType;

    public Cat(String food, String location, String clawtype) {
        super(food,location);
        this.clawType = clawtype;
    }

    public String makeNoise(String name) {
        return name + " шипит ";
    }

    public String eat(String name) {
        return name + " заглатывает";
    }
}
