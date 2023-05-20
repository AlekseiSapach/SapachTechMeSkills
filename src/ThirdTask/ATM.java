package ThirdTask;

import java.util.Scanner;

public class ATM
{
    private int banknote20;
    private int banknote50;
    private int banknote100;
    private int counter;

    public ATM()
    {
        banknote20 = 100;
        banknote50 = 100;
        banknote100 = 100;
    }
    public static Scanner input()
    {
        return new Scanner(System.in);
    }

    void getAddingBanknotes()
    {
        System.out.print("Введите количество банкнот номиналом 20: ");
        counter= input().nextInt();
        banknote20=banknote20+counter;

        System.out.print("Введите количество банкнот номиналом 50: ");
        counter= input().nextInt();
        banknote50=banknote50+counter;

        System.out.print("Введите количество банкнот номиналом 100: ");
        counter= input().nextInt();
        banknote100=banknote100+counter;

        System.out.println("Количество банкнот номиналом 20 после пополнения: "+banknote20);
        System.out.println("Количество банкнот номиналом 50 после пополнения: "+banknote50);
        System.out.println("Количество банкнот номиналом 100 после пополнения: "+banknote100);
    }
    void getInfoBanknotes()
    {
        System.out.println("Количество банкнот номиналом 20: "+banknote20);
        System.out.println("Количество банкнот номиналом 50: "+banknote50);
        System.out.println("Количество банкнот номиналом 100: "+banknote100);
    }
}
