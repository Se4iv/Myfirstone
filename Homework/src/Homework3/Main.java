package Homework3;

public class Main {
    public static void main(String[] args){

        Phone phone1 = new Phone();
        Phone phone2 = new Phone();
        Phone phone3 = new Phone();
        System.out.println("Model " + phone1.getModel() + " Weight "
                + phone1.getWeight() + " Number " + phone1.getNumber());
        System.out.println("Model " + phone2.getModel() + " Weight "
                + phone2.getWeight() + " Number " + phone2.getNumber());
        System.out.println("Model " + phone3.getModel() + " Weight "
                + phone3.getWeight() + " Number " + phone3.getNumber());
    }
}
