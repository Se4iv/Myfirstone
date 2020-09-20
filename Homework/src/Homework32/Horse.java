package Homework32;

import Homework32.Animal;

public class Horse extends Animal {
    private String colorType;

    public Horse(String food, String location,String colortype) {
        super(food,location);
        this.colorType = colortype;
    }

    public String makeNoise(String name) {
        return name + " фыркает";
    }

    public String eat(String name) {
        return name + " перемалывает";
    }
}
