package Phone;

public class Phone {
    private String number;
    private String model;
    private String weight;
    private String name;
    private String incomingNumber;

    public String getName() {
        return name;
    }
    void sendMessage(String...recipientNumbers)
    {
        System.out.println("Это сообщение получат следующие номера: ");
        for (String elements : recipientNumbers)
        {
            System.out.print(elements + " ");
        }
    }
    void receiveCall()
    {
        System.out.println("Звонит "+name);

    }
    void receiveCall(String incomingNumber,String name)
    {
        System.out.println("Звонит "+name+" "+"Номер телефона: "+incomingNumber);

    }
    String getNumber()
    {
        return number;
    }
    public Phone()
    {
        number="xxxxx-xxx-xx-xx";
        model="Unknown";
        weight="Unknown";
    }
    public Phone(String number,String model,String weight)
    {
        this(number,model);
        this.weight=weight;
    }
    public Phone(String number,String model)
    {
        this.number=number;
        this.model=model;
    }

}
