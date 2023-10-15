package milestone4;

import java.util.Scanner;
import java.text.DecimalFormat;
import milestone4.ShoppingCart;

public abstract class ShoppingCart {
	//Shopping Cart Products gets products customer wishes to purchase from StoreFront
		private static int steelDaggersInCart = StoreFront.getSteelDaggerPurch();
		private static int executionerAxesInCart = StoreFront.getExecutionerAxePurch();
		private static int tannedLeathersInCart = StoreFront.getTannedLeatherPurch();
		private static int steelersInCart = StoreFront.getSteelerPurch();
		private static int add100InCart = StoreFront.getAdd100Purch();
		private static int add250InCart = StoreFront.getAdd250Purch();
		
		public static final DecimalFormat df = new DecimalFormat("0.00");
		//total is the sum of the quantity of products multiplied by their prices
		private static float total = (float) ((steelDaggersInCart * 25.50) + (executionerAxesInCart * 4.50) + (tannedLeathersInCart * 400.00)
				+ (steelersInCart * 600.00) + (add100InCart * 100.00) + (add250InCart * 200.00));
		//convert total to string to format it to nice the decimal currency out
		public static String getTotal() { //getter method
			return df.format(total);
		}
		public static void setTotal(float total) { //setter method
			ShoppingCart.total = total;
		}
		//method to view and display the Shopping Cart
		static void viewShoppingCart() {
			Scanner input = new Scanner(System.in);
			System.out.println("Steel Daggers: " + steelDaggersInCart + "\nExecutioner Axes: " + executionerAxesInCart + "\n-------------------"
					+ "\nTanned Leather: " + tannedLeathersInCart + "\nSteeler: " + steelersInCart + "\n-------------------"
					+ "\nAdd 100hp: " + add100InCart + "\nAdd 250hp: " + add250InCart + "\n-------------------"
					+ "\nSelect one of the following:" + "\n\t1. Check out" + "\n\t2. Continue Shopping" + "\n\t3. Cancel Order");
			byte selection = input.nextByte();
			if (selection == 1) 
				checkOut();
			else if (selection == 2) 
				StoreFront.main(null);
			else if (selection == 3) {
				//else it is going to be returned with its contents which will also empty the Shopping Cart
				System.out.println("Unfortunately no purchase has been made today, please come again!");
				System.exit(0);
			}
		}
		//method to display total due for the customer or it will lead to termination of the program to the exit
		static void checkOut() {
			if(total > 0)
				System.out.println("Your total today is: $" + ShoppingCart.getTotal()
				+ "\nThank you for shopping with us!");
			else 
				System.out.println("It seems to be your Shopping Cart is empty!");
		}
}
