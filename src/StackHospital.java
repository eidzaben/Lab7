import java.util.Deque;
import java.util.LinkedList;


public class StackHospital<PatientType> extends Hospital<PatientType>
{
    private Deque<PatientType> hospital;
    public StackHospital() {
        hospital = new LinkedList<PatientType>();
    }
    public void addPatient(PatientType patient)
    {
       hospital.addFirst(patient);
    }

    public PatientType nextPatient()
    {
          return hospital.peekFirst();
    }

    public PatientType treatNextPatient()
    {
           return hospital.removeFirst();
    }

    public int numPatients()
    {
        return hospital.size();
    }

    public String hospitalType()
    {
        //Format might be incorrect when submitted.
        return "Stack Hospital";
    }

    public String allPatientInfo()
    {
        String all = "";
        for(int i = 0; i < hospital.size(); i++) {
            //Check this later
           all.concat(((LinkedList<PatientType>) hospital).get(i).toString());
        }
        return all;
    }
}
