package Homework32;

public class Animal {
    private String food;
    private String location;
    protected String name;

    public String getFood() {
        return food;
    }

    public String getLocation() {
        return location;
    }

    public Animal(String food, String location) {
        this.food = food;
        this.location = location;
        this.name = "Животное";
    }

    public String makeNoise() {
        return name + " шумит";
    }

    public String eat() {
        return name + " ест";
    }

    public String sleep() {
        return name + "  спит!";
    }
}
