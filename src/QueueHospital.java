import java.util.LinkedList;
import java.util.Queue;

public class QueueHospital<PatientType> extends Hospital<PatientType>
{
    private Queue<PatientType> hospital = new LinkedList<PatientType>();;

    // Constructor
    public QueueHospital()
    {
        hospital = new LinkedList<PatientType>();
    }

    // Adds patient
    public void addPatient(PatientType patient)
    {
        hospital.add(patient);
    }

    // Returns next patient
    public PatientType nextPatient()
    {
        return hospital.peek();
    }

    // Treats next patient
    public PatientType treatNextPatient()
    {
        return hospital.remove();
    }

    // Returns num of patients
    public int numPatients()
    {
        return hospital.size();
    }

    // Returns hospital type
    public String hospitalType()
    {
        return "QueueHospital";
    }

    // Returns patients info
    public String allPatientInfo()
    {
        String all = "";
        // Concats all patients toStrings
        for (PatientType p : hospital)
        {
            all += p.toString();
        }
        return all;

    }
}
