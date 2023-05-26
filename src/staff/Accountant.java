package staff;

public class Accountant implements JobTitle {
    private String name;
    private String surname;
    private String jobTitle;
    private double salary;

    public Accountant(String name, String surname, String jobTitle,double salary)
    {
        this.name=name;
        this.surname=surname;
        this.jobTitle=jobTitle;
        this.salary=salary;
    }

    @Override
    public void getTitle()
    {
        System.out.println(name+" "+surname+" "+salary+"$"+" - "+jobTitle);
    }
}
