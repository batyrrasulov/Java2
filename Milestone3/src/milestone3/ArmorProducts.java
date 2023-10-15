package milestone3;

import java.text.DecimalFormat;

public class ArmorProducts extends SalableProducts {
	static String name;
	static String description;
	static float price;
	static int quantity;
	
	public static final DecimalFormat df = new DecimalFormat("0.00");
	//Tanned Leather info display
	public static void tannedLeather() {
		name = "Chainmail";
		description = "Great protection from swords";
		price = (float) 400.0;
		System.out.println("Name: " + name + "\nDescription: " + description + "\nPrice: $" +
				df.format(price) + "\nQuantity in the store: " + InventoryManager.getQuantityTannedLeather());
		}
	//Steeler info display
	public static void steeler() {
		name = "Teflon Vest";
		description = "Excellent protection from projectiles and ninjas";
		price = (float) 600.0;
		System.out.println("Name: " + name + "\nDescription: " + description + "\nPrice: $" +
				df.format(price) + "\nQuantity in the store: " + InventoryManager.getQuantitySteeler());
		}
	}
