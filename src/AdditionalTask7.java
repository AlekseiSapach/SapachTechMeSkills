import java.lang.module.FindException;
import java.util.Arrays;
import java.util.Scanner;

public class AdditionalTask7 {
    public static void main(String[] args)
    {
        getAddTask3();
    }
    public static void getAddTask3()
    {
        //Дополнительное задание, сортировка пузырьком (задание 7)
        System.out.print("Enter array size: ");
        Scanner enter=new Scanner(System.in);
        int myNumb = enter.nextInt();
        int count;
        int[] myArray= new int[myNumb];

        for (int index=0; index<myArray.length; index++)
            myArray[index]=(int) (Math.random()*100);
        for (int index=0; index<myArray.length; index++)
            System.out.print(myArray[index]+" ");
        System.out.println();
        for (int index=0; index<myArray.length; index++)
            for (int jIndex=0; jIndex<myArray.length-1; jIndex++)
                if (myArray[jIndex]>myArray[jIndex+1])
                {
                    count=myArray[jIndex];
                    myArray[jIndex]=myArray[jIndex+1];
                    myArray[jIndex+1]=count;
                }
        for (int index=0; index<myArray.length; index++)
            System.out.print(myArray[index]+" ");



    }
}
