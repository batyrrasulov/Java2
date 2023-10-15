package app;

public class CounterWorker {
	public static void main(String[] args) throws InterruptedException {
		// print start message calling the static method
		System.out.println("This is the initial value of the Counter " + Counter.getCount());
		// create 1000 counters that can each run in their own thread
		int numberCounters = 1000;
		// create and initialize an array contains 1000 instances of the classes
		CounterThread[] counters = new CounterThread[numberCounters];
		for (int x = 0; x < 1000; x++)
			counters[x] = new CounterThread();
		// start all 1000 Counter threads
		for (int x = 0; x < 1000; x++)
			counters[x].start();
		// wait for 1000 counter threads to finish
		for (int x = 0; x < 1000; x++)
			counters[x].join();
		// print out the end value of the Counter by calling the static method
		System.out.println("This is the end value of the Counter " + Counter.getCount());
	}
}
