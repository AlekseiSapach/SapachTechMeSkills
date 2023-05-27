package Exceptions;

import java.util.Scanner;

public class Credentials {
    public static void main(String[] args) throws WrongLoginException, WrongPasswordException {
        getLogin(input().nextLine(),input().nextLine(),input().nextLine());
    }

    public static Scanner input()
    {
        return new Scanner(System.in);
    }

    static void getLogin(String login, String password, String confirmPassword)
            throws WrongPasswordException,WrongLoginException {
        if(login.contains(" ") | login.length()>20)
        {
            throw new WrongLoginException("Incorrect login");
        }
        if(password.contains(" ") | password.length()>20)
        {
            throw new WrongPasswordException("Incorrect password");
        }
        if (!confirmPassword.equals(password)){
            throw new WrongPasswordException();
        }






    }

}
