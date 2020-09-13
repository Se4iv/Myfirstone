package Homework3;

public class Horse extends Animal {
    private String colorType;

    public Horse(String colortype) {
        this.colorType = colortype;
        super.location = "Rancho";
        super.food = "Grass";
    }

    public String makeNoise(String name) {
        return name + " фыркает";
    }

    public String eat(String name) {
        return name + " перемалывает";
    }
}
