package test;

import static org.junit.Assert.assertEquals;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.InputMismatchException;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import storefront.ShoppingCart;

public class ShoppingCartTest {
	
	private final InputStream systemIn = System.in;
	private ByteArrayInputStream testIn;
	
	@Before
	public void setUp() {
		// Create a new ShoppingCart object for each test
		ShoppingCart.setTotal(0);
	}
	
	@After
	public void tearDown() {
		// Reset System.in after each test
		System.setIn(systemIn);
	}
	
	@Test
	public void testViewShoppingCart() throws IOException {
		// Set up test input for user to select 1
		String input = "1";
		testIn = new ByteArrayInputStream(input.getBytes());
		System.setIn(testIn);
		
		// Call viewShoppingCart() method
		ShoppingCart.viewShoppingCart();
		
		// Check that the output contains the expected text
		String expectedOutput = "Your Shopping Cart:";
		assertEquals(expectedOutput, ((String) systemOut()).substring(0, expectedOutput.length()));
	}
	
	private Object systemOut() {
		// TODO Auto-generated method stub
		return null;
	}

	@Test
	public void testCheckOut() {
		// Test case when the shopping cart is not empty
		ShoppingCart.setTotal(100);
		String expectedOutput = "Your total today is: $100.00\nThank you for shopping with us!";
		assertEquals(expectedOutput, ((String) systemOut()).trim());
		
		// Test case when the shopping cart is empty
		ShoppingCart.setTotal(0);
		expectedOutput = "It seems to be your Shopping Cart is empty!";
		assertEquals(expectedOutput, ((String) systemOut()).trim());
	}
	
	@Test(expected = InputMismatchException.class)
	public void testViewShoppingCartInputMismatchException() throws IOException {
		// Set up test input for user to enter a non-numeric value
		String input = "abc";
		testIn = new ByteArrayInputStream(input.getBytes());
		System.setIn(testIn);
		
		// Call viewShoppingCart() method, expecting an InputMismatchException to be thrown
		ShoppingCart.viewShoppingCart();
	}
}
