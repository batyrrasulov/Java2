// Create a new Java class named Calculator (with a main()) in the junit package
package test;

public class Calculator {
	// Add a public method named add(int a, int b) that returns an int result
	public int add(int a, int b) {
		return a + b;
	}
	// Add a public method named subtract(int a, int b) that returns an int result
	public int subtract(int a, int b) {
		return a - b;
	}
	// Add a public method named multiply(int a, int b) that returns an int result
	public int multiply(int a, int b) {
		return a * b;
	}
	// Add a public method named divide(int a, int b) that returns an int result
	public int divide(int a, int b) {
		return a / b;
	}
	// Using main() run and test the class to ensure that the simply calculator operations work as expected
	public static void main(String[] args) {
		Calculator calc = new Calculator();
		System.out.println("Adding 1 + 2 is " + calc.add(1, 2));
		System.out.println("Subtracting 2 from 1 is " + calc.subtract(2, 1));
		System.out.println("Mulitplication of 10 and 2 is " + calc.multiply(10, 2));
		System.out.println("Division of 10 by 2 is " + calc.divide(10, 2));
	}
}
