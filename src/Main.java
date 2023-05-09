import java.util.Scanner;

public class Main {
    public static void main(String[] args)
    {
        //getPersonData();
        //characterInput();
        getBodyMassIndex();
    }
    public static void getPersonData()
    {
        Scanner enter = new Scanner(System.in);
        System.out.print("Введите Имя: ");
        String name = enter.nextLine();
        System.out.print("Введите Фамилию: ");
        String surname = enter.nextLine();
        System.out.print("Введите Возраст: ");
        int age = enter.nextInt();
        System.out.print("Введите Рост  в см: ");
        int height = enter.nextInt();
        System.out.print("Введите Вес в кг: ");
        float weight = enter.nextFloat();
        System.out.println("Имя и Фамилия: " + name + " " + surname);
        System.out.println("Возраст: "+ age);
        System.out.println("Рост "+height + " см" +", Вес: "+weight + " кг");
        enter.close();
    }
    public static void characterInput()
    {
        Scanner enter = new Scanner(System.in);
        System.out.print("Введите символ: ");
        String character = enter.nextLine();
        char myChar = character.charAt(0);
        /*
        так как к строке нельзя применить преобразование типа, а с типом данных char метод scanner
        не работает, пришлось гуглить, как из строки достать нужный символ
        метод charAt() подсмотрел здесь https://javarush.com/groups/posts/2873-charat-v-java
        */
        System.out.println(myChar + " - " + (int) myChar);
        enter.close();
    }
    public static void getBodyMassIndex()
    {
        Scanner enter = new Scanner(System.in);
        System.out.print("Введите вес в кг: ");
        float weight = enter.nextFloat();
        System.out.print("Введите рост в см: ");
        int height = enter.nextInt();
        float myHeight = (float) height/100;
        System.out.println(myHeight);
        float bmi = weight/(myHeight*myHeight);
        System.out.println("BMI = " + bmi + " кг/м^2");
        enter.close();
    }
}