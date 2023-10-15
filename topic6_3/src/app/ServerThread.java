package app;

import java.io.IOException;

public class ServerThread extends Thread {
	// you need to override the run() to put the code that will run in this thread
	public void run() {
		// create an instance of a Server
		// start the Server on port 6666 (which will not return until the Shutdown Command is received)
		// and then on exit clean everything up which will exit this thread
		// create an instance of a Server
		Server server = new Server();
		try {
			// start the server on port 666
			server.start(6666);
			// clean up after the server returns
			server.cleanup();
		}
		catch (IOException e) {
			e.printStackTrace();
		}
	}
}
