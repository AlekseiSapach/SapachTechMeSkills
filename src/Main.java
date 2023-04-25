/*
Начало обучения программирования на языке Java
Начало обучению Автоматизации тестирования на языке Java
 */
import java.util.Scanner; //импорт библиотеки?
public class Main {
    public static void main(String[] args) {
        // Моя первая программа
        System.out.println("Hello Aleksei");
        System.out.print("Please, enter your name: " + "Сапач Алексей");
        System.out.println();
        System.out.println("Please, enter your surname: ");
        System.out.println("Please, enter your age: ");

        System.out.println("Let's calculate sum of 5 + 10: " + (5 + 10));
        System.out.println("Алексей" + " " + "Сапач" +
                ". Welcome to my First " +
                "Lesson to...");

        // This is an example comment for Git
        System.out.println();
        System.out.print("Please, enter your name & surname: ");
        Scanner scanner = new Scanner(System.in);
        scanner.nextLine();

        // Переменные в java

        String name = "0125";
        int age = 31;
        double weight = 88.99;
        char symbol = 'A';
    }
}