package _pair_programming;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class CustomerTest {
    private String name;
    private double wallet;
    Customer customer1 = new Customer("Alex", 10900);
    @Test
    public void testGetName() {
        String actualValue = customer1.getName();
        String expectedValue = "Alex";
        assertEquals(actualValue, expectedValue);
    }

    @Test
    public void testGetWallet() {
        double actualValue = customer1.getWallet();
        double expectedValue = 10900;
    }

    Customer customer = new Customer("Alex", 10900.0);
    @Test
    public void testPurchaseArtwork() {

        double actualValue = customer.purchaseArtwork(100.0);
        double expectedValue = 10800.0;
        assertEquals(actualValue, expectedValue);
    }

}