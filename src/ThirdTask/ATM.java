package ThirdTask;

import java.util.Scanner;

public class ATM
{
    private int banknote20;
    private int banknote50;
    private int banknote100;
    private int counter;
    private int summa;
    private boolean count;

    public ATM(int bank20,int bank50,int bank100)
    {
        banknote20 = bank20;
        banknote50 = bank50;
        banknote100 = bank100;
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

    void getCashWithdrawal()
    {
        summa=banknote20*20+banknote50*50+banknote100*100;
        System.out.print("Какую сумму Вы хотите снять: ");
        counter= input().nextInt();
        if (summa >= counter)
        {
            count=true;
            System.out.println(true +" Успешно");
        }
        else
        {
            System.out.println(count +" Введенная сумма больше суммы денег в банкомате");
        }
    }
}
