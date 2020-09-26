package Homework62;

public class Orange extends Fruit {
    private final String typeOrn = "Orange";
    private float weight = 1.5f;

    public float getWeight() {
        return weight;
    }

    @Override
    public String typeFruit() {
        return typeOrn;
    }
}
