package SecondTask;

public class Computer {

    private String price;
    private String type;
    private RAM ram;
    private HDD hdd;


    public Computer(String computerPrice, String computerType, RAM ram1, HDD hdd1)
    {
        price=computerPrice;
        type=computerType;
        //this.ram=ram1.getNameRAM();
        //this.hdd=;
    }
    public Computer()
    {
        price ="Unknown";
        type="Unknown";
        ram = new RAM();
        hdd = new HDD();
    }



    void getInfoComputer()
    {
        System.out.println("Computer cost: "+price);
        System.out.println("Computer model: "+type);
        System.out.println(hdd.getInfoHDD());
        System.out.println (ram.getInfoRAM());

    }
}
