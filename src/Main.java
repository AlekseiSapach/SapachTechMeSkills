import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //getSwitchCase();
        //getIfElse();
        //getEvenNumber();
        //getTemperature();
        getRainbowColor();

    }

    public static int getMonth() {
        System.out.print("Enter month number: ");
        Scanner enter = new Scanner(System.in);
        int mount = enter.nextInt();
        return mount;

    }

    public static int getNumber() {
        System.out.print("Enter number: ");
        Scanner enter = new Scanner(System.in);
        int number = enter.nextInt();
        return number;

    }

    public static int getTemp() {
        System.out.print("Enter air temperature: ");
        Scanner enter = new Scanner(System.in);
        int temp = enter.nextInt();
        return temp;

    }

    public static void getSwitchCase() {
        /*
        Вывод названия поры года по номеру месяца,
        через оператор Switch-case
         */
        int myMount = getMonth();
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
        int myMount1 = getMonth();

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
        int myNumber = getNumber();
        if (myNumber % 2 == 0) {
            System.out.println("Чётное число");
        } else {
            System.out.println("Нечётное число");
        }
    }

    public static void getTemperature() {
        //температура на улице
        int myTemp = getTemp();

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
        int myColor = getNumber();

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
}
