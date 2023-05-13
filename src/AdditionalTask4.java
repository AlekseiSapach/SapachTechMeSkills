import java.util.Scanner;

public class AdditionalTask4 {

    public static void main(String[] args)
    {
        getAddTask();
    }
    public static void getAddTask()
    {
        //Дополнительное задание, создание второго массива из чётных элементов первого массива (задание 4)
        System.out.print("Enter array size from 5 to 10: ");
        Scanner enter=new Scanner(System.in);
        int myNumb = enter.nextInt();
        int count=0;
        while (myNumb<5 || myNumb>10)
        {
            System.out.println("Array size must not be less than 5 and greater than 10");
            System.out.print("Enter array size from 5 to 10: ");
            myNumb = enter.nextInt();
        }
        int[] myArray= new int[myNumb];
        int[] myArray1=new int[myArray.length];
        for (int index=0; index<myArray.length; index++)
            myArray[index]=(int) (Math.random()*100);
        for (int index=0; index<myArray.length; index++)
            System.out.print(myArray[index]+" ");
        System.out.println();
        for (int index=0; index<myArray.length; index++)
            if(myArray[index]%2==1)
                count++;
            else
                myArray[index-count]=myArray[index];
        for (int index =0; index<myArray1.length;index++)
            myArray1[index]=myArray[index];
        for (int index =0; index<myArray1.length-count;index++)
            System.out.print(myArray1[index]+" ");
        enter.close();


    }
}
