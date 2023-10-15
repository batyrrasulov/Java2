package app;

import java.lang.Thread;
/**
 * create a thread that extends the Thread class
 *
 */
public class MyThread1 extends Thread {
	public void run() {
		// add a for loop for up to 1000 iterations and that for each iteration
		for (int x = 0; x < 1000; x++) {
			// prints a unique message to the console
			System.out.println("MyThread1 is running iteration " + x);
			// add thread sleep code within the for loop
			try {
				Thread.sleep(1000);
			}
			catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
