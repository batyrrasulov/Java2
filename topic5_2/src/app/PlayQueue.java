package app;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;
// create a class in the app package
public class PlayQueue {
	/**
	 * Exercise a Queue (a FIFO):
	 * offer() - inserts an element into the head of the Queue
	 * add()   - inserts an element into the head of the Queue
	 * peek()  - retrieves but does not remove from the head element of the Queue
	 * remove()- retrieves and removes an element from the head of the Queue
	 * size()  - returns the number of elements in the Queue
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		// create and set up a Queue of Integers
		Queue <Integer> integerQueue = new LinkedList <Integer>();
		integerQueue.add(1);
		integerQueue.offer(-1);
		integerQueue.add(5);
		integerQueue.offer(10);
		integerQueue.add(15);
		// create and set up a Queue of Strings
		Queue <String> stringQueue = new LinkedList <String>();
		stringQueue.offer("Mohammed Rasulov, ");
		stringQueue.add("Aysoltan Rasulova, ");
		stringQueue.offer("Ibrahim Rasulov, ");
		stringQueue.add("Miriam Rasulova, ");
		stringQueue.offer("Karim Rasulov");
		// print out the size and head element of the each Queue
		System.out.printf("Integer Queue Tests: size is %d, and the head element is %d\n",
				integerQueue.size(), integerQueue.peek());
		System.out.printf("String Queue Tests: size is %d, and the head element is %s\n",
				stringQueue.size(), stringQueue.peek());
		// print out the Integer Queue using toString() method
		System.out.println("Integer Queue: " + integerQueue.toString());
		// use Iterator to get elements from the Queue, could of used loop over size() and user remove() to achieve the same functuonality
		// print out the String Map using a while loop
		Iterator <String> itr = stringQueue.iterator();
        System.out.print("String Queue: ");
		while (itr.hasNext()) {
			System.out.print(itr.next());
		}
	}
}
