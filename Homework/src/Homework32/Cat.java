package Homework32;

import Homework32.Animal;

public class Cat extends Animal {
    private String clawType;

    public Cat(String food, String location, String clawtype) {
        super(food,location);
        this.clawType = clawtype;
        super.name ="Кошка";
    }

    public String makeNoise() {
        return name + " шипит ";
    }

    public String eat() {
        return name + " заглатывает";
    }
}
