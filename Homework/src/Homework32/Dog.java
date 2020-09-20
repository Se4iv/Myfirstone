package Homework32;

import Homework32.Animal;

public class Dog extends Animal {
    private String furType;

    public Dog(String food, String location, String furtype) {
        super(food,location);
        this.furType = furtype;
    }


    public String makeNoise(String name) {
        return name + " рычит";
    }

    public String eat(String name) {
        return name + " чавкает";
    }
}
