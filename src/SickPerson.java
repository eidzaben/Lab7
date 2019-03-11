
public class SickPerson extends Person
{

    private String name;
    private int age;
    private int severity;
    
    public SickPerson(String name, int age, int severity) {
        super(name, age);
        this.name = name;
        this.age = age;
        this.severity = severity;
    }
    private int getSeverity() {
        return severity;
    }
    
    protected int compareToImpl(Person o) {
        if (!this.getClass().toString().equalsIgnoreCase(o.getClass().toString())) {
            return 0;
        } 
        if (!(o instanceof SickPerson)) {
            return 0;
        } else if(this.getSeverity() > ((SickPerson) o).getSeverity()) {
            return -1;
        } else if (this.getSeverity() < ((SickPerson) o).getSeverity()) {
            return 1;
        } else {
            return 0;
        }
        //How do I compare the severity of O with this, more specifically how do I access o's severity
      
    }
    
    @Override
    public String toString() {
        return String.format("%s Severity level %d", super.toString(), severity);
    }
}
