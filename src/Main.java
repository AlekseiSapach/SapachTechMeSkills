import java.util.Scanner;

public class Main {
    public static void main(String[] args)
    {
        getNumberSearch();

    }
    public static void getNumberSearch()
    {
        System.out.print("Enter an integer: ");
        Scanner enter=new Scanner(System.in);
        int myNumb = enter.nextInt();
        int count =0;
        int[] myArray= new int[] {6,44,-7,1058,-9685,48,52,109};
        for (int index=0; index<myArray.length;index++)
        {
            if (myArray[index]==myNumb)
                count++;

        }
        if (count>0)
            System.out.println("Enter the number included in the array");
         else
            System.out.println("Enter a number not in the array");


    }
}