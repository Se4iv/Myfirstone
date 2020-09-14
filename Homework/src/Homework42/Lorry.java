package Homework42;

public class Lorry extends Car {
    private String weightPower;

    @Override
    public void start() {
        System.out.println(" Грузовик поехал");
    }

    @Override
    public void stop() {
        System.out.println(" Грузовик остановился");
    }

    @Override
    public void printInfo() {
        System.out.println(getType() + " " + getModel() + " " + getWeight() + " " + getEngine());
    }
}
