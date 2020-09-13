package Homework3;

public class Student {
    protected String firstName;
    protected String lastName;
    protected String group;
    protected double averageMark;

    //public final Student student = new Aspirant(firstName, lastName, group, averageMark);
    public Student(){

    }

    public Student(String firstname, String lastname, String group, double mark){
        this.firstName=firstname;
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
