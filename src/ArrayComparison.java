import java.util.Scanner;

public class ArrayComparison {

    public static void main(String[] args)
    {
        getArrayComparison();
    }
    public static void getArrayComparison()
    {
        //Сравнение среднего арифметического двух массивов (задание 3)

        int mySum=0;
        int mySum1=0;
        double myAverage;
        double myAverage1;
        int[] myArray= new int[5];
        int[] myArray2= new int[5];
        for (int index=0; index<myArray.length;index++)
            myArray[index]=(int) (Math.random()*100);
        for (int index=0; index<myArray.length;index++)
            System.out.print(myArray[index]+" ");
        System.out.println();
        for (int index=0; index<myArray2.length;index++)
            myArray2[index]=(int) (Math.random()*100);
        for (int index=0; index<myArray2.length;index++)
            System.out.print(myArray2[index]+" ");
        System.out.println();

        for (int index=1; index<myArray.length;index++)
            mySum+=myArray[index];
        myAverage=mySum/5;
        System.out.println("Среднее арифметическое всех элементов  первого массива: "+myAverage);
        for (int index=1; index<myArray2.length;index++)
            mySum1+=myArray2[index];
        myAverage1=mySum1/5;
        System.out.println("Среднее арифметическое всех элементов  второго массива: "+myAverage1);
        if (myAverage>myAverage1)
            System.out.println("Среднее арифметическое первого массива больше среднего арифметического второго массива");
        else if (myAverage<myAverage1)
            System.out.println("Среднее арифметическое второго массива больше среднего арифметического первого массива");
        else
            System.out.println("Среднее значение первого массива равно среднему арифметическому второго массива");

    }
}
