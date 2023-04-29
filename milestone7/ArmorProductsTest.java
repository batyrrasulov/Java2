package tests;

import org.junit.Test;
import storefront.ArmorProducts;
import static org.junit.Assert.*;

public class ArmorProductsTest {
    @Test
    public void testConstructor() {
        ArmorProducts armor = new ArmorProducts("Steeler", "Original Dutch", 50.0, 10);
        assertEquals("Steeler", armor.getName());
        assertEquals("Original Dutch", armor.getDescription());
        assertEquals(50.0, armor.getPrice(), 0.0);
        assertEquals(10, armor.getQuantity());
    }   
    @Test
    public void testDefaultConstructor() {
        ArmorProducts armor = new ArmorProducts();
        assertEquals("", armor.getName());
        assertEquals("", armor.getDescription());
        assertEquals(0.0, armor.getPrice(), 0.0);
        assertEquals(0, armor.getQuantity());
    }
}
