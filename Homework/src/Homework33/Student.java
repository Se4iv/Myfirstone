package Homework33;

public class Student {
    private String firstName;
    private String lastName;
    private String group;
    private double averageMark;

    public double getAverageMark() {
        return averageMark;
    }

    public Student(String firstname, String lastname, String group, double mark) {
        this.firstName = firstname;
        this.lastName = lastname;
        this.group = group;
        this.averageMark = mark;
    }

    public int getScholarship() {
        int sum;
        if (averageMark == 5) {
            sum = 100;
        } else {
            sum = 80;
        }
        return sum;
    }
}
