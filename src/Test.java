import org.junit.Assert;

class Test
{
    /*
     * @org.junit.jupiter.api.Test void test() { fail("Not yet implemented"); }
     */

    public void sickPersonTest()
    {
        SickPerson sick = new SickPerson("eid", 18, 6);
        Assert.assertEquals("eid", sick.getName());
        Assert.assertEquals(18, sick.getAge());
        Assert.assertEquals("eid, a 18-year old Severity level 6", sick.toString());

        // How do we check severity???
        // Assert.assertEquals(6, sick.getSeverity);
        // sick.getSeverity();
    }

    public void healthyPersonTest()
    {
        HealthyPerson healthy = new HealthyPerson("eid", 18, "check up");
        Assert.assertEquals("eid", healthy.getName());
        Assert.assertEquals(18, healthy.getAge());
        Assert.assertEquals("eid, a 18-year old In for check up", healthy.toString());

        // How to test reason???
        // Assert.assertEquals("check up", healthy.getReason());
    }

    public void PQHTest()
    {
        PriorityQueueHospital<Person> pqh = new PriorityQueueHospital<Person>();
        SickPerson sickBill = new SickPerson("Bill", 20, 6);
        HealthyPerson healthyJan = new HealthyPerson("Jan", 8, "check up");
        pqh.addPatient(sickBill);
        pqh.addPatient(healthyJan);
        Assert.assertEquals(2, pqh.numPatients());
        // ADD in expected!!
        Assert.assertEquals("", pqh.allPatientInfo());
        Assert.assertEquals(healthyJan, pqh.nextPatient());
        Assert.assertEquals(healthyJan, pqh.treatNextPatient());
        Assert.assertEquals(1, pqh.numPatients());
        Assert.assertEquals("StackHospital", pqh.hospitalType());
    }

    public void QueueHosTest()
    {
        QueueHospital<Person> queue = new QueueHospital<Person>();
        SickPerson sickBill = new SickPerson("Bill", 20, 6);
        HealthyPerson healthyJan = new HealthyPerson("Jan", 8, "check up");
        queue.addPatient(sickBill);
        queue.addPatient(healthyJan);
        Assert.assertEquals(2, queue.numPatients());
        // ADD in expected!!
        Assert.assertEquals("", queue.allPatientInfo());
        Assert.assertEquals(sickBill, queue.nextPatient());
        Assert.assertEquals(sickBill, queue.treatNextPatient());
        Assert.assertEquals(1, queue.numPatients());
        Assert.assertEquals("QueueHospital", queue.hospitalType());
    }

    public void StackHosTest()
    {
        StackHospital<Person> stack = new StackHospital<Person>();
        SickPerson sickBill = new SickPerson("Bill", 20, 6);
        HealthyPerson healthyJan = new HealthyPerson("Jan", 8, "check up");
        stack.addPatient(sickBill);
        stack.addPatient(healthyJan);
        Assert.assertEquals(2, stack.numPatients());
        // ADD in expected!!
        Assert.assertEquals("", stack.allPatientInfo());
        Assert.assertEquals(healthyJan, stack.nextPatient());
        Assert.assertEquals(healthyJan, stack.treatNextPatient());
        Assert.assertEquals(1, stack.numPatients());
        Assert.assertEquals("StackHospital", stack.hospitalType());
    }

}