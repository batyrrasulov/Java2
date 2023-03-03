package milestone1;

import java.text.DecimalFormat;
/**
 * This class represents a Salable Product that can be sold in a Store Front
 */
public class SalableProduct {
	//declare instance variables for the products information
	static String name;
	static String description;
	static float price;
	static int quantity;
	public static final DecimalFormat df = new DecimalFormat("0.00");
	//view Steel Dagger information which is outputted to console 
	public static void steelDagger() {
		name = "Steel Dagger";
		description = "Cold Carbon steel Italian";
		price = (float) 25.50;
		quantity = 50;
		System.out.println("Name: " + name + "\nDescription: " + description + "\nPrice: $" + 
		        df.format(price) + "\nQuantity in store: " + quantity);
	}
	//view Executioner Axe information which is outputted to console
	public static void executionerAxe() {
		name = "Executioner Axe";
		description = "Skeleteen Viking Medieval Costume";
		price = (float) 44.50;
		quantity = 25;
		System.out.println("Name: " + name + "\nDescription: " + description + "\nPrice: $" + 
				df.format(price) + "\nQuantity in store: " + quantity);
	}
	//total is the sum of the quantity of products multiplied by their prices
	protected static float total = (float) ((InventoryManager.getQuantitySteelDagger() * 25.50) +(InventoryManager.getQuantityExecutionerAxe() * 44.50));
	//getters and setters
	public static String getTotal() {
		return df.format(total);
	}
	public static void setTotal(float total) {
		SalableProduct.total = total;
	}
}
