
import java.util.PriorityQueue;

public class PriorityQueueHospital<PatientType extends Comparable<PatientType>> extends Hospital<PatientType>
{
    private PriorityQueue<PatientType> hospital;

    // Constructor
    public PriorityQueueHospital()
    {
        hospital = new PriorityQueue<PatientType>();
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

    // returns and removes next patient
    public PatientType treatNextPatient()
    {
        return hospital.poll();
    }

    // Returns number of patients
    public int numPatients()
    {
        return hospital.size();
    }

    // Returns hospital type
    public String hospitalType()
    {
        return "PriorityQueueHospital";
    }

    public String allPatientInfo()
    {
        String all = "";
        // For loop adds each patients toString()
        for (PatientType p : hospital)
        {
            all += p.toString();
        }
        return all;

    }
}
