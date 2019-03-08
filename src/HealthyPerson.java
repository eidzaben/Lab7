
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
         /*  if(this.compareTo(p) == 0) {
               return 0;
           } else if ()
           */
    }

    public String toString()
    {
            return String.format("%s In for %s", super.toString(), reason);
    }
}
