package app;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.net.UnknownHostException;

public class Client {
	private Socket clientSocket;
	private PrintWriter out;
	private BufferedReader in;
	/**
	 * connect to the remote Server on the specified IP address and Port
	 * @param ip Remote IP Address to connect to
	 * @param port Remote Port to connect to
	 * @throws UnkownHostException Thrown if network resolution exception
	 * @throws IOException Thrown if anything bad happens from any of the networking classes
	 */
	public void start(String ip, int port) throws UnknownHostException, IOException {
		// connect to the Remote Server on the specified IP address and Port
		clientSocket = new Socket(ip, port);
		// create some input and output network buffers to communicate back and forth with the Server
		out = new PrintWriter(clientSocket.getOutputStream(), true);
		in = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));
	}
	/**
	 * send a message to the Server
	 * @param msg Message to send
	 * @return Response back from the Server
	 * @throws IOException Thrown if anything bad happens from any of the networking classes
	 */
	public String sendMessage(String msg) throws IOException {
		// send/print a message to Server with a terminating line feed
		out.println(msg);
		// return the response from the Server
		return in.readLine();
	}
	/**
	 * cleanup logic to close all the network connections
	 * @throws IOException Thrown if anything bad happnes from the networking classes
	 */
	public void cleanup() throws IOException {
		// close all input and output network buffers and sockets
		in.close();
		out.close();
		clientSocket.close();
	}
	/**
	 * entry method for the Server application
	 * @param args
	 * @throws IOException
	 * @throws InterruptedException 
	 */
	// updated 
	public static void main(String[] args) throws IOException, InterruptedException {
		// create a client and connect to the remote Server on the specified IP Address and Port
		Client client = new Client();
		client.start("127.0.0.1", 6666);
		// send 10 messages to the Server
		String response;
		for (int count = 0; count < 10; count++) {
			// send message to the Sever and on the 9th one send a Shutdown command to server
			String message;
			if (count != 9)
				message = "Hello from Client" + count;
			else 
				message = ".";
			response = client.sendMessage(message);
			// print out the Server response and if we get QUIT response exit this program
			System.out.println("Server response was " + response);
			if (response.equals("q"))
				break;
			// sleep for 5 seconds in between sending messages 
			// sleep for a bit so the Server can run for awhile
			Thread.sleep(5000);
		}
		// on exit clean everything up
		client.cleanup();
	}
}
