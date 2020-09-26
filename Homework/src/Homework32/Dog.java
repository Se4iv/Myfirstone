package Homework32;

import Homework32.Animal;

public class Dog extends Animal {
    private String furType;

    public Dog(String food, String location, String furtype) {
        super(food,location);
        this.furType = furtype;
        super.name ="Собака";
    }


    public String makeNoise() {
        return name + " рычит";
    }

    public String eat() {
        return name + " чавкает";
    }
}
