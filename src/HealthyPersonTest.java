import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Test;

public class HealthyPersonTest
{

    @Test
    public void healthyPersonTest()
    {
        //Creating patients to use in tests
        HealthyPerson healthy = new HealthyPerson("eid", 18, "check up");
        HealthyPerson healthy2 = new HealthyPerson("bob", 20, "sad");
        HealthyPerson healthy3 = new HealthyPerson("zan", 28, "mad");
        HealthyPerson healthy4 = new HealthyPerson("eid", 38, "glad");
        SickPerson sick3 = new SickPerson("ian", 10, 4);

        // Checking compareTo returns correct value
        Assert.assertEquals(0, healthy.compareTo(sick3));
        Assert.assertEquals(1, healthy.compareTo(healthy3));
        Assert.assertEquals(-1, healthy3.compareTo(healthy2));
        Assert.assertEquals(0, healthy.compareTo(healthy4));

        // Checking getters
        Assert.assertEquals("eid", healthy.getName());
        Assert.assertEquals(18, healthy.getAge());

        // Checking toString output
        Assert.assertEquals("eid, a 18-year old. In for check up", healthy.toString());

    }

}
