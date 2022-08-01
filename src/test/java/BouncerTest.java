import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class BouncerTest {

    private static Customer customer;
    private static Bouncer bouncer;
    private static Customer ofAgeCustomer;
    private static Customer underAgeCustomer;

    @BeforeClass

    public static void makeCustomer(){
        underAgeCustomer= new Customer("Name", 15, 38, true);
        ofAgeCustomer =new Customer("Name", 18, 30, true);
        bouncer= new Bouncer("Sally", 20);


}
@Test
    public void testAgeRestriction(){
    Assert.assertFalse(bouncer.isCustomerOldEnoughToEnter(underAgeCustomer));
    Assert.assertTrue(bouncer.isCustomerOldEnoughToEnter(ofAgeCustomer));
}
}
