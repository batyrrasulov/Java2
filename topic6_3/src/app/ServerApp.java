package app;

public class ServerApp {
	public static void main(String[] args) {
		// create an instance of Thread 
        ServerThread serverThread = new ServerThread();
        // start the Thread
        serverThread.start();
        // sits in a loop while the thread is still running
        while (serverThread.isAlive()) {
        	// printing out a dot to the console
            System.out.print(".");
            try {
            	// sleeep for 5 seconds
                Thread.sleep(5000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
