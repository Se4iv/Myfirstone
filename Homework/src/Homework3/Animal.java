package Homework3;

public class Animal {
    protected String food;
    protected String location;

    public Animal() {
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
