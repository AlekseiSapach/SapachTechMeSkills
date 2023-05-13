import java.util.Scanner;

public class AdditionalTask5 {
    public static void main(String[] args)
    {
        getAddTask1();
    }
    public static void getAddTask1()
    {
        //Дополнительное задание, заменить элементы с нечётным индексом нолями (задание 5)
        System.out.print("Enter array size: ");
        Scanner enter=new Scanner(System.in);
        int myNumb = enter.nextInt();
        int count=0;
        int[] myArray= new int[myNumb];

        for (int index=0; index<myArray.length; index++)
            myArray[index]=(int) (Math.random()*100);
        for (int index=0; index<myArray.length; index++)
            System.out.print(myArray[index]+" ");
        System.out.println();
        for (int index=0; index<myArray.length; index++)
            if (index%2==1)
                myArray[index]=0;
        for (int index=0; index<myArray.length; index++)
            System.out.print(myArray[index]+" ");


        enter.close();


    }
}
