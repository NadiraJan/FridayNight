import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

public class CustomerTest {

    private static Customer numberOfDrunkBeers;
    private static Customer hasCondoms;


    @BeforeClass
    public static void makeCustomer(){
        customer = new Customer("name",20,25,true);
    }
    @Test
    public void testFeelingConfident(){
        customer.setBeersThatTheyDrunk(5);
        customer.setHasCondom(true);
        Assert.assertTrue(customer.feelingConfident());
        customer.setBeersThatTheyDrunk(4);
        Assert.assertFalse(customer.feelingConfident());
        customer.setHasCondom(false);
        Assert.assertFalse(customer.feelingConfident());
    }

    }


