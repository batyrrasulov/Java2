package milestone4;

import java.util.Scanner;
import milestone4.StoreFront;

public class StoreFront {
	//initial variable to count products to purchase
	private static int steelDaggerPurch = 0;
	private static int executionerAxePurch = 0;
	private static int tannedLeatherPurch = 0;
	private static int steelerPurch = 0;
	private static int add100Purch = 0;
	private static int add250Purch = 0;
	//main method with the welcome message statement actions to proceed in with in the StoreFront menu
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Welcome to Mohammed's Store! "
				+ "\n---------------------------- "
				+ "\nChoose one of the following (1-3)"
				+ "\n\t1. View full Inventory"
				+ "\n\t2. Purchase a product"
				+ "\n\t3. View Shopping Cart"
				+ "\n\t4. Exit");
		byte selection = input.nextByte();
		if (selection == 1) 
			InventoryManager.Inventory(); //view what's in Inventory right now
		else if (selection == 2)
			products(); //view products
		else if (selection == 3)
			ShoppingCart.viewShoppingCart(); //view what's in your Shopping Cart
		else 
			System.out.println("Unfortunately no purchase has been made today, please come again"); //exit Store Front menu
	}
	//menu to display product categories
			static void products() {
				Scanner input = new Scanner(System.in);
				System.out.println("Select a category to view products: (1-4)" + "\n\t1. Weapons" +
				"\n\t2. Armor" + "\n\t3. Health" + "\n\t4. Back to main menu");
				byte select = input.nextByte();
				if (select == 1)
					weapons();
				else if (select == 2)
					armor();
				else if(select == 3)
					health();
				else 
					StoreFront.main(null);
			}
			//weapons menu
			static void weapons() {
				Scanner input = new Scanner(System.in);
				System.out.println("Select a weapon to view details: (1-3)"
						+ "\n\t1. Steel Dagger" + "\n\t2. Executioner Axe" + "\n\t3. Cancel Order");
				byte wpn = input.nextByte();
				if (wpn == 1) {
					Scanner quantInSD = new Scanner(System.in);
					System.out.println("How many Steel Daggers would you like to purchase? ");
					steelDaggerPurch += quantInSD.nextInt(); //changes steelDaggerPurch variable to desired purchase quantity
					StoreFront.main(null);
				}
				else if (wpn == 2) {
					Scanner quantInTS = new Scanner(System.in);
					System.out.println("How many Executioner Axes would you like to purchase? ");
					executionerAxePurch += quantInTS.nextInt(); //changes executionerAxePurch variable to desired purchase quantity
					StoreFront.main(null);
				}
				else {
					System.out.println("The order has been cancelled.");
					products();
				}
			}
			//armor menu
			static void armor() {
				Scanner input = new Scanner(System.in);
				System.out.println("Select an armor to view details: (1-3)"
						+ "\n\t1. Tanned Leather" + "\n\t2. Steeler" + "\n\t3. Cancel Order");
				byte armr = input.nextByte();
				if (armr == 1) {
					Scanner quantInTL = new Scanner(System.in);
					System.out.println("How many Tanned Leathers would you like to purchase? ");
					tannedLeatherPurch += quantInTL.nextInt(); //changes tannedLeatherPurch variable to desired purchase quantity
					StoreFront.main(null);
				}
				else if (armr == 2) {
					Scanner quantInS = new Scanner(System.in);
					System.out.println("How many Steelers would you like to purchase? ");
					steelerPurch += quantInS.nextInt(); //changes steelerPurch variable to desired purchase quantity
					StoreFront.main(null);
				}
				else {
					System.out.println("The order has been cancelled.");
					products();
				}
			}
			//health menu
			static void health() {
				Scanner input = new Scanner(System.in);
				System.out.println("Select a health option to view details: (1-3)"
						+ "\n\t1. Add 100hp" + "\n\t2. Add 250hp" + "\n\t3. Cancel Order");
				byte hlth = input.nextByte();
				if (hlth == 1) {
					Scanner quantInS = new Scanner(System.in);
					System.out.println("How many +100HP would you like to purchase? ");
					add100Purch += quantInS.nextInt(); //changes add100 variable to desired purchase quantity
					StoreFront.main(null);
				}
				else if (hlth == 2) {
					Scanner quantInTS = new Scanner(System.in);
					System.out.println("How many +250HP would you like to purchase? ");
					add250Purch += quantInTS.nextInt(); //changes add250 variable to desired purchase quantity
					StoreFront.main(null);
				}
				else {
					System.out.println("The order has been cancelled.");
					products();
				}
			}
			//getters and setters methods
			public static int getSteelDaggerPurch() {
				return steelDaggerPurch;
			}
			public static void setSteelDaggerPurch(int steelDaggerPurch) {
				SalableProducts.steelDaggerPurch = steelDaggerPurch;
			}
			public static int getExecutionerAxePurch() {
				return executionerAxePurch;
			}
			public static void setExecutionerAxePurch(int executionerAxePurch) {
				SalableProducts.executionerAxePurch = executionerAxePurch;
			}
			public static int getTannedLeatherPurch() {
				return tannedLeatherPurch;
			}
			public static void setTannedLeatherPurch(int tannedLeatherPurch) {
				SalableProducts.tannedLeatherPurch = tannedLeatherPurch;
			}
			public static int getSteelerPurch() {
				return steelerPurch;
			}
			public static void setSteelerPurch(int steelerPurch) {
				SalableProducts.steelerPurch = steelerPurch;
			}
			public static int getAdd100Purch() {
				return add100Purch;
			}
			public static void setAdd100Purch(int add100Purch) {
				SalableProducts.add100Purch = add100Purch;
			}
			public static int getAdd250Purch() {
				return add250Purch;
			}
			public static void setAdd250Purch(int add250Purch) {
				SalableProducts.add250Purch = add250Purch;
			}
		}
