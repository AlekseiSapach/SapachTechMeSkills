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
    private int check;

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
        int b20=20;
        int b50=50;
        int b100=100;
        summa=banknote20*b20+banknote50*b50+banknote100*b100;
        System.out.print("Какую сумму Вы хотите снять: ");
        counter= input().nextInt();
        if (summa <= counter || counter % 10 != 0 || counter == 0)
        {
            System.out.println(count +" Введенная сумма больше суммы денег в банкомате");

        }
        else
        {
            count=true;
            System.out.println(true +" Успешно");
            while (counter > 0 && banknote100 > 0)
            {
                counter -= b100;
                banknote100--;
                check++;
            }
            if (counter < 0)
            {
                counter += b100;
                banknote100++;
                check--;
                System.out.println("Количество банкнот наминалом 100: "+check);
            }
            check=0;
            while (counter > 0 && banknote50 > 0)
            {
                counter -= b50;
                banknote50--;
                check++;
            }
            if (counter < 0)
            {
                counter += b50;
                banknote50++;
                check--;
                System.out.println("Количество банкнот наминалом 50: "+check);
            }
            check=0;
            while (counter > 0 && banknote20 > 0)
            {
                counter -= b20;
                banknote20--;
                check++;
                System.out.println("Количество банкнот наминалом 20: "+check);
            }
        }
    }
}
