package StringsClass;

import java.util.Scanner;

public class StringsMethods {
    public static void main(String[] args)
    {
        //getOutput(input().nextLine());
        //System.out.println();
        //characterReplacement(input().nextLine());
        //System.out.println();
        letterOutput(input().nextLine());
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
        StringBuilder stringBuilder = new StringBuilder(numberDoc);
        stringBuilder.replace(5,8,"***");
        stringBuilder.replace(14,18,"***");
        System.out.println(stringBuilder);
    }
    public static void letterOutput(String numberDoc)
    {
        StringBuilder stringBuilder = new StringBuilder(numberDoc);
        stringBuilder.delete(0,5);
        stringBuilder.delete(3,8);
        stringBuilder.deleteCharAt(7);
        stringBuilder.setCharAt(3,'/');
        stringBuilder.setCharAt(7,'/');
        stringBuilder.setCharAt(9,'/');
        System.out.println(stringBuilder);
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
