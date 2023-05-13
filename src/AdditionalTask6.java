import java.util.Arrays;
import java.util.Scanner;

public class AdditionalTask6 {
    public static void main(String[] args)
    {
        getAddTask2();
    }
    public static void getAddTask2()
    {
        //Дополнительное задание, создать массив строк и отсортировать его (задание 6)

        String[] myArray= new String[]{"Henry","Scott","Ben","William", "Piers","Fiona","Robert","Tom","Johnny","Adel"};

        for (int index=0; index<myArray.length; index++)
            System.out.print(myArray[index]+" ");
        System.out.println();
        for (int index=0; index<myArray.length; index++)
            Arrays.sort(myArray);
        for (int index=0; index<myArray.length; index++)
            System.out.print(myArray[index]+" ");

    }
}
