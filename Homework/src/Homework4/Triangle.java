package Homework4;

public class Triangle implements Shape{
    private double a;
    private double b;
    private double c;

    public Triangle(double a, double b, double c){
        this.a=a;
        this.b=b;
        this.c=c;
    }

    @Override
    public double square() {
        return a*b*c;
    }
}
