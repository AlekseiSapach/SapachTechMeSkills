package FirstTask;

import java.util.Scanner;

public class CreditCard {
    private String accountNumber = "0000 0000 0000 0000";
    private int currentAmount;
    private int summa;

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public void setCurrentAmount(int currentAmount) {
        this.currentAmount = currentAmount;
    }

    public void setSumma(int summa) {
        this.summa = summa;
    }

    void getCardInfo()
    {
        System.out.println("Card account number: "+ accountNumber);
        System.out.println("Current amount on the card: " + currentAmount);
    }
    void cashWithdrawal()
    {
        System.out.println("Withdrawal from a credit card: "+ summa);
        System.out.println("Current card balance: " + (currentAmount-summa));
    }
    void getRefill()
    {
        System.out.println("Crediting funds to the card: "+ summa);
        System.out.println("Current card balance: " + (currentAmount+summa));
    }
}
