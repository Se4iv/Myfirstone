package Homework33;

public class Main {
    public static void main(String[] args) {

        Student student = new Aspirant("John","Guver First","Pro",5);
        Student[] students = new Student[]{
                new Student("John","Eksel","Best", 4),
                new Aspirant("Ben","Hendriks", "Asps",5)};

        for (Student s: students) {
            System.out.println(s.getScholarship());
        }
    }
}
