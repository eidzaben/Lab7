import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Test;

public class StackHospitalTest
{

    @Test
    public void StackHosTest()
    {
        //Creates a stack hospital
        StackHospital<Person> stack = new StackHospital<Person>();
        
        //Creates patients
        SickPerson sickBill = new SickPerson("Bill", 20, 6);
        HealthyPerson healthyJan = new HealthyPerson("Jan", 8, "check up");
        
        //Adds patients to hospital
        stack.addPatient(sickBill);
        stack.addPatient(healthyJan);
        
        //Checks number of patients
        Assert.assertEquals(2, stack.numPatients());
        
        //Checks patient info
        Assert.assertEquals("Jan, a 8-year old. In for check upBill, a 20-year old. Severity level 6",
                stack.allPatientInfo());
        
        //Checks nextPatient and treatNextPatient
        Assert.assertEquals(healthyJan, stack.nextPatient());
        Assert.assertEquals(healthyJan, stack.treatNextPatient());
        
        //Checks number of patients after one removed
        Assert.assertEquals(1, stack.numPatients());
        
        //checks hospital type
        Assert.assertEquals("StackHospital", stack.hospitalType());
    }

}
