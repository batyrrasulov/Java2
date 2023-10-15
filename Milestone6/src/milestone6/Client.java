package milestone6;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.net.UnknownHostException;
// customer/client class responsible for the ability to interact with StoreFront
public class Client {
	private Socket customerSocket;
	private PrintWriter out;
	private BufferedReader in;
	public void start(String ip, int port) throws UnknownHostException, IOException {
		// connect to the Remote Server on the specified IP address and Port
		customerSocket = new Socket(ip, port);
		// create some input and output network buffers to communicate back and forth with the Server
		out = new PrintWriter(customerSocket.getOutputStream(), true);
		in = new BufferedReader(new InputStreamReader(customerSocket.getInputStream()));
	}
	// method to make sure interaction goes smooth
	public void storeFront() throws UnknownHostException, IOException {
		StoreFront.main(null);
	}
	public void cleanup() throws IOException {
		// close all input and output network buffers and sockets
		in.close();
		out.close();
		customerSocket.close();
	}
	public void main(String[] args) throws UnknownHostException, IOException {
		// create a customer and connect to the remote Server on the specified IP Address and Port
		Client customer = new Client();
	    customer.start("127.0.0.1", 6666);
	    // on exit clean everything up
	    customer.cleanup();
	}
}
