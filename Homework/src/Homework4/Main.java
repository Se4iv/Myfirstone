package Homework4;

public class Main {
    public static void main(String[]args){
        Shape[] shape = new Shape[3];
        shape[0] = new Triangle(3,4,5);
        shape[1] = new Circle(4);
        shape[2] = new Rectangle(6,7);
        for (Shape sh: shape){
            System.out.println("Площадь фигуры: " + sh.square());
        }
    }
}


