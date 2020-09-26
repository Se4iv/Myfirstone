package Homework4;

public class Circle implements Shape {
    private double p = Math.PI;
    private double r;

    public Circle(double r){
        this.r=r;
    }

    @Override
    public double square() {
        return p*r*r;
    }
}
