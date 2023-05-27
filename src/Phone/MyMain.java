package Phone;
import java.util.Scanner;
public class MyMain {
    public static void main(String[] args)
    {
        Phone phone1=new Phone("375336625897","Apple","132 гр");
        Phone phone2=new Phone("375295625097","Oppo","112 гр");
        Phone phone3=new Phone("375447859862","Samsung","150 гр");

        phone1.sendMessage("375336611364","375295003714","375441412598");

        System.out.println(phone1.getNumber());
        phone1.receiveCall("3756854125", input().nextLine());
        System.out.println();

        System.out.println(phone2.getNumber());
        phone2.receiveCall("375445896474", input().nextLine());
        System.out.println();

        System.out.println(phone3.getNumber());
        phone3.receiveCall("375251459862", input().nextLine());
    }
    public static Scanner input()
    {
        return new Scanner(System.in);
    }
}
