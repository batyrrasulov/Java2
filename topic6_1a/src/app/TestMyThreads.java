package app;

public class TestMyThreads {
	public static void main(String[] args) {
		// create an instance of the class
		MyThread1 thread1 = new MyThread1();
		// call the start() method on the class
		thread1.start();
		// create and instance of the class save this in a local variable of type Runnable
		Runnable runnable = new MyThread2();
		// create and instance of a Thread class passing the variable as an argument to constructor argument
		Thread thread2 = new Thread(runnable);
		// call the start() method on the class
		thread2.start();
	}
}
