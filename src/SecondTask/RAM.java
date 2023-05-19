package SecondTask;

public class RAM {
    private String nameRAM;
    private int memoryRAM;

    public String getNameRAM() {
        return nameRAM;
    }

    public RAM()
    {
        nameRAM = "Unknown";
        memoryRAM = 0;
    }
    public RAM(String name,int memory)
    {
        nameRAM=name;
        memoryRAM=memory;
    }
    boolean getInfoRAM()
    {
        System.out.println("Name RAM: "+nameRAM);
        System.out.println("Memory RAM: "+memoryRAM);

        return true;
    }
}
