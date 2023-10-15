package admin;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {
	public static void main(String[] args) throws IOException, InterruptedException, ClassNotFoundException {
		Server server = new Server();
		server.start(6666);
		server.cleanup();
	}
	private ServerSocket serverSocket;
	private Socket clientSocket;
	private PrintWriter out;
	private BufferedReader in;
	public void start(int port) throws IOException, InterruptedException, ClassNotFoundException {
		// waitin for a client connection
		System.out.println("Waiting for Admin connection...");
		// set up the server socket
		serverSocket = new ServerSocket(port);
		// set up the client socket
		clientSocket = serverSocket.accept();
		// create a new file service
		FileService file = new FileService();
		// when here the client should be connected to the server so create input and output streams
		System.out.println("Received the Admin connection on port: " + clientSocket.getLocalPort());
		// sets the output stream to the clients
		out = new PrintWriter(clientSocket.getOutputStream(), true);
		// gets the input stream from the client
		in = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));
		String inputLine;
		while ((inputLine = in.readLine()) != null) {
			// if the message is . end the server
			if (".".equals(inputLine)) {
				System.out.println("Got message to shut down server");
				out.println("QUIT");
				break;
			} else if ("Return Inventory".equals(inputLine)) {
				// Display the entire JSON file
				out.println(file.printFile());
			} else {
				// display the JSON string and add it to the file
				String something = inputLine;
				out.println(something);
				file.writeStringToFile(something, true);
			}			
		}
		// message to shut the server down
		System.out.println("Server is shut down");
		cleanup();
	}
	public String sendMessage(String msg) throws IOException {
		out.println(msg);
		return in.readLine();

	}
	public void cleanup() throws IOException {
		out.close();
		in.close();
		serverSocket.close();
		clientSocket.close();

	}
}
