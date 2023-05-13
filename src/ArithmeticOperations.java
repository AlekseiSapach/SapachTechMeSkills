import java.util.Scanner;
public class ArithmeticOperations {
    public static void main(String[] args)
    {
        getOperations();
    }
    public static void getOperations()
    {
        //Нахождение мин, макс и среднего значения (задание 2)
        System.out.print("Enter the length of the array: ");
        Scanner enter=new Scanner(System.in);
        int myNumb = enter.nextInt();
        int myMax =0;
        int myMin =0;
        int mySum=0;
        int[] myArray2= new int[myNumb];
        for (int index=0; index<myArray2.length;index++)
            myArray2[index]=(int) (Math.random()*myNumb);
        for (int index=0; index<myArray2.length;index++)
            System.out.print(myArray2[index]+" ");
        System.out.println();
        for (int index=0; index<myArray2.length;index++)
            if(myArray2[index] > myMax)
                myMax=myArray2[index];
        System.out.println("Максимальный элемент массива: "+myMax);
        for (int index=0; index<myArray2.length;index++)
            myMin=myArray2[0];
        for (int index=1; index<myArray2.length;index++)
            if(myMin>myArray2[index])
                myMin=myArray2[index];
        System.out.println("Минимальный элемент массива: "+myMin);
        for (int index=1; index<myArray2.length;index++)
            mySum+=myArray2[index];
        double myAverage=mySum/myNumb;
        System.out.println("Среднее арифметическое всех элементов массива: "+myAverage);
    enter.close();


    }
}