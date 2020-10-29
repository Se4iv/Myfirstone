package Homework51;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Calculator calc = new Calculator(LoggerType.DB);
        calc.calculate();
//        Calculator calc1 = new Calculator(LoggerType.CONSOLE);
//        calc.calculate();
//        Calculator calc2 = new Calculator(LoggerType.FILE);
//        calc.calculate();

    }
}
