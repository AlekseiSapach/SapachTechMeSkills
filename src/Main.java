import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        getElementIncrease();

    }
    public static void getElementIncrease()
    {
        //Увеличение элемента массива на введенное число
        System.out.print("Enter an integer: ");
        Scanner enter = new Scanner(System.in);
        int counter = enter.nextInt();
        int [][][] myArray = new int[][][]{
                {
                        {1,2,3},
                        {4,5,6},
                        {7,8,9}
                }
        };

        for (int outerDimension = 0; outerDimension < myArray.length; outerDimension++)
        {
            for (int innerDimension = 0; innerDimension < myArray[outerDimension].length; innerDimension++)
            {
                for (int finalDimension = 0; finalDimension < myArray[outerDimension][innerDimension].length; finalDimension++)
                {
                    System.out.print(myArray[outerDimension][innerDimension][finalDimension] + " - ");
                }
                System.out.println();
            }
        }
        for (int outerDimension = 0; outerDimension < myArray.length; outerDimension++)
        {
            for (int innerDimension = 0; innerDimension < myArray[outerDimension].length; innerDimension++)
            {
                for (int finalDimension = 0; finalDimension < myArray[outerDimension][innerDimension].length; finalDimension++)
                {
                    myArray[outerDimension][innerDimension][finalDimension] = myArray[outerDimension][innerDimension][finalDimension]+counter;
                }
            }
        }
        System.out.println();
        for (int outerDimension = 0; outerDimension < myArray.length; outerDimension++)
        {
            for (int innerDimension = 0; innerDimension < myArray[outerDimension].length; innerDimension++)
            {
                for (int finalDimension = 0; finalDimension < myArray[outerDimension][innerDimension].length; finalDimension++)
                {
                    System.out.print(myArray[outerDimension][innerDimension][finalDimension] + " - ");
                }
                System.out.println();
            }
        }
    }
}