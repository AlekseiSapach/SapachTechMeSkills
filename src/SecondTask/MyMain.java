package SecondTask;

public class MyMain {

    public static void main(String[] args)
    {
        Computer comp1 = new Computer();
        comp1.getInfoComputer();

        System.out.println();

        Computer comp2 = new Computer("2000$","HP");
        comp2.getInfoComputer();
    }
}
