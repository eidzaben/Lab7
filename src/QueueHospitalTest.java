
import org.junit.Assert;
import org.junit.Test;

public class QueueHospitalTest
{

    @Test
    public void QueueHosTest()
    {
        // Initiallizes queue hospital
        QueueHospital<Person> queue = new QueueHospital<Person>();
        // Creates a sick person
        SickPerson sickBill = new SickPerson("Bill", 20, 6);
        // Creates a healthy person
        HealthyPerson healthyJan = new HealthyPerson("Jan", 8, "check up");
        // Adds patients to hospital
        queue.addPatient(sickBill);
        queue.addPatient(healthyJan);

        // Checks num of patients
        Assert.assertEquals(2, queue.numPatients());

        // Checks patient info
        Assert.assertEquals("Bill, a 20-year old. Severity level 6Jan, a 8-year old. In for check up",
                queue.allPatientInfo());

        // Checks next patient
        Assert.assertEquals(sickBill, queue.nextPatient());

        // Checks treat next patient
        Assert.assertEquals(sickBill, queue.treatNextPatient());

        // Checks num of patients after treating one
        Assert.assertEquals(1, queue.numPatients());

        // Checks hospital type
        Assert.assertEquals("QueueHospital", queue.hospitalType());
    }

}
