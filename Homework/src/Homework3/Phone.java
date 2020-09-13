package Homework3;

public class Phone {
    private int number;
    private int weight;
    private int model;

    //constructor no parameters
    public Phone() {
    }

    //constructor three parameters
    public Phone(int number, int model, int weight) {
        this(number, model);
        this.weight = weight;
    }

    //constructor two parameters
    public Phone(int number, int model) {
        this.number = number;
        this.model = model;
    }

    public int getNumber() {
        return number;
    }

    public int getWeight() {
        return weight;
    }

    public int getModel() {
        return model;
    }

    public String receiveCall(String name) {
        return "Звонит " + name;
    }

    public String receiveCall(String name, int number) {
        return "Звонит " + name + " " + number;
    }

    public String sendMessage(String... vars) {
        String x = "";
        for (String a : vars) {
            x += " " + a;
        }
        return x;
    }
}
