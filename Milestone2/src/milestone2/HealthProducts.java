package milestone2;
import java.text.DecimalFormat;

public class HealthProducts extends SalableProducts {
	static String name;
	static String description;
	static float price;
	static int quantity;
	
	public static final DecimalFormat df = new DecimalFormat("0.00");
	//add100 info display
	public static void add100() {
		name = "+100HP";
		description = "Increase your health points by 100";
		price = (float) 100.00;
		System.out.println("Name: " + name + "\nDescription: " + description + "\nPrice: $" +
		df.format(price));
	}
	//add250 info display
	public static void add250() {
		name = "+250HP";
		description = "Increase your health points by 100";
		price = (float) 200.00;
		System.out.println("Name: " + name + "\nDescription: " + description + "\nPrice: $" +
		df.format(price));
	}
}
