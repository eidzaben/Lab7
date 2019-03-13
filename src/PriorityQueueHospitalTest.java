
import org.junit.Assert;
import org.junit.Test;

public class PriorityQueueHospitalTest
{

    @Test
    public void PQHTest()
    {
        // Priority Queue Test created
        PriorityQueueHospital<Person> pqh = new PriorityQueueHospital<Person>();

        // Patients created
        SickPerson sickBill = new SickPerson("Bill", 20, 6);
        HealthyPerson healthyJan = new HealthyPerson("Jan", 8, "check up");

        // Patients added to hospital
        pqh.addPatient(sickBill);
        pqh.addPatient(healthyJan);

        // Checks hospital type and num of patients
        Assert.assertEquals("PriorityQueueHospital", pqh.hospitalType());
        Assert.assertEquals(2, pqh.numPatients());
        // Checks patient info
        Assert.assertEquals("Bill, a 20-year old. Severity level 6Jan, a 8-year old. In for check up",
                pqh.allPatientInfo());

        // Checks next patient and treatNextPatient
        Assert.assertEquals(sickBill, pqh.nextPatient());
        Assert.assertEquals(sickBill, pqh.treatNextPatient());

        // Checks num of patients after one removed
        Assert.assertEquals(1, pqh.numPatients());

    }
}
