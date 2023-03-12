package milestone4;

import java.util.Arrays;
import java.util.Scanner;

public class InventoryManager {
	//private helper method to display currently available products in the Inventory
	private static void displayProduct(SalableProducts product) {
		System.out.println(product.getName() + " | " + product.getDescription() + " | $"
		+ product.getPrice() + " | " + product.getQuantity());
	}
	//method to call the inventory which interacts with StoreFront
	public static void Inventory() {
		//counter variables for items in stock
		int invSteelDagger = 50 - StoreFront.getSteelDaggerPurch();
		int invExecutionerAxe = 250 - StoreFront.getExecutionerAxePurch();
		int invTannedLeather = 150 - StoreFront.getTannedLeatherPurch();
		int invSteeler = 100 - StoreFront.getSteelerPurch();
		int invAdd100 = 250 - StoreFront.getAdd100Purch();
		int invAdd250 = 100 - StoreFront.getAdd250Purch();
		//array to hold the salable products
		SalableProducts[] inventory = new SalableProducts[6];
		inventory[0] = new WeaponProducts("Steel Dagger", "Cold Carbon steel Italian", 50.00, invSteelDagger);
		inventory[1] = new WeaponProducts("Executioner Axe", "Skeleteen Viking Medieval Costume", 10.00, invExecutionerAxe);
		inventory[2] = new ArmorProducts("Tanned Leather", "Original Dutch", 200.00, invTannedLeather);
		inventory[3] = new ArmorProducts("Steeler", "Tribal Power", 300.00, invSteeler);
		inventory[4] = new HealthProducts("Add100HP", "Extra 100 health points", 100.00, invAdd100);
		inventory[5] = new HealthProducts("Add250HP", "Extra 250 health points", 200.00, invAdd250);
		System.out.println(" Name | Description | Price | Quantity ");
		//sort according to comparable
		Arrays.sort(inventory);
		//display inventory
		for (int x = 0; x < inventory.length; x++) {
			displayProduct(inventory[x]);
		}
		//return to main menu
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter 1 to return to main menu");
		byte select = scan.nextByte();
		if (select == 1)
			StoreFront.main(null);
		else 
			System.exit(0);
	}
}
