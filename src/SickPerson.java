
public class SickPerson extends Person
{


    private int severity;
    
    //Constructor
    public SickPerson(String name, int age, int severity) {
        //Passes values to parent class
        super(name, age);
      //Sets severity equal to instance variable
        this.severity = severity;
    }
    
    //Getter that returns severity
    private int getSeverity() {
        return severity;
    }
     
    protected int compareToImpl(Person o) {
      //Series of if else statements that return 0,-1, or 1 depending on severity
        if (!(o instanceof SickPerson)) {
            return 0;
        } else if(this.getSeverity() > ((SickPerson) o).getSeverity()) {
            return -1;
        } else if (this.getSeverity() < ((SickPerson) o).getSeverity()) {
            return 1;
        } else {
            return 0;
        }
      
    }
    
    @Override
    public String toString() {
        //Overrides parent class toString
        return String.format("%s Severity level %d", super.toString(), severity);
    }
}
