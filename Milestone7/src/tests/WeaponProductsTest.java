package tests;

import org.junit.Test;
import storefront.WeaponProducts;
import static org.junit.Assert.*;

public class WeaponProductsTest {
    @Test
    public void testConstructor() {
        WeaponProducts weapon = new WeaponProducts("Executioner Axe", "Viking Medieval", 50.0, 10);
        assertEquals("Executioner Axe", weapon.getName());
        assertEquals("Viking Medieval", weapon.getDescription());
        assertEquals(50.0, weapon.getPrice(), 0.0);
        assertEquals(10, weapon.getQuantity());
    }   
    @Test
    public void testDefaultConstructor() {
        WeaponProducts weapon = new WeaponProducts();
        assertEquals("", weapon.getName());
        assertEquals("", weapon.getDescription());
        assertEquals(0.0, weapon.getPrice(), 0.0);
        assertEquals(0, weapon.getQuantity());
    }
}
