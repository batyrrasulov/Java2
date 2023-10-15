package test;

import static org.junit.Assert.*;
import org.junit.Test;
import storefront.Add100HP;

public class Add100HPTest {
	@Test
	public void testConstructorWithNameDescriptionPriceAndQuantity() {
		String name = "Add100HP";
		String description = "Extra 100 health points";
		double price = 100.00;
		int quantity = 250;
		Add100HP add100HP = new Add100HP(name, description, price, quantity);	
		assertEquals(name, add100HP.getName());
		assertEquals(description, add100HP.getDescription());
		assertEquals(price, add100HP.getPrice(), 0.001);
		assertEquals(quantity, add100HP.getQuantity());
	}	
	@Test
	public void testDefaultConstructor() {
		Add100HP add100HP = new Add100HP();		
		assertEquals("", add100HP.getName());
		assertEquals("", add100HP.getDescription());
		assertEquals(0.0, add100HP.getPrice(), 0.001);
		assertEquals(0, add100HP.getQuantity());
	}
}
