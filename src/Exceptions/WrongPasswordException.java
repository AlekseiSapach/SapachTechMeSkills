package Exceptions;

public class WrongPasswordException extends Exception {
    private String info = "Incorrect password";

    public WrongPasswordException()
    {

    }

    public WrongPasswordException(String info) {
        super(info);
        this.info = info;
    }
}
