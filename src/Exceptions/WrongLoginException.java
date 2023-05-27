package Exceptions;

public class WrongLoginException extends Exception {

    private String info;

    public WrongLoginException() {
        info = "Incorrect login";
    }

    public WrongLoginException(String info) {
        super(info);
        this.info = info;
    }
}
