package Homework51;

import java.util.Scanner;

public class Calculator {
    private double a;
    private double b;
    private String operation;
    private double result;
    private LoggerType logger;
    private Logger operationLog;

    public double getA() {
        return a;
    }

    public double getB() {
        return b;
    }

    public void setA(double a) {
        this.a = a;
    }

    public void setB(double b) {
        this.b = b;
    }

    public void setOperation(String sign) {
        this.operation = sign;
    }

    public double getResult() {
        return result;
    }

    public void setResult(double result) {
        this.result = result;
    }

    public String getOperation() {
        return operation;
    }

    public LoggerType getLogger() {
        return logger;
    }

    public void setLogger(LoggerType logger) {
        this.logger = logger;
    }

    public Calculator(LoggerType type) {
        System.out.println(" Введите желаемую операцию: \n");
        Scanner sc = new Scanner(System.in);

        setA(sc.nextDouble());
        setOperation(sc.next());
        setB(sc.nextDouble());
        setLogger(type);
        switch (getLogger()) {
            case CONSOLE:
                ConsoleLogger consoleLogger = new ConsoleLogger();
                calculate();
                consoleLogger.log(Double.toString(getResult()));
                break;
            case DB:
                DbLogger dbLogger = new DbLogger();
                calculate();
                dbLogger.log(Double.toString(getResult()));
                break;
            case FILE:
                FileLogger fileLogger = new FileLogger();
                calculate();
                fileLogger.log(Double.toString(getResult()));
                break;
            default:
                System.out.println("Неверное значение логирования. Выберите из опций - CONSOLE, DB, FILE!");
        }

    }

    public void multiple() {
        setResult(getA() * getB());

    }

    public void additive() {
        setResult(getA() + getB());
    }

    public void minus() {
        setResult(getA() - getB());
    }

    public void delimeter() {
        if (getB() == 0) {
            System.out.println("Деление на ноль запрещено!");
        } else {
            setResult(getA() / getB());
        }
    }

    public void calculate() {
        switch (getOperation()) {
            case "+":
                additive();
                break;
            case "-":
                minus();
                break;
            case "/":
                delimeter();
                break;
            case "*":
                multiple();
                break;
            default:
                System.out.println("Ошибка ввода");
        }
    }

}
