package staff;

public class Worker implements JobTitle {
    private String name;
    private String surname;
    private String jobTitle;
    private int age;

    public Worker(String name, String surname, String jobTitle, int age)
    {
        this.name=name;
        this.surname=surname;
        this.jobTitle=jobTitle;
        this.age=age;
    }

    @Override
    public void getTitle()
    {
        System.out.println(name+" "+surname+" "+age+" - "+jobTitle);
    }
}
