package app;

import java.util.HashMap;
import java.util.Map;
// create a class in the app package
public class PlayMap {
	public static void main(String[] args) {
		// create a Map of Integers keyed by Integers
		Map <Integer, Integer> integerMap = new HashMap <Integer, Integer>();
		// create a HashMap of Integers and add 5 numbers to the Map
		integerMap.put(1, 1);
		integerMap.put(2, 2);
		integerMap.put(3, 3);
		integerMap.put(4, 4);
		integerMap.put(5, 5);
		// create a Map of Strings keyed by Integers
		Map <Integer, String> stringMap = new HashMap <Integer, String>();
		// create a HashMap of Strings and add 5 numbers with 5 Strings to the Map
		stringMap.put(1, "One");
		stringMap.put(2, "Two");
		stringMap.put(3, "Three");
		stringMap.put(4, "Four");
		stringMap.put(5, "Five");
		// create a Map of Strings keyed by Strings
		Map <String, String> namegMap = new HashMap <String, String>();
		// create a HashMap of Strings and add 5 Strings to the Map
		namegMap.put("FirstName", "Mohammed");
		namegMap.put("LastName", "Rasulov");
		namegMap.put("Occupation", "Student");
		namegMap.put("School", "GCU");
		namegMap.put("Nationality", "Turkmen");
		// print out the size and if a Map is empty
		System.out.printf("Name is Map Tests, size is %d, and is empty - %b\n", namegMap.size(), namegMap.isEmpty());
		// use a for Loop to loop over the Keys to retrieve each Map value to print out the String Map
		for (Map.Entry <String, String> m : namegMap.entrySet()) {
			System.out.printf("Key: %s and Value: %s\n", m.getKey(), m.getValue());
		}
		// remove all elements for each of the Maps
		integerMap.clear();
		stringMap.remove(1);
		stringMap.clear();
		namegMap.clear();
	}
}
