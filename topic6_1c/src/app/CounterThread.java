package app;

import java.util.Random;

public class CounterThread extends Thread {
	public void run() {
		// generate a random number between 1 and 1000
		try {
			Random rand = new Random();
			int sleeper = rand.ints(1, (1000 + 1)).findFirst().getAsInt();
			// use the random number to make the sleep for that amount of milliseconds
			Thread.sleep(sleeper);
		}
		catch (InterruptedException e) {
			e.printStackTrace();
		}
		// call the static increment() method on the Counter
		Counter.increment();
		}
	}
