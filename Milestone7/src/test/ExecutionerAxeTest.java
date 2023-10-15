package test;

import static org.junit.Assert.*;
import org.junit.Test;
import storefront.ExecutionerAxe;

public class ExecutionerAxeTest {
	@Test
	public void testConstructorWithNameDescriptionPriceAndQuantity() {
		String name = "Executioner Axe";
		String description = "Skeleteen Viking Medieval Costume";
		double price = 10.00;
		int quantity = 250;
		ExecutionerAxe ExecutionerAxe = new ExecutionerAxe(name, description, price, quantity);	
		assertEquals(name, ExecutionerAxe.getName());
		assertEquals(description, ExecutionerAxe.getDescription());
		assertEquals(price, ExecutionerAxe.getPrice(), 0.001);
		assertEquals(quantity, ExecutionerAxe.getQuantity());
	}	
	@Test
	public void testDefaultConstructor() {
		ExecutionerAxe ExecutionerAxe = new ExecutionerAxe();		
		assertEquals("", ExecutionerAxe.getName());
		assertEquals("", ExecutionerAxe.getDescription());
		assertEquals(0.0, ExecutionerAxe.getPrice(), 0.001);
		assertEquals(0, ExecutionerAxe.getQuantity());
	}
}
