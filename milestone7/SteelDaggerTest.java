package test;

import static org.junit.Assert.*;
import org.junit.Test;
import storefront.SteelDagger;

public class SteelDaggerTest {
	@Test
	public void testConstructorWithNameDescriptionPriceAndQuantity() {
		String name = "Steel Dagger";
		String description = "Cold Carbon steel Italian";
		double price = 50.00;
		int quantity = 50;
		SteelDagger SteelDagger = new SteelDagger(name, description, price, quantity);	
		assertEquals(name, SteelDagger.getName());
		assertEquals(description, SteelDagger.getDescription());
		assertEquals(price, SteelDagger.getPrice(), 0.001);
		assertEquals(quantity, SteelDagger.getQuantity());
	}	
	@Test
	public void testDefaultConstructor() {
		SteelDagger SteelDagger = new SteelDagger();		
		assertEquals("", SteelDagger.getName());
		assertEquals("", SteelDagger.getDescription());
		assertEquals(0.0, SteelDagger.getPrice(), 0.001);
		assertEquals(0, SteelDagger.getQuantity());
	}
}
