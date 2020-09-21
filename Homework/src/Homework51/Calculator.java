package Homework51;

public class Calculator {
    private double a;
    private double b;
    private String sign;
    private String result;

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

    public void setSign(String sign) {
        this.sign = sign;
    }

    public String getResult() {
        return result;
    }

    public void setResult(String result) {
        this.result = result;
    }

    public String getSign() {
        return sign;
    }

    public void multiple() {
        System.out.println(getA() * getB());
        setResult(Double.toString(getA() * getB()));
        ConsoleLogger logger = new ConsoleLogger();
        logger.log(getResult());
    }

    public void additive() {
        System.out.println(getA() + getB());
        setResult(Double.toString(getA() + getB()));
        FileLogger logger = new FileLogger();
        logger.log(getResult());
    }

    public void minus() {
        System.out.println(getA() - getB());
        setResult(Double.toString(getA() - getB()));
        DbLogger logger = new DbLogger();
        logger.log(getResult());
    }

    public void delimeter() {
        if (getB() == 0) {
            System.out.println("Деление на ноль запрещено!");
        }
        else {
            System.out.println(getA() / getB());

            setResult(Double.toString(getA() / getB()));
            ConsoleLogger logger = new ConsoleLogger();
            logger.log(getResult());
        }
    }

}
