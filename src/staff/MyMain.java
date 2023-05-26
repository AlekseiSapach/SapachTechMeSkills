package staff;

public class MyMain {
    public static void main(String[]args)
    {
        Director director = new Director("Aleks","Ivanov","director");
        director.getTitle();
        System.out.println();
        Worker worker=new Worker("Leo","Petrov","worker",36);
        worker.getTitle();
        System.out.println();
        Accountant accountant=new Accountant("Kris","Sidorova","accountant",1500.50);
        accountant.getTitle();
    }
}
