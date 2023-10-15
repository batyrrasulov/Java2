// Create a new package named test
package test;

import static org.junit.Assert.*;

import org.junit.Test;

import junit.framework.Assert;

@SuppressWarnings({ "deprecation", "unused" })
public class CalculatorTest {
// Add one or more test conditions to fully validate the Calculator addition function
	// Calculator calc = new Calculator() 
	//Assert.assertEquals(3, calc.add(2, 1))
	@Test
	public void testAdd() {
		Calculator calc = new Calculator();
		Assert.assertEquals(3, calc.add(2, 1));
		Assert.assertEquals(7, calc.add(5, 2));
	}
	@Test
	public void testSubtract() {
		Calculator calc = new Calculator();
		Assert.assertEquals(1, calc.subtract(2, 1));
		Assert.assertEquals(3, calc.subtract(5, 2));
	}
	@Test
	public void testMultiply() {
		Calculator calc = new Calculator();
		Assert.assertEquals(2, calc.multiply(2, 1));
		Assert.assertEquals(10, calc.multiply(5, 2));
	}
	@Test
	public void testDivide() {
		Calculator calc = new Calculator();
		Assert.assertEquals(5, calc.divide(15, 3));
		Assert.assertEquals(5, calc.divide(10, 2));
	}
}
