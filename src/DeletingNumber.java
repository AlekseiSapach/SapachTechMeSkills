import java.util.Scanner;

public class DeletingNumber {
    public static void main(String[] args)
    {
        getDeleting();

    }
    public static void getDeleting()
    {
        //Удаление числа из массива (задание 1)
        System.out.print("Enter an integer: ");
        Scanner enter=new Scanner(System.in);
        int myNumb = enter.nextInt();
        int count =0;
        int[] myArray= new int[] {6,44,-7,105,44,48,52,109};
        int[] myArray1 = new int[myArray.length];
        for (int index=0; index<myArray.length;index++)
        {
            if (myArray[index]==myNumb)
            {
                count++;
            }else
                myArray[index-count]=myArray[index];
        }
        if (count==0)
            System.out.println("There is no such number in the array");
        for (int index =0; index<myArray1.length;index++)
            myArray1[index]=myArray[index];
        for (int index =0; index<myArray1.length-count;index++)
            System.out.print(myArray1[index]+" ");




    }
}