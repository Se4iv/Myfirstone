package Homework32;

public class Animal {
    private String food;
    private String location;

    public String getFood() {
        return food;
    }

    public String getLocation() {
        return location;
    }

    public Animal(String food, String location) {
        this.food = food;
        this.location = location;
    }

    public String makeNoise(String name) {
        return name + " шумит";
    }

    public String eat(String name) {
        return name + " ест";
    }

    public String sleep(String name) {
        return name + "  спит!";
    }
}
