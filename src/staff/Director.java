package staff;

public class Director implements JobTitle {
    private String name;
    private String surname;
    private String jobTitle;

    public Director(String name, String surname, String jobTitle)
    {
        this.name=name;
        this.surname=surname;
        this.jobTitle=jobTitle;
    }

    @Override
    public void getTitle()
    {
        System.out.println(name+" "+surname+" - "+jobTitle);
    }
}
