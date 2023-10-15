package admin;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

public class AdminService {
		private Socket clientSocket;
		private PrintWriter out;
		private BufferedReader in;
		private Scanner scanner = new Scanner(System.in);
		public static void main(String[] args) throws UnknownHostException, IOException, InterruptedException {
			// declare and initialize variables
			AdminService admin = new AdminService();
			boolean active = true;
			String choice = "";
			int product = 0;
			// start the client
			admin.start("127.0.0.1", 6666);
			// variable for the response of the server
			String response;
			while (active) {
				// display all the options so the admin user can choose from
				System.out.println();
				System.out.println("=====================Welcome Admin!====================");
				System.out.println("Type 'U' to update the Store Inventory Management System with new Salable Products");
				System.out.println("Type 'R' to view and return the current Inventory Management System in JSON format");
				System.out.println("Type 'E' to exit the Administration Console Application");
				System.out.println("=======================================================");
				try {
					System.out.print("Enter Command: ");
					choice = admin.scanner.next();
					System.out.println();
				} catch (Exception e) {
					System.out.println("Invalid input, please try again!");
					admin.scanner.next();
					continue;
				}
				switch (choice) {
				case "U":
					System.out.println("===================================================");
					System.out.println("What type of Salable Product would you like to add?");
					System.out.println("1. Steel Dagger");
					System.out.println("2. Executioner Axe");
					System.out.println("3. Tanned Leather");
					System.out.println("4. Steeler");
					System.out.println("5. Add100HP");
					System.out.println("6. Add250HP");
					System.out.println("===================================================");

					try {
						System.out.print("Enter number: ");
						product = admin.scanner.nextInt();
						System.out.println();
					} catch (Exception e) {
						System.out.println("Invalid input, please try again!");
						admin.scanner.next();
						continue;
					}
					// SalableProduct variables
					admin.scanner.nextLine();
					String name = admin.getAdminInputString("Please enter name: ", 0);
					String description = admin.getAdminInputString("Please enter a description: ", 0);
					int price = admin.getAdminInputInteger("Please enter a price: ");
					int quantity = admin.getAdminInputInteger("Please enter a quantity: ");
					// String for the product in json format
					String jsonProduct = "";
					// switch case method for the selected product types
					switch (admin.productType(product)) {
					case "Weapon":
						if (product == 2) {
							// creates a JSON string for a Steel Dagger
							jsonProduct = String.format("{\"type\":\"Weapon\",\"name\":\"%1$s\",\"description\":\"%2$s\","
									+ "price\":%3$d,\"quantity\":%4$d}",
									name, description, price, quantity);
						} else {
							// creates a JSON string for a Executioner Axe
							jsonProduct = String.format("{\"type\":\"Weapon\",\"name\":\"%1$s\",\"description\":\"%2$s\","
									+ "price\":%3$d,\"quantity\":%4$d}",
									name, description, price, quantity);
						}
						break;
					case "Armor":
						if (product == 3) {
							// creates a JSON string for a Tanned Leather
							jsonProduct = String.format("{\"type\":\"Armor\",\"name\":\"%1$s\",\"description\":\"%2$s\","
											+ "price\":%3$d,\"quantity\":%3$d}",
									name, description, price, quantity);
						} else {
							// creates a JSON string for a Steeler
							jsonProduct = String.format("{\"type\":\"Armor\",\"name\":\"%1$s\",\"description\":\"%2$s\","
											+ "price\":%3$d,\"quantity\":%4$d}",
									name, description, price, quantity);
						}
						break;
					case "Health":						
						if (product == 6) {
							// creates a JSON string for a Add100HP
							jsonProduct = String.format("{\"type\":\"Health\",\"name\":\"%1$s\",\"description\":\"%2$s\","
											+ "price\":%3$d,\"quantity\":%4$d}",
									name, description,price, quantity);
						} else {
							// creates a JSON string for a Add250HP
							jsonProduct = String.format("{\"type\":\"Health\",\"name\":\"%1$s\",\"description\":\"%2$s\","
											+ "price\":%3$d,\"quantity\":%4$d}",
									name, description, price, quantity);
						}

						break;

					}
					// sends the JSON string to the server
					response = admin.sendMessage(jsonProduct);
					// prints out the new Product that was created
					System.out.println(response);
					break;
				case "R":
					// will return all the Salable Products from the Store Front Inventory Manager
					// as a String in JSON format to the Administrative Application 
					// it then should display the Inventory to the console
					response = admin.sendMessage("Return Inventory");
					String json[] = response.split("@", 0);
					for (String object : json) {
						System.out.println(object);
					}
					break;
				case "E":
					// ends the server client connection
					admin.sendMessage(".");
					active = false;
					break;
				default:
					System.out.println("Invalid input, please try again!");
					break;
				}
			}
			// cleans up
			admin.cleanup();
		}
		/**
		 * Method to determine what product type the admin wanted to create
		 * 
		 * @param choice, the choice the admin chose
		 * @return returns the type of product the admin chose
		 */
		private String productType(int choice) {
			if (choice == 1 || choice == 2) {
				return "Weapon";
			}
			if (choice == 3 || choice == 4) {
				return "Armor";
			}
			if (choice == 5 || choice == 6) {
				return "Health";
			}
			return "Invalid input, please try again!";
		}
		// method start() for the client
		public void start(String ip, int port) throws UnknownHostException, IOException {
			clientSocket = new Socket(ip, port);
			out = new PrintWriter(clientSocket.getOutputStream(), true);
			in = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));

		}
		public int getAdminInputInteger(String prompt) {
			int product;
			try {
				System.out.print(prompt);
				product = scanner.nextInt();
			} catch (Exception e) {
				System.out.println("Invalid input, please try again!");
				scanner.next();
				return -1;
			}
			return product;
		}
		public String getAdminInputString(String prompt) {
			String product;
			System.out.print(prompt);
			try {
				scanner.nextLine();
				product = scanner.next();
			} catch (Exception e) {
				System.out.println("Invalid input, please try again!");
				scanner.next();
				return "Invalid input, please try again!";
			}
			return product;
		}
		public String getAdminInputString(String prompt, int numb) {
			String product;
			System.out.println(prompt);
			try {
				product = scanner.nextLine();
			} catch (Exception e) {
				System.out.println("Invalid input, please try again!");
				scanner.next();
				return "Invalid input, please try again!";
			}
			return product;
		}
		public String sendMessage(String msg) throws IOException {
			out.println(msg);
			return in.readLine();
		}
		public void cleanup() throws IOException {
			out.close();
			in.close();
			clientSocket.close();
			scanner.close();
		}

	}
