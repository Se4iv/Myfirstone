package Homework42;

public class SportCar extends Car{
    private String maxSpeed;

    @Override
    public void start() {
        System.out.println(" SportCar поехал");
    }

    @Override
    public void stop() {
        System.out.println(" SportCar остановился");
    }

    @Override
    public void printInfo() {
        System.out.println(getType() + " " + getModel() + " " + getWeight() + " " + getEngine());
    }
}
