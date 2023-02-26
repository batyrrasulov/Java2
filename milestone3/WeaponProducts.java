package milestone3;

import java.text.DecimalFormat;
// WeaponProducts class which will implement the comparable interface
public class WeaponProducts extends SalableProducts implements WeaponInterface, Comparable <WeaponProducts> {
	static String name;
	static String description;
	static float price;
	static int quantity;
	
	public static final DecimalFormat df = new DecimalFormat("0.00");
	//inherited methods for abstraction and interface
	public WeaponProducts(String steelDaggerPurch) {
		this.name = steelDaggerPurch;
	}
	public WeaponProducts(WeaponProducts WeaponProducts) {
		this.name = WeaponProducts.getName();
	}
	//displays the Steel Dagger info
	public static void steelDagger() {
	    name = "Lightsaber";
		description = "Traditional Green Lightsaber";
		price = (float) 25.50;
		System.out.println("Name: " + getName() + "\nDescription: " + description + "\nPrice: $" +
		df.format(price) + "\nQuantity in the store: " + InventoryManager.getQuantitySteelDagger());
	}
	//displays Executioner Axe info
	public static void executionerAxe() {
		name = "Shuriken";
		description = "4-pong ninja axe";
		price = (float) 4.50;
		System.out.println("Name: " + getName() + "\nDescription: " + description + "\nPrice: $" +
		df.format(price) + "\nQuantity in the store: " + InventoryManager.getQuantityExecutionerAxe());
			
	}
	@Override
	public String toString() {
		return this.name;
	}
	//comparison based on the name of the products and follows alphabetical ordering rules that ignore case
	@Override
	public int compareTo(WeaponProducts o) {
		int value = this.name.compareToIgnoreCase(name);
		if (value == 0) {
			return this.compareTo(o);
		}
			else {
				return value;
			}
		}	
	/**
	 * @return the name
	 */
	public static String getName() {
		return name;
	}
	/**
	 * @param name to set
	 */
	public static void setName(String name) {
		WeaponProducts.name = name;
	}
}
