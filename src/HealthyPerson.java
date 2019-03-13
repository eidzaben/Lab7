
public class HealthyPerson extends Person
{

    private String reason;

    public HealthyPerson(String name, int age, String reason)
    {
        // Gives values to parent class
        super(name, age);

        this.reason = reason;
    }

    protected int compareToImpl(Person p)
    {
        // Series of if else statements that return 0,-1, or 1 depending on name
        if (!(p instanceof HealthyPerson))
        {
            return 0;
        } else if (super.getName().compareTo(p.getName()) > 0)
        {
            return -1;
        } else if (super.getName().compareTo(p.getName()) < 0)
        {
            return 1;
        } else
        {
            return 0;
        }
    }

    public String toString()
    {
        // Overrides parent class toString
        return String.format("%s In for %s", super.toString(), reason);
    }
}
