
public class HealthyPerson extends Person
{
    private String name;
    private int age;
    private String reason;

    public HealthyPerson(String name, int age, String reason)
    {
        super(name, age);
        this.name = name;
        this.age = age;
        this.reason = reason;
    }

    protected int compareToImpl(Person p)
    {
        //I have no idea if any of this is correct tbh
        if (!p.getClass().toString().equals(this.getClass().toString())) {
            return 0;
        } else if (name.compareTo(p.getName()) > 0) {
            return -1;
        } else if (name.compareTo(p.getName()) < 0){
            return 1;
        } else {
            return 0;
        }
    }

    public String toString()
    {
            return String.format("%s In for %s", super.toString(), reason);
    }
}
