package Homework42;

public class SportCar extends Car {
    private String maxSpeed;

    public SportCar(String model,String type, String weight, Engine engine,String maxspeed){
        super(model,type,weight,engine);
        this.maxSpeed = maxspeed;
    }

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
