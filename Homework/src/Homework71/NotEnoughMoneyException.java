package Homework71;

public class NotEnoughMoneyException extends Exception{

    public NotEnoughMoneyException() {
    }

    public NotEnoughMoneyException(String message) {
        super(message);
    }

    public void here() throws Throwable {
        throw new NotEnoughMoneyException();
    }
}
