package app;

import java.util.Iterator;
import java.util.Stack;
// create a class in the app package
public class PlayStack {
	/**
	 * Exercise a Stack (a LIFO):
	 * push() - inserts an element into the top from the Stock
	 * peek() - retrieves but does not remove the top element from the Stock
	 * pop()  - retrieves and removes the top element from the Stock
	 * size() - returns the number of elements in the Stock
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		// create and set up a Stack of Integers and push 5 numbers to the Stack
		Stack <Integer> integerStack = new Stack <Integer>();
		integerStack.push(1);
		integerStack.push(-1);
		integerStack.push(5);
		integerStack.push(10);
		integerStack.push(15);
		// create and set up a Stack of Strings and push 5 strings to the Stack
		Stack <String> stringStack = new Stack <String>();
		stringStack.push("Mohammed Rasulov");
		stringStack.push("Aysoltan Rasulova, ");
		stringStack.push("Ibrahim Rasulov, ");
		stringStack.push("Miriam Rasulova, ");
		stringStack.push("Karim Rasulov, ");
		// print out the size and 2nd head element for the each Stack
		System.out.printf("Integer Stack Tests: size is %d, and 2nd element is %d\n", integerStack.size(),
				integerStack.elementAt(1));
		System.out.printf("String Stack Tests: size is %d, and 2nd element is %s\n", stringStack.size(),
				stringStack.elementAt(1));
		// print out the Integer Stack using toString() method
		System.out.println("Integer Stack: " + integerStack.toString());
		//use Iterator to get elements from the Stack, could of used loop over size() and used pop() to achieve the same functionality
		// print out the String Stack using a while loop
		Iterator <String> itr = stringStack.iterator();
        System.out.print("String Stack: ");
		while (itr.hasNext()) {
			System.out.print(stringStack.pop());
		}
	}
}
