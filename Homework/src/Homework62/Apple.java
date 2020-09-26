package Homework62;

public class Apple extends Fruit {
    private final String typeApp = "Apple";
    private float weight = 1f;

    public float getWeight() {
        return weight;
    }


    @Override
    public String typeFruit() {
        return typeApp;
    }
}
