package app;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {
	private ServerSocket serverSocket;
	private Socket clientSocket;
	private PrintWriter out;
	private BufferedReader in;
	/**
	 * start the server and wait for connections on the specified port
	 * 
	 * @param port Port to listen on
	 * @throws IOException Thrown in the networking classes if something bad happened
	 */
	// method that takes a port as parameter, returns void, and throws IOException
	public void start(int port) throws IOException {
		// wait for a client connection
		System.out.println("Waiting for a Client Connection............");
		// create ServerSocket to connect to the specified port
		serverSocket = new ServerSocket(port);
		// wait for a connection from the Client by calling accept() method on the socket
		clientSocket = serverSocket.accept();
		// if you get here then a Client connected to this Server to create some input and output network buffers
		System.out.println("Received a Client connection on port " + clientSocket.getLocalPort());
		// create a PrintWriter for sending text over the socket to the Client
		out = new PrintWriter(clientSocket.getOutputStream(), true);
		// create a BufferedReader for receiving text over the socket from the Client
		in = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));
		// wait for command (string that is terminated by a line feed character)
		String inputLine;
		// loop forever printing all incoming messages from the Client
		while ((inputLine = in.readLine()) != null) {
			// if period command then shut the Server down
			// check for a message of dot which is message to quit
			if (".".equals(inputLine)) {
				// if the message is quit message then send quit message back to the Client
				System.out.println("Got a message to shut the Server down");
				out.println("QUIT");
				// break out the loop to return to the main() method
				break;
			}
			// if the quit message is not received send an OK message back to the Client
			else {
				// echo an acknowledgement back to the Client that Command was processed successfully
				System.out.println("Got a message of: " + inputLine);
				out.println("OK");
			}
		}
		// exit message that Server is shut down
		System.out.println("Server is shut down");
	}
	// method that takes no parameters, returns void, and throws IOException
	public void cleanup() throws IOException {
		// close all input and output network buffers and sockets
		in.close();
		out.close();
		clientSocket.close();
		serverSocket.close();
	}
	/**
	 * entry mehtod for the Server application (for testing only)
	 * 
	 * @param args
	 * @throws IOException
	 */
	public static void main(String[] args) throws IOException {
		// create an instance of this Server 
		// start the Server on port 6666 (which will not return until the Shutdown Command is received)
		// and then on exit clean everything up
		// create and instance of the Server class
		Server server = new Server();
		// call the start() method on the Server
		server.start(6666);
		// call the cleanup() method to clean up and then exit the program
		server.cleanup();
	}
}
