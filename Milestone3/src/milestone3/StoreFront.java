package milestone3;

import java.util.Scanner;

public class StoreFront extends SalableProducts {
	//starting values for purchasing
	private static int steelDaggerPurch = 0;
	private static int executionerAxePurch = 0;
	//Store Front menu
	static void menu() {
		Scanner input = new Scanner(System.in);
		System.out.println("Welcome to Mohammed's Store!" + "\n" + "\nWhat would you like to do? (1-4)"
		+ "\n\t1. View Products" + "\n\t2. View Inventory" + "\n\t3. View Shopping Cart and Check Out" + "\n\t4. Cancel Order");
		byte selection = input.nextByte();
		if (selection == 1)
			SalableProducts.products(); //view products
		else if (selection == 2)
			InventoryManager.InventoryDisplay(); //view what's in inventory right now
		else if (selection == 3)
			ShoppingCart.viewShoppingCart(); //view what's in your Shopping Cart and check out after that
		else if (selection == 4) 
			System.out.println("Unfortunately no purchase has been made today, please come again!"); //cancel order and exit Store Front menu
		else {
			System.out.println("Invalid input"); //must be 1-4 or try again
			menu(); //back to main menu
		}
	}
	public static void main(String[] args) {
		menu();
	}
}
