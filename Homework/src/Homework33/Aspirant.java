package Homework33;

import Homework33.Student;

public class Aspirant extends Student {

    private String scienceWork;

    public Aspirant(String firstname, String lastname, String group, double mark) {
        super(firstname, lastname, group, mark);
    }

    @Override
    public int getScholarship() {
        int sum;
        if (getAverageMark() == 5) {
            sum = 200;
        } else {
            sum = 180;
        }
        return sum;
    }
}
