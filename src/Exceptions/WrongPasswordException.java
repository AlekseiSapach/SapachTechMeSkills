package Exceptions;

public class WrongPasswordException extends Exception {
    private String info;

    public WrongPasswordException() {
        info = "Incorrect password";
    }

    public WrongPasswordException(String info) {
        super(info);
        this.info = info;
    }
}
