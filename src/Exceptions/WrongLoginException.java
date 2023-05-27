package Exceptions;

public class WrongLoginException extends Exception {

    private String info = "Incorrect login";

    public WrongLoginException()
    {

    }

    public WrongLoginException(String info) {
        super(info);
        this.info = info;
    }
}
