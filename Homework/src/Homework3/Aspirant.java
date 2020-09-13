package Homework3;

public class Aspirant extends Student{

    public Aspirant(){

    }
    public Aspirant(String firstname, String lastname, String group, double mark){
        super(firstname, lastname, group, mark);
    }

    @Override
    public int getScholarship() {
        int sum;
        if (averageMark == 5) {
            sum = 200;
        } else {
            sum = 180;
        }
        return sum;
    }
}
