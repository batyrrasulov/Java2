package milestone2;
import java.text.DecimalFormat;

public class ShoppingCart {
	//cartProducts gets Steel Dagger and Executioner Axe customer wishes to purchase from StoreFront
	private static int steelDaggersInCart = SalableProducts.getSteelDaggerPurch();
	private static int executionerAxesInCart = SalableProducts.getExecutionerAxePurch();
	private static int tannedLeathersInCart = SalableProducts.getTannedLeatherPurch();
	private static int steelersInCart = SalableProducts.getSteelerPurch();
	private static int add100InCart = SalableProducts.getAdd100Purch();
	private static int add250InCart = SalableProducts.getAdd250Purch();
	
	public static final DecimalFormat df = new DecimalFormat("0.00");
	//total is the sum of the quantity of products multiplied by their prices
	private static float total = (float) ((steelDaggersInCart * 25.50) + (executionerAxesInCart * 4.50) + (tannedLeathersInCart * 400.00)
			+ (steelersInCart * 600.00) + (add100InCart * 100.00) + (add250InCart * 200.00));
	//convert total to string to format it to nice the decimal currency out
	public static String getTotal() {
		return df.format(total);
	}
	public static void setTotal(float total) {
		ShoppingCart.total = total;
	}
	//displays total due for the customer or terminates the program with and empty cart
	static void checkOut() {
		if(total > 0) 
			System.out.println("Your total is: $" + ShoppingCart.getTotal());
		else 
			System.out.println("Unfortunately, nothing purchased! Please come again!");
	}	
}
