package Homework42;

public abstract class Car {
    private String model, type, weight;
    private Engine engine;

    public abstract void  start();
    public abstract void  stop();
    public abstract void  printInfo();

    public Engine getEngine() {
        return engine;
    }

    public String getModel() {
        return model;
    }

    public String getType() {
        return type;
    }

    public String getWeight() {
        return weight;
    }

    public void turnRight(){
        System.out.println("Поворот направо");
    }
    public void turnLeft(){
        System.out.println("Поворот налево");
    }
}
