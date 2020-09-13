package Homework3;

public class Cat extends Animal {
    private String clawType;

    public Cat(String clawtype) {
        this.clawType = clawtype;
        super.location = "Street";
        super.food = "Whiskas";
    }

    public String makeNoise(String name) {
        return name + " шипит ";
    }

    public String eat(String name) {
        return name + " заглатывает";
    }
}
