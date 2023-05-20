package SecondTask;

public class RAM {
    private String nameRAM;
    private String memoryRAM;

    public String getNameRAM() {
        return nameRAM;
    }

    public RAM()
    {
        nameRAM = "Unknown";
        memoryRAM = "Unknown";
    }
    public RAM(String name,String memory)
    {
        nameRAM=name;
        memoryRAM=memory;
    }
    void getInfoRAM()
    {
        System.out.println("Name RAM: "+nameRAM);
        System.out.println("Memory RAM: "+memoryRAM);

    }
}
