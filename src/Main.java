import java.util.Scanner;

public class Main {
    public static void main(String[] args)
    {
        getPersonData();
    }
    public static void getPersonData()
    {
        Scanner enter = new Scanner(System.in);
        System.out.print("Введите Имя: ");
        String name = enter.nextLine();
        System.out.print("Введите Фамилию: ");
        String surname = enter.nextLine();
        System.out.print("Введите Возраст: ");
        String age = enter.nextLine();
        System.out.print("Введите Рост  в см: ");
        String height = enter.nextLine();
        System.out.print("Введите Вес в кг: ");
        String weight = enter.nextLine();
        System.out.println("Имя и Фамилия: " + name + " " + surname);
        System.out.println("Возраст: "+ age);
        System.out.println("Рост "+height + " см" +", Вес: "+weight + " кг");
    }
}