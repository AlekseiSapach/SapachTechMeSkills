package SecondTask;

public class HDD {
    private String nameHDD;
    private String memoryHDD;
    private String typeHDD;

    public HDD()
    {
        nameHDD = "Unknown";
        memoryHDD = "Unknown";
        typeHDD="Unknown";
    }
    public HDD(String name,String memory,String type)
    {
        nameHDD=name;
        memoryHDD=memory;
        typeHDD=type;
    }

    void getInfoHDD()
    {
        System.out.println("Name HDD: "+nameHDD);
        System.out.println("Memory HDD: "+memoryHDD);
        System.out.println("Type HDD: "+typeHDD);

    }
}
