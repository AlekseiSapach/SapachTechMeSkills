package FirstTask;

import java.util.Scanner;

public class CreditCard {
    double AccountNumber;
    double CurrentAmount;
    double Summa;

    void getCardInfo()
    {
        System.out.println("Card account number: "+ AccountNumber);
        System.out.println("Current amount on the card: " + CurrentAmount);
    }
    void cashWithdrawal()
    {
        Scanner enter = new Scanner(System.in);
        Summa= enter.nextDouble();
        CurrentAmount=CurrentAmount-Summa;

    }
    void getRefill()
    {
        Scanner enter = new Scanner(System.in);
        Summa= enter.nextDouble();
        CurrentAmount=CurrentAmount+Summa;
    }
}
