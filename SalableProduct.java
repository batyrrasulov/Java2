package milestone1;
import java.text.DecimalFormat;

public class SalableProduct {
	//declare and initialize variables
	static String name;
	static String description;
	static float price;
	static int quantity;
	public static final DecimalFormat df = new DecimalFormat("0.00");
	
	public static void chocolate() {
		//assign the product to the following (value)
		name = "Hershey's";
		description = "Finest white chocolate bars";
		price = (float) 25.50;
		quantity = 50;
		System.out.println("Name: " + name + "\nDescription: " + description + "\nPrice: $" + 
		df.format(price) + "\nQuantity: " + quantity);
	}
}
