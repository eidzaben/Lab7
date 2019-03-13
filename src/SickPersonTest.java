import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Test;

public class SickPersonTest
{

    @Test
    public void sickPersonTest()
    {
        // Patients used for tests
        SickPerson sick = new SickPerson("eid", 18, 6);
        SickPerson sick2 = new SickPerson("bob", 20, 4);
        SickPerson sick3 = new SickPerson("ian", 10, 4);
        HealthyPerson healthy = new HealthyPerson("matt", 29, "IDK");

        // Checking compareTo returns correct value
        Assert.assertEquals(-1, sick.compareTo(sick2));
        Assert.assertEquals(1, sick2.compareTo(sick));
        Assert.assertEquals(0, sick3.compareTo(sick2));
        Assert.assertEquals(0, sick3.compareTo(healthy));

        // Checking getters
        Assert.assertEquals("eid", sick.getName());
        Assert.assertEquals(18, sick.getAge());

        // Checking toString
        Assert.assertEquals("eid, a 18-year old. Severity level 6", sick.toString());

    }
}
