package app;

public class Counter {
	// static counter value that starts at zero
	static int count = 0;
	// method to increment the counter value
	// make the method synchronized using the Java synchronized keyword
	static synchronized void increment() { 
		count = count +1;
	}
	// method to get the counter value 
	static int getCount() {
		return count;
	}
}
