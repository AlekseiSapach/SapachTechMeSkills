package SecondTask;

public class Computer {

    private String price;
    private String type;
    private RAM ram;
    private HDD hdd;

    public Computer()
    {
        price ="Unknown";
        type="Unknown";
        ram = new RAM();
        hdd = new HDD();
    }
    RAM ram1 = new RAM();
    HDD hdd1 = new HDD();

    public Computer(String computerPrice, String computerType)
    {
        price=computerPrice;
        type=computerType;
    }

    void getInfoComputer()
    {
        System.out.println("Computer cost: "+price);
        System.out.println("Computer model: "+type);
        ram1.getInfoRAM();
        hdd1.getInfoHDD();

    }
}
