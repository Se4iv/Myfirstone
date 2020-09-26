package Homework42;

public class Lorry extends Car {
    private String weightPower;

    public Lorry(String model,String type, String weight, Engine engine,String weightpower){
        super(model,type,weight,engine);
        this.weightPower = weightpower;
    }

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
