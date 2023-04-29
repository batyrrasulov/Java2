package storefront;

import java.util.Scanner;
import java.text.DecimalFormat;
//this import is added and useful for everything with utilizing the try catch blocks further in this class
import java.util.InputMismatchException;
//these imports that will allow to convert all arrays in order to use generics, as well as the use of classes and algorithms from the Collections Framework.
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.io.IOException;
import java.net.UnknownHostException;

public class ShoppingCart {
	//Shopping Cart Products get products customer wishes to purchase from StoreFront
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
	//private helper method to display currently available products in the Inventory
	private static void displayProduct(SalableProducts product) {
		System.out.println(product.getName() + " | " + product.getDescription() + " | $"
	            + product.getPrice() + " | " + product.getQuantity());
		}
	//method interacting with the StoreFront to view the ShoppingCart
	@SuppressWarnings("resource")
	public static void viewShoppingCart() throws UnknownHostException, IOException {
		int countSteelDagger = 0 + StoreFront.getSteelDaggerPurch();
		int countExecutionerAxe = 0 + StoreFront.getExecutionerAxePurch();
		int countTannedLeather = 0 + StoreFront.getTannedLeatherPurch();
		int countSteeler = 0 + StoreFront.getSteelerPurch();
		int countAdd100 = 0 + StoreFront.getAdd100Purch();
		int countAdd250 = 0 + StoreFront.getAdd250Purch();
		//converted ArrayList with a type SalableProducts and titled this time shoppingCart to hold all the salable products
		ArrayList <SalableProducts> shoppingCart = new ArrayList <SalableProducts>();
		//add and create Salable Products to the ArrayList
		shoppingCart.add(new WeaponProducts("Steel Dagger", "Cold Carbon steel Italian", 50.00, countSteelDagger));
		shoppingCart.add(new WeaponProducts("Executioner Axe", "Skeleteen Viking Medieval Costume", 10.00, countExecutionerAxe));
		shoppingCart.add(new ArmorProducts("Tanned Leather", "Original Dutch", 200.00, countTannedLeather));
		shoppingCart.add(new ArmorProducts("Steeler", "Tribal Power", 300.00, countSteeler));
		shoppingCart.add(new HealthProducts("Add100HP", "Extra 100 health points", 100.00, countAdd100));
		shoppingCart.add(new HealthProducts("Add250HP", "Extra 250 health points", 200.00, countAdd250));
		System.out.println("Your Shopping Cart: ");
		//usage of Collections from Collections Framework that sort by interacting with Salable Products
		Collections.sort(shoppingCart, SalableProducts.quantityComparator);
		//iterator included in order to display all the Salable Products
		Iterator <SalableProducts> iterator = shoppingCart.iterator();
		while (iterator.hasNext()) {
			displayProduct(iterator.next());
			}
		try {
			Scanner scan = new Scanner(System.in);
			System.out.println("Enter 1 to return to main menu");
			byte select = scan.nextByte();
			if (select == 1)
				StoreFront.main(null);
			else 
				System.exit(0);
			} catch (InputMismatchException e) {
				StoreFront.main(null);
				}
		}
	//method to display the total due for the customer and check out
	static void checkOut() {
		if(total > 0)
			System.out.println("Your total today is: $" + ShoppingCart.getTotal()
			        + "\nThank you for shopping with us!");
		else 
			System.out.println("It seems to be your Shopping Cart is empty!");
		}
	}
