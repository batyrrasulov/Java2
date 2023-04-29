package storefront;

import java.io.IOException;
import java.net.UnknownHostException;
import java.util.*;
import storefront.StoreFront;
/* 
 * Batyr Rasulov
 * CST-239
 * April 30, 2023 
 * This is my own work
 */
public class StoreFront {
	//initial variables to count products to purchase
		public static int steelDaggerPurch = 0;
		private static int executionerAxePurch = 0;
		private static int tannedLeatherPurch = 0;
		private static int steelerPurch = 0;
		private static int add100Purch = 0;
		private static int add250Purch = 0;
		//main method with the welcome message statement actions to proceed in with in the StoreFront menu
		@SuppressWarnings("resource")
		public static void main(String[] args) throws UnknownHostException, IOException {
			try {
				Scanner input = new Scanner(System.in);
				System.out.println("Welcome to Mohammed's Store! "
				        + "\n---------------------------- "
					    + "\nChoose one of the following (1-3)"
					    + "\n\t1. View full Inventory"
					    + "\n\t2. Purchase a product"
					    + "\n\t3. View Shopping Cart"
					    + "\n\t4. Check out"
					    + "\n\t5. Return a product");
				byte selection = input.nextByte();
				if (selection == 1) 
					InventoryManager.Inventory(); //view what's available in the Inventory
				else if (selection == 2)
					products(); //view products located in the Store Front
				else if (selection == 3)
					ShoppingCart.viewShoppingCart(); //view what's in your Shopping Cart
				else if (selection == 4)
					ShoppingCart.checkOut(); //check out with all your Salable Products purchased
				else if (selection == 5)
					returnProduct();
				} catch (InputMismatchException e) {
					System.out.println("Invalid input, please try again.");
					main(null);
					}
			}
		//menu to display product categories
		@SuppressWarnings("resource")
		public
		static void products() throws UnknownHostException, IOException {
			try {
				Scanner input = new Scanner(System.in);
				System.out.println("Select a category to view products: (1-4)" + "\n\t1. Weapons"
				        + "\n\t2. Armor" + "\n\t3. Health" + "\n\t4. Back to main menu");
				byte select = input.nextByte();
				if (select == 1)
					weapons();
				else if (select == 2)
					armor();
				else if(select == 3)
					health();
				else 
					try {
						StoreFront.main(null);
					} catch (UnknownHostException e) {
						e.printStackTrace();
					} catch (IOException e) {
						e.printStackTrace();
					}
				} catch (InputMismatchException e) {
					System.out.println("Invalid input, please try again.");
					products();
					}
			}
		//weapons menu
		@SuppressWarnings("resource")
		static void weapons() throws UnknownHostException, IOException {
			try {
				Scanner input = new Scanner(System.in);
				System.out.println("Select a weapon to view details: (1-3)"
				        + "\n\t1. Steel Dagger" + "\n\t2. Executioner Axe" + "\n\t3. Cancel Order");
				byte wpn = input.nextByte();
				if (wpn == 1) {
					Scanner quantInSD = new Scanner(System.in);
					System.out.println("How many Steel Daggers would you like to purchase? ");
					steelDaggerPurch += quantInSD.nextInt(); //changes steelDaggerPurch variable to desired purchase quantity
					try {
						StoreFront.main(null);
					} catch (UnknownHostException e) {
						e.printStackTrace();
					} catch (IOException e) {
						e.printStackTrace();
					}
				}
				else if (wpn == 2) {
					Scanner quantInTS = new Scanner(System.in);
					System.out.println("How many Executioner Axes would you like to purchase? ");
					executionerAxePurch += quantInTS.nextInt(); //changes executionerAxePurch variable to desired purchase quantity
					try {
						StoreFront.main(null);
					} catch (UnknownHostException e) {
						e.printStackTrace();
					} catch (IOException e) {
						e.printStackTrace();
					}				}
				else {
					System.out.println("The order has been cancelled.");
					products();
					}
				} catch (InputMismatchException e) {
					System.out.println("Invalid input, please try again.");
					products();
					}
			}
		//armor menu
		@SuppressWarnings("resource")
		static void armor() throws UnknownHostException, IOException {
			try {
				Scanner input = new Scanner(System.in);
				System.out.println("Select an armor to view details: (1-3)"
						+ "\n\t1. Tanned Leather" + "\n\t2. Steeler" + "\n\t3. Cancel Order");
				byte armr = input.nextByte();
				if (armr == 1) {
					Scanner quantInTL = new Scanner(System.in);
					System.out.println("How many Tanned Leathers would you like to purchase? ");
					tannedLeatherPurch += quantInTL.nextInt(); //changes tannedLeatherPurch variable to desired purchase quantity
					try {
						StoreFront.main(null);
					} catch (UnknownHostException e) {
						e.printStackTrace();
					} catch (IOException e) {
						e.printStackTrace();
					}				}
				else if (armr == 2) {
					Scanner quantInS = new Scanner(System.in);
					System.out.println("How many Steelers would you like to purchase? ");
					steelerPurch += quantInS.nextInt(); //changes steelerPurch variable to desired purchase quantity
					try {
						StoreFront.main(null);
					} catch (UnknownHostException e) {
						e.printStackTrace();
					} catch (IOException e) {
						e.printStackTrace();
					}				}
				else {
					System.out.println("The order has been cancelled.");
					products();
					}
				} catch (InputMismatchException e) {
					System.out.println("Invalid input, please try again.");
					products();
					}
			}
		//health menu
		@SuppressWarnings("resource")
		static void health() throws UnknownHostException, IOException {
			try {
				Scanner input = new Scanner(System.in);
				System.out.println("Select a health option to view details: (1-3)"
						+ "\n\t1. Add 100hp" + "\n\t2. Add 250hp" + "\n\t3. Cancel Order");
				byte hlth = input.nextByte();
				if (hlth == 1) {
					Scanner quantInS = new Scanner(System.in);
					System.out.println("How many +100HP would you like to purchase? ");
					add100Purch += quantInS.nextInt(); //changes add100 variable to desired purchase quantity
					try {
						StoreFront.main(null);
					} catch (UnknownHostException e) {
						e.printStackTrace();
					} catch (IOException e) {
						e.printStackTrace();
					}				}
				else if (hlth == 2) {
					Scanner quantInTS = new Scanner(System.in);
					System.out.println("How many +250HP would you like to purchase? ");
					add250Purch += quantInTS.nextInt(); //changes add250 variable to desired purchase quantity
					try {
						StoreFront.main(null);
					} catch (UnknownHostException e) {
						e.printStackTrace();
					} catch (IOException e) {
						e.printStackTrace();
					}				}
				else {
					System.out.println("The order has been cancelled.");
					products();
					}
				} catch (InputMismatchException e) {
					System.out.println("Invalid input, please try again.");
					products();
					}
			}
		@SuppressWarnings("resource")
		public static void returnProduct() throws UnknownHostException, IOException {
			System.out.println("Select a product you wish to return from your Shopping Cart (1-6): "
					+ "\n1. Steel Dagger"
					+ "\n2. Executioner Axe"
					+ "\n3. Tanned Leather"
					+ "\n4. Steeler"
					+ "\n5. Add100HP"
					+ "\n6. Add250HP");
			Scanner input = new Scanner(System.in);
			byte in = input.nextByte();
			try {
				if (in == 1)
					steelDaggerPurch -= steelDaggerPurch;
				else if (in == 2)
					executionerAxePurch -= executionerAxePurch;
				else if (in == 3)
					tannedLeatherPurch -= tannedLeatherPurch;
				else if (in == 4)
					steelerPurch -= steelerPurch;
				else if (in == 5)
					add100Purch -= add100Purch;
				else if (in == 6)
					add250Purch -= add250Purch;
				else returnProduct();
			} catch (InputMismatchException e) {
				System.out.println("Invalid input, please try again.");
				returnProduct();
			}
			StoreFront.main(null);
		}
		//getter and setter methods
		public static int getSteelDaggerPurch() {
			return steelDaggerPurch;
			}
		public static void setSteelDaggerPurch(int steelDaggerPurch) {
			StoreFront.steelDaggerPurch = steelDaggerPurch;
			}
		public static int getExecutionerAxePurch() {
			return executionerAxePurch;
			}
		public static void setExecutionerAxePurch(int executionerAxePurch) {
			StoreFront.executionerAxePurch = executionerAxePurch;
			}
		public static int getTannedLeatherPurch() {
			return tannedLeatherPurch;
			}
		public static void setTannedLeatherPurch(int tannedLeatherPurch) {
			StoreFront.tannedLeatherPurch = tannedLeatherPurch;
			}
		public static int getSteelerPurch() {
			return steelerPurch;
			}
		public static void setSteelerPurch(int steelerPurch) {
			StoreFront.steelerPurch = steelerPurch;
			}
		public static int getAdd100Purch() {
			return add100Purch;
			}
		public static void setAdd100Purch(int add100Purch) {
			StoreFront.add100Purch = add100Purch;
			}
		public static int getAdd250Purch() {
			return add250Purch;
			}
		public static void setAdd250Purch(int add250Purch) {
			StoreFront.add250Purch = add250Purch;
			}
}