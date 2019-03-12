import java.util.Deque;
import java.util.LinkedList;

public class StackHospital<PatientType> extends Hospital<PatientType>
{
    private Deque<PatientType> hospital;

    public StackHospital()
    {
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
        // Format might be incorrect when submitted.
        return "StackHospital";
    }

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
