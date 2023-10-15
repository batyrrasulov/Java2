package app;
/**
 * create a thread that implements Runnable interface
 *
 */
// implement the Runnable interface
public class MyThread2 implements Runnable {
	// implement the void run() method by simply printing to the console of the name of the class
	public void run() {
		System.out.println("MyThread2 is running");
	}
}
