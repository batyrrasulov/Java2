package test;

import static org.junit.Assert.*;
import org.junit.Test;
import storefront.TannedLeather;

public class TannedLeatherTest {
	@Test
	public void testConstructorWithNameDescriptionPriceAndQuantity() {
		String name = "Tanned Leather";
		String description = "Original Dutch";
		double price = 20.00;
		int quantity = 150;
		TannedLeather TannedLeather = new TannedLeather(name, description, price, quantity);	
		assertEquals(name, TannedLeather.getName());
		assertEquals(description, TannedLeather.getDescription());
		assertEquals(price, TannedLeather.getPrice(), 0.001);
		assertEquals(quantity, TannedLeather.getQuantity());
	}	
	@Test
	public void testDefaultConstructor() {
		TannedLeather TannedLeather = new TannedLeather();		
		assertEquals("", TannedLeather.getName());
		assertEquals("", TannedLeather.getDescription());
		assertEquals(0.0, TannedLeather.getPrice(), 0.001);
		assertEquals(0, TannedLeather.getQuantity());
	}
}
