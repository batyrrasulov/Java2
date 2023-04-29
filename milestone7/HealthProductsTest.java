package tests;

import org.junit.Test;
import storefront.HealthProducts;
import static org.junit.Assert.*;

public class HealthProductsTest {
    @Test
    public void testConstructor() {
        HealthProducts health = new HealthProducts("Add100HP", "Extra 100 health points", 50.0, 10);
        assertEquals("Add100HP", health.getName());
        assertEquals("Extra 100 health points", health.getDescription());
        assertEquals(50.0, health.getPrice(), 0.0);
        assertEquals(10, health.getQuantity());
    }   
    @Test
    public void testDefaultConstructor() {
        HealthProducts health = new HealthProducts();
        assertEquals("", health.getName());
        assertEquals("", health.getDescription());
        assertEquals(0.0, health.getPrice(), 0.0);
        assertEquals(0, health.getQuantity());
    }
}
