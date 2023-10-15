package app;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
// create a class in the app package
public class PlayList {
	public static void main(String[] args) {
		// create a list of Integers and add elements using add()
		List <Integer> integerList = new ArrayList <Integer>();
		// create an ArrayList of Integers and add 5 numbers to the List
		integerList.add(Integer.valueOf(10));
		integerList.add(Integer.valueOf(11));
		integerList.add(Integer.valueOf(12));
		integerList.add(Integer.valueOf(13));
		integerList.add(Integer.valueOf(14));
		// create a list of Strings and add elements using add()
		List <String> stringList = new ArrayList <String>();
		// create an ArrayList of Strings and add 5 strings to the List
		stringList.add("Hello World!");
		stringList.add("Hi World!");
		stringList.add("Bye World!");
		stringList.add("Good morning World!");
		stringList.add("Good night World!");
		// get first element from the List using get() and print each from ArrayList out
		System.out.printf("Integer Value: %d\n", integerList.get(0));
		System.out.printf("String Value: %s\n", stringList.get(0));
		// loop over the List using a for Loop and print the IntegerList out
		for (Integer data : integerList) {
			System.out.printf("Integer Value: %d\n", data);
		}
		// loop over the List using an Iterator
		Iterator <String> stringIterator = stringList.iterator();
		// loop over the List using a while Loop and print the StringList out
		while (stringIterator.hasNext()) {
			System.out.printf("String Value: %s\n", stringIterator.next());
		}
	}
}
