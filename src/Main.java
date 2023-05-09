import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //getSwitchCase();
        //getIfElse();
        //getEvenNumber();
        //getTemperature();
        //getRainbowColor();
        //getOddNumbers();
        //getReverseOrder();
        //getSum();
        //getSubsequence();
        //getSubsequence1();
        getSquareNumber();


    }
    public static int getNumber()
    {
        System.out.print("Enter number: ");
        Scanner enter = new Scanner(System.in);
        int myNumber = enter.nextInt();
        return myNumber;
    }
    public static void getSwitchCase()
    {
        /*
        Вывод названия поры года по номеру месяца,
        через оператор Switch-case
         */
        System.out.print("Enter month number: ");
        Scanner enter = new Scanner(System.in);
        int myMount = enter.nextInt();

        switch (myMount) {
            case 1:
                System.out.println("Winter");
                break;
            case 2:
                System.out.println("Winter");
                break;
            case 3:
                System.out.println("Spring");
                break;
            case 4:
                System.out.println("Spring");
                break;
            case 5:
                System.out.println("Spring");
                break;
            case 6:
                System.out.println("Summer");
                break;
            case 7:
                System.out.println("Summer");
                break;
            case 8:
                System.out.println("Summer");
                break;
            case 9:
                System.out.println("Autumn");
                break;
            case 10:
                System.out.println("Autumn");
                break;
            case 11:
                System.out.println("Autumn");
                break;
            case 12:
                System.out.println("Winter");
                break;
        }
    }

    public static void getIfElse() {
        /*
        Вывод названия поры года по номеру месяца,
        через оператор If-Else if
         */
        System.out.print("Enter month number: ");
        Scanner enter = new Scanner(System.in);
        int myMount1 = enter.nextInt();

        if (myMount1 < 1 || myMount1 > 12) {
            System.out.println("You have entered some crap!");
            return;
        }

        if (myMount1 < 3 || myMount1 > 11) {
            System.out.println("Winter");
        } else if (myMount1 >= 3 && myMount1 <= 5) {
            System.out.println("Spring");
        } else if (myMount1 >= 6 && myMount1 <= 8) {
            System.out.println("Summer");
        } else if (myMount1 >= 9 && myMount1 <= 11) {
            System.out.println("Autumn");
        }
    }

    public static void getEvenNumber() {
        //определение четности числа

        int myNum = getNumber();

        if (myNum % 2 == 0) {
            System.out.println("Чётное число");
        } else {
            System.out.println("Нечётное число");
        }
    }

    public static void getTemperature() {
        //температура на улице
        System.out.print("Enter air temperature: ");
        Scanner enter = new Scanner(System.in);
        int myTemp = enter.nextInt();

        if (myTemp > -5)
        {
            System.out.println("Тепло");
        } else if (myTemp <= -5  && myTemp > -20)
        {
            System.out.println("Нормально");
        } else if (myTemp <= -20)
        {
            System.out.println("Холодно");
        }


    }
    public static void getRainbowColor()
    {
        // определение цвета радуги
        System.out.print("Enter rainbow color number: ");
        Scanner enter = new Scanner(System.in);
        int myColor = enter.nextInt();

        if (myColor < 1 || myColor > 7) {
            System.out.println("You have entered some crap!");
            return;
        }
        switch (myColor) {
            case 1:
                System.out.println("Red");
                break;
            case 2:
                System.out.println("Orange");
                break;
            case 3:
                System.out.println("Yellow");
                break;
            case 4:
                System.out.println("Green");
                break;
            case 5:
                System.out.println("Blue");
                break;
            case 6:
                System.out.println("Indigo");
                break;
            case 7:
                System.out.println("Violet");
                break;
        }

    }
    public static void getOddNumbers()
    {
        //вывод нечётных чисел
        for (int myNum=1; myNum<=99; myNum++)
        {
            if (myNum%2==1)
                System.out.println(myNum);
        }
    }
    public static void getReverseOrder()
    {
       //вывод чисел в обратном порядке
       int myNumb = 5;
       while (myNumb>=1)
       {
           System.out.println(myNumb--);
       }
    }
    public static void getSum()
    {
        //сумма всех чисел до введенного числа пользователя
        System.out.print("Enter a positive number: ");
        Scanner enter = new Scanner(System.in);
        int myNumber = enter.nextInt();
        int sum=0;
        for (int numb=1; numb<=myNumber;numb++)
        {
            sum=sum+numb;
        }
        System.out.println("Сумма чисел = "+sum);
    }
    public static void getSubsequence()
    {
        // вывод последовательности чисел
        int numb = 7;
        int myInt = 1;
        int sum =0;

        while (myInt<=14)
        {
            sum=numb*myInt;
            System.out.print(sum+" ");
            myInt++;
        }
    }
    public static void getSubsequence1()
    {
        // вывод последовательности чисел
        int myInt = 1;
        int sum =0;

        while (myInt<=10)
        {

            System.out.print(sum+" ");
            sum=sum-5;
            myInt++;
        }
    }
    public static void getSquareNumber()
    {
        //вывод квадратов чисел от 10 до 20
        for (int numb=10; numb<=20; numb++)
        {
            System.out.println("Квадрат числа "+ numb + " = "+numb*numb);
        }
    }
}