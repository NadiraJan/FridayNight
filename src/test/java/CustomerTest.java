import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

public class CustomerTest {



    private static Customer customer;
    private static Staff staff;

    @BeforeClass
    public static void makeCustomer() {
        customer = new Customer("Name", 20, 25, true);
        staff = new Staff("Name");
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


    @Test
    public void testTipTheCuteStaff() {
        staff.setAmountsOfTips(2.50);
        customer.setBeersThatTheyDrunk(2);
        //System.out.println(customer.getEuros());
        Assert.assertEquals(22, customer.tipTheCuteStaff(staff), 0.01);
        customer.setEuros(2);
        Assert.assertEquals( 0, customer.tipTheCuteStaff(staff), 0.01);
    }

    }


