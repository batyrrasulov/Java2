package test;

import static org.junit.Assert.*;
import org.junit.Test;
import storefront.Steeler;

public class SteelerTest {
	@Test
	public void testConstructorWithNameDescriptionPriceAndQuantity() {
		String name = "Steeler";
		String description = "Tribal Power";
		double price = 300.00;
		int quantity = 100;
		Steeler Steeler = new Steeler(name, description, price, quantity);	
		assertEquals(name, Steeler.getName());
		assertEquals(description, Steeler.getDescription());
		assertEquals(price, Steeler.getPrice(), 0.001);
		assertEquals(quantity, Steeler.getQuantity());
	}	
	@Test
	public void testDefaultConstructor() {
		Steeler Steeler = new Steeler();		
		assertEquals("", Steeler.getName());
		assertEquals("", Steeler.getDescription());
		assertEquals(0.0, Steeler.getPrice(), 0.001);
		assertEquals(0, Steeler.getQuantity());
	}
}
