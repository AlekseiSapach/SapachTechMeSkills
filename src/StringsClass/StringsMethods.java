package StringsClass;

import java.util.Scanner;

public class StringsMethods {
    public static void main(String[] args)
    {
        getOutput(input().nextLine());
        System.out.println();
        //characterReplacement(input().nextLine());
        System.out.println();
        //letterOutput(input().nextLine());
        System.out.println();
        //getUppercase(input().nextLine());
        System.out.println();
        //entryCheckABC(input().nextLine());
        System.out.println();
        //entryCheck555(input().nextLine());
        System.out.println();
        //entryCheck1a2b(input().nextLine());

    }

    public static Scanner input()
    {
        System.out.print("Введите номер документа формат xxxx-yyy-xxxx-yyy-xyxy, где x — это число, " +
                "а y — это буква: ");
        return new Scanner(System.in);
    }
    public static void getOutput(String numberDoc)
    {
        StringBuilder stringBuilder = new StringBuilder(numberDoc);
        stringBuilder.delete(4,8);
        stringBuilder.delete(9,18);
        System.out.println(stringBuilder);
    }
    public static void characterReplacement(String numberDoc)
    {

    }
    public static void letterOutput(String numberDoc)
    {

    }
    public static void getUppercase(String numberDoc)
    {

    }
    public static void entryCheckABC(String numberDoc)
    {

    }
    public static void entryCheck555(String numberDoc)
    {

    }
    public static void entryCheck1a2b(String numberDoc)
    {

    }
}
