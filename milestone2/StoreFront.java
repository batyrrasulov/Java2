package milestone2;
import java.util.Scanner;

public class StoreFront extends SalableProducts {
	//starting values for purchasing
	private static int steelDaggerPurch = 0;
	private static int executionerAxePurch = 0;
	//store front menu
	static void menu() {
		Scanner input = new Scanner(System.in);
		System.out.println("Welcome to Mohammed's Store!" + "\n" + "\nWhat would you like to do? (1-3)"
		+ "\n\t1. View Products" + "\n\t2. Check out" + "\n\t3. Cancel Order");
		byte selection = input.nextByte();
		if (selection == 1)
			SalableProducts.products(); //view products
		else if (selection == 2)
			ShoppingCart.checkOut(); //check out with items in cart
		else if (selection == 3)
			System.out.println("Order cancelled!"); //cancel order and exit menu
		else {
			System.out.println("Invalid input"); //must be 1-3 or try again
			menu(); //back to main menu
		}
	}
	public static void main(String[] args) {
		menu();
	}
}