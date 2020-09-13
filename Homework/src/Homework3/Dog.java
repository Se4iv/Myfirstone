package Homework3;

public class Dog extends Animal {
    private String furType;

    public Dog(String furtype) {
        this.furType = furtype;
        super.location = "house";
        super.food = "Pedigree";
    }


    public String makeNoise(String name) {
        return name + " рычит";
    }

    public String eat(String name) {
        return name + " чавкает";
    }
}
