package Homework51;

public class DbLogger implements Logger {

    @Override
    public void log(String message) {
        System.out.println("Log into database: " + message);
    }
}
