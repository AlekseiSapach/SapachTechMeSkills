package FirstTask;

import java.util.Scanner;

public class CreditCard {
    private String AccountNumber;
    private int CurrentAmount;
    private int Summa;

    public void setAccountNumber(String accountNumber) {
        AccountNumber = accountNumber;
    }

    public void setCurrentAmount(int currentAmount) {
        CurrentAmount = currentAmount;
    }

    public void setSumma(int summa) {
        Summa = summa;
    }

    void getCardInfo()
    {
        System.out.println("Card account number: "+ AccountNumber);
        System.out.println("Current amount on the card: " + CurrentAmount);
    }
    void cashWithdrawal()
    {
        System.out.println("Withdrawal from a credit card: "+ Summa);
        System.out.println("Current card balance: " + (CurrentAmount-Summa));
    }
    void getRefill()
    {
        System.out.println("Crediting funds to the card: "+ Summa);
        System.out.println("Current card balance: " + (CurrentAmount+Summa));
    }
}
