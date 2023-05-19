package FirstTask;
import java.util.Scanner;

public class MyMain {

    public static void main(String[] args)
    {
        CreditCard card1 = new CreditCard();
        CreditCard card2 = new CreditCard();
        CreditCard card3 = new CreditCard();

        card1.setAccountNumber("1200 4589 3325 5847");
        card1.setCurrentAmount(1500);
        card1.setSumma(input().nextInt());

        card2.setAccountNumber("2100 2547 9633 5010");
        card2.setCurrentAmount(3500);
        card2.setSumma(input().nextInt());

        card3.setAccountNumber("3200 2548 9600 2544");
        card3.setCurrentAmount(8500);
        card3.setSumma(input().nextInt());

        card1.getCardInfo();
        System.out.println();
        card2.getCardInfo();
        System.out.println();
        card3.getCardInfo();
        System.out.println();

        card1.getRefill();
        System.out.println();
        card2.getRefill();
        System.out.println();
        card3.cashWithdrawal();


    }
    public static Scanner input()
    {
        return new Scanner(System.in);
    }
}
