package Homework51;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){

        System.out.println(" Введите желаемую операцию: \n");
        Scanner sc  = new Scanner(System.in);

        Calculator calculator = new Calculator();
        try {
            calculator.setA(sc.nextDouble());
            calculator.setSign(sc.next());
            calculator.setB(sc.nextDouble());


        switch (calculator.getSign()) {
            case "+":
                calculator.additive();
                break;
            case "-":
                calculator.minus();
                break;
            case "/":
                calculator.delimeter();
                break;
            case "*":
                calculator.multiple();
                break;
            default:
                System.out.println("Ошибка ввода");
        }
        }
        catch (Exception e){
            System.out.println("Ошибка ввода!");
        }
    }
}
