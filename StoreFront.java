package milestone1;
import java.util.Scanner; 

public class StoreFront extends SalableProduct{
	//start values for purchase
	public static int chocolate = 0;
	//create store front menu
	public static void menu() {
		Scanner input = new Scanner(System.in);
		System.out.println("What would you like to do? (1-3)"
				+ "\n\t1. View Product" + "\n\t2. Purchase" + "\n\t3. CancelPurchase");
		byte selection = input.nextByte();
		if(selection == 1) 
			ViewProducts(); //view product
		else if (selection == 2)
			Purchase(); //purchase the product
		else if (selection == 3)
			System.out.println("Purchase cancelled! Unfortunately, no purchase made. Have a nice day!"); //cancel the purchase
		else {
			System.out.println("Invalid input"); //must be 1-3 or try again
			menu(); //back to main menu
		}
	}
	//display product menu
	public static void ViewProducts() {
		Scanner input = new Scanner(System.in);
		System.out.println("Select a product to view details : 1"
				+ "\n\t1. Chocolate");
		byte wpn = input.nextByte();
		if(wpn == 1) {
			chocolate(); //call chocolate method from SalableProduct class
			Scanner purchInS = new Scanner(System.in);
			System.out.println("Would you like to purchase this product? (y/n)");
			String answerS = purchInS.nextLine();
			char ansS = answerS.charAt(0);
			if(ansS == 'y' || ansS == 'Y') {
				Scanner quantInS = new Scanner(System.in);
				System.out.println("How many would you like to purchase? ");
				chocolate = quantInS.nextInt(); //gets chocolate variable to show purchase quantity
				System.out.println("Purchase completed! Thank you for shopping!");
			} else {
				System.out.println("Purchase cancelled! Unfortunately, no purchase made. Have a nice day!");
			}
		}
	}
	public static void Purchase() {
		Scanner purchInS = new Scanner(System.in);
		System.out.println("Are you sure you want to purchase without viewing the product? (y/n)");
		String answerS = purchInS.nextLine();
		char ansS = answerS.charAt(0);
		if(ansS == 'y' || ansS == 'Y') {
			Scanner quantInS = new Scanner(System.in);
			System.out.println("Alright, we totally understand your hurry! So, what should be the quantity of the product you would like to purchase? ");
			chocolate = quantInS.nextInt(); //gets chocolate variable to show purchase quantity
			System.out.println("Purchase completed! Thank you for shopping!");
		}
		else {
			chocolate();
			Scanner quantInS = new Scanner(System.in);
			System.out.println("How many would you like to purchase? ");
			chocolate = quantInS.nextInt(); //gets chocolate variable to show purchase quantity
			System.out.println("Purchase completed! Thank you for shopping!");
		}
	}
	public static void main(String[] args) {
		menu();
	}
}
