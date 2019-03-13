import java.util.Deque;
import java.util.LinkedList;

public class StackHospital<PatientType> extends Hospital<PatientType>
{
    // creates a deque of patient type
    private Deque<PatientType> hospital;

    // Constructs StackHospital
    public StackHospital()
    {
        hospital = new LinkedList<PatientType>();
    }

    // Adds a patient to hospital
    public void addPatient(PatientType patient)
    {
        hospital.addFirst(patient);
    }

    // Returns next patient
    public PatientType nextPatient()
    {
        return hospital.peekFirst();
    }

    // Returns and removes next patient
    public PatientType treatNextPatient()
    {
        return hospital.removeFirst();
    }

    // Returns num of patients
    public int numPatients()
    {
        return hospital.size();
    }

    // Returns hospital type
    public String hospitalType()
    {
        return "StackHospital";
    }

    // Returns all patient info using enhanced for loop
    public String allPatientInfo()
    {

        String all = "";
        for (PatientType p : hospital)
        {
            all += p.toString();
        }
        return all;
    }
}
