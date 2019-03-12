
import java.util.PriorityQueue;

public class PriorityQueueHospital<PatientType extends Comparable<PatientType>> extends Hospital<PatientType>
{
    private PriorityQueue<PatientType> hospital;

    public PriorityQueueHospital()
    {
        hospital = new PriorityQueue<PatientType>();
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
        return hospital.poll();
    }

    public int numPatients()
    {
        return hospital.size();
    }

    public String hospitalType()
    {
        return "PriorityQueueHospital";
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
