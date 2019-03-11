import java.util.AbstractList;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Queue;


public class QueueHospital<PatientType> extends Hospital<PatientType>
{
    private Queue<PatientType> hospital = new LinkedList<PatientType>();;
  //  ListIterator<String> listIterator;
    public QueueHospital() {
        hospital = new LinkedList<PatientType>();
    }
    
    
    public void addPatient(PatientType patient)
    {
        hospital.add(patient);
    }

    public PatientType nextPatient()
    {
       return hospital.peek();
    }

    public PatientType treatNextPatient()
    {
      return  hospital.remove();
    }

    public int numPatients()
    {
        return hospital.size();
    }

    public String hospitalType()
    {
        return "Queue Hospital";
    }

    public String allPatientInfo()
    {
    
        //Might cause issues
        String all = "";
        for(int i = 0; i < hospital.size(); i++) {
           all.concat(hospital.remove().toString());
        }
        return all;
  
    }
}
