package SecondTask;

public class HDD {
    private String nameHDD;
    private int memoryHDD;
    private String typeHDD;

    public HDD()
    {
        nameHDD = "Unknown";
        memoryHDD = 0;
        typeHDD="Unknown";
    }
    public HDD(String name,int memory,String type)
    {
        nameHDD=name;
        memoryHDD=memory;
        typeHDD=type;
    }

    boolean getInfoHDD()
    {
        System.out.println("Name HDD: "+nameHDD);
        System.out.println("Memory HDD: "+memoryHDD);
        System.out.println("Type HDD"+typeHDD);


        return true;
    }
}
