package milestone1;

import java.util.Scanner;
/**
Represents a Store Front(executing class) that allows the user to browse the inventory in the Inventory Manager, add items to a Shopping Cart (later in milestones),
and purchase the items in it too
*/
public class StoreFront extends SalableProduct {
	//starting value for purchasing
	public static int steelDaggerPurch = 0;
	public static int executionerAxePurch = 0;
	//Store Front menu
	static void menu() {
		Scanner input = new Scanner(System.in);
		System.out.println("\nWelcome to Mohammed's Store!" + "\n" + "\nWhat would you like to do? (1-3)"
				+ "\n\t1. View Products" + "\n\t2. Check Out" + "\n\t3. Cancel Order");
		byte selection = input.nextByte();
		if (selection == 1)
			products(); //view products, or in other words initialize the state of the Store
		else if (selection == 2)
			checkOut(); //check out with the products in the shopping cart or in other words purchase the product
		else if (selection == 3)
			System.out.println("Unfortunately, nothing have been purchased today, please come another day!"); //cancel the purchase/order and receive this statement in return
			else {
				System.out.println("Invalid input"); //must be 1-3 or try again
				menu(); //back to main menu
			}
	}
	//products display menu
	static void products() {
		Scanner input = new Scanner(System.in);
		System.out.println("Select a product to view details: (1-3)"
				+ "\n\t1. Steel Dagger" + "\n\t2. Executioner Axe" + "\n\t3. Cancel Order");
		byte prd = input.nextByte();
		if (prd == 1) {
			steelDagger(); //calls steelDagger method from SalableProduct class
			Scanner purchInSD = new Scanner(System.in);
			System.out.println("Would you like to purchase this products? (y/n)");
			String answerSD = purchInSD.nextLine();
			char ansSD = answerSD.charAt(0);
			if (ansSD == 'y' || ansSD == 'Y') {
				Scanner quantInSD = new Scanner(System.in);
				System.out.println("How many would you like to purchase? ");
				steelDaggerPurch = quantInSD.nextInt(); //changes steelDaggerPurch variable to desired purchase quantity
				System.out.println("You have purchased this product. Thank you for shopping with us, hope to see you again!");
				menu();
			} else //if decides not to purchase this product it will bring back to products menu
				products();
		}
		else if (prd == 2) {
			executionerAxe(); //calls executionerAxe method from SalableProduct class
			Scanner purchInEA = new Scanner(System.in);
			System.out.println("Would you like to purchase this product? (y/n)");
			String answerEA = purchInEA.nextLine();
			char ansEA = answerEA.charAt(0);
			if (ansEA == 'y' || ansEA == 'Y') {
				Scanner quantInEA = new Scanner(System.in);
				System.out.println("How many would you like to purchase? ");
				executionerAxePurch = quantInEA.nextInt(); //changes executionerAxePurch variable to desired purchase quantity
				System.out.println("You have purchased this product. Thank you for shopping with us, hope to see you again");
				menu();
			} else //if decides not to purchase this product it will bring back to products menu
				products();
		}
		else if (prd == 3)
			System.out.println("Unfortunately, nothing have been purchased today, please come another day!"); //cancel the purchase/order and receive this statement in return
		else {
			System.out.println("Invalid input");
			products();
		}
	} 
	//check out and display the total price (later in milestones; now it's just a template kind of)
	static void checkOut() {
		System.out.println("\n\tYour total price is: $" + SalableProduct.getTotal() + "\nThank you for shopping with us, hope to see you again!");
	}
	//main method 
	public static void main(String[] args) {
		menu();
	}
}
