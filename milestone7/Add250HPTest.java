package test;

import static org.junit.Assert.*;
import org.junit.Test;
import storefront.Add250HP;

public class Add250HPTest {
	@Test
	public void testConstructorWithNameDescriptionPriceAndQuantity() {
		String name = "Add250HP";
		String description = "Extra 250 health points";
		double price = 200.00;
		int quantity = 100;
		Add250HP add250HP = new Add250HP(name, description, price, quantity);	
		assertEquals(name, add250HP.getName());
		assertEquals(description, add250HP.getDescription());
		assertEquals(price, add250HP.getPrice(), 0.001);
		assertEquals(quantity, add250HP.getQuantity());
	}	
	@Test
	public void testDefaultConstructor() {
		Add250HP add250HP = new Add250HP();		
		assertEquals("", add250HP.getName());
		assertEquals("", add250HP.getDescription());
		assertEquals(0.0, add250HP.getPrice(), 0.001);
		assertEquals(0, add250HP.getQuantity());
	}
}
