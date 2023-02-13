package milestone2;
import java.text.DecimalFormat;

public class WeaponProducts extends SalableProducts {
	static String name;
	static String description;
	static float price;
	static int quantity;
	
	public static final DecimalFormat df = new DecimalFormat("0.00");
	//displays the Steel Dagger info
	public static void steelDagger() {
		name = "Lightsaber";
		description = "Traditional Green Lightsaber";
		price = (float) 25.50;
		System.out.println("Name: " + name + "\nDescription: " + description + "\nPrice: $" +
		df.format(price) + "\n.Quantity in store: " + InventoryManager.getQuantitySteelDagger());
	}
		//displays Executioner Axe info
	public static void executionerAxe() {
		name = "Shuriken";
		description = "4-pong ninja axe";
		price = (float) 4.50;
		System.out.println("Name: " + name + "/nDescription: " + description + "\nPrice: $" +
		df.format(price) + "\nQuantity in store: " + InventoryManager.getQuantityExecutionerAxe());
			
	}
}
