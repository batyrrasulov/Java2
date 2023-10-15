package app;
// extend from java.lang.Thread class
import java.lang.Thread;
/**
 * create a thread that extends the Thread class
 *
 */
public class MyThread1 extends Thread {
	// implement the void run() method by simply printing to the console of the name of the class
	public void run() {
		System.out.println("MyThread1 is running");
	}
}
