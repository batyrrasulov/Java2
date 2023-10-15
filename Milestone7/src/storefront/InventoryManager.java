package storefront;

import java.util.Scanner;
//these imports will allow to convert all arrays in order to use generics, as well as the use of classes and algorithms from the Collections Framework.
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.io.IOException;
import java.net.UnknownHostException;

public class InventoryManager {
	//private helper method to display currently available products in the Inventory
	public static void displayProduct(SalableProducts product) {
		System.out.println(product.getName() + " | " + product.getDescription() + " | $"
	            + product.getPrice() + " | " + product.getQuantity());
		}
	//method to call the inventory which interacts with StoreFront
	@SuppressWarnings({ "unused", "resource" })
	public static void Inventory() throws UnknownHostException, IOException {
		//counter variables for Products in Stock Inventory
		int invSteelDagger = 50 - StoreFront.getSteelDaggerPurch();
		int invExecutionerAxe = 250 - StoreFront.getExecutionerAxePurch();
		int invTannedLeather = 150 - StoreFront.getTannedLeatherPurch();
		int invSteeler = 100 - StoreFront.getSteelerPurch();
		int invAdd100 = 250 - StoreFront.getAdd100Purch();
		int invAdd250 = 100 - StoreFront.getAdd250Purch();
		//converted ArrayList with a type SalableProducts and titled inventoryManager to hold all the salable products
		ArrayList <SalableProducts> inventoryManager = new ArrayList <SalableProducts>();
		//add and create Salable Products to the ArrayList
		inventoryManager.add(new WeaponProducts("Steel Dagger", "Cold Carbon steel Italian", 50.00, getInvSteelDagger()));
		inventoryManager.add(new WeaponProducts("Executioner Axe", "Skeleteen Viking Medieval Costume", 10.00, getInvExecutionerAxe()));
		inventoryManager.add(new ArmorProducts("Tanned Leather", "Original Dutch", 200.00, getInvTannedLeather()));
		inventoryManager.add(new ArmorProducts("Steeler", "Tribal Power", 300.00, getInvSteeler()));
		inventoryManager.add(new HealthProducts("Add100HP", "Extra 100 health points", 100.00, getInvAdd100()));
		inventoryManager.add(new HealthProducts("Add250HP", "Extra 250 health points", 200.00, getInvAdd250()));
		//choose how user wants to see the sorting of the menu
		Scanner sort = new Scanner(System.in);
		System.out.println("---------------------------"
				+ "\nEnter 1 to sort by ascending name "
				+ "\nEnter 2 to sort by descending name "
				+ "\nEnter 3 to sort by ascending price " 
				+ "\nEnter 4 to sort by descending price"
				+ "\nEnter 0 to return to Main Menu");
		byte inSort = sort.nextByte();
		//sort according to the interaction with the Salable Products
		if (inSort == 1) {
			Collections.sort(inventoryManager, SalableProducts.nameUPComparator);
			Iterator <SalableProducts> iterator = inventoryManager.iterator();
			while (iterator.hasNext()) {
				displayProduct(iterator.next());
				}
			Inventory();
			}
		else if (inSort == 2) {
			Collections.sort(inventoryManager, SalableProducts.nameDOWNComparator);
			Iterator <SalableProducts> iterator = inventoryManager.iterator();
			while (iterator.hasNext()) {
				displayProduct(iterator.next());
				}
			Inventory();
			}
		else if (inSort == 3) {
			Collections.sort(inventoryManager, SalableProducts.priceUPComparator);
			Iterator <SalableProducts> iterator = inventoryManager.iterator();
			while (iterator.hasNext()) {
				displayProduct(iterator.next());
				}
			Inventory();
			}
		else if (inSort == 4) {
			Collections.sort(inventoryManager, SalableProducts.priceDOWNComparator);
			Iterator <SalableProducts> iterator = inventoryManager.iterator();
			while (iterator.hasNext()) {
				displayProduct(iterator.next());
				}
			Inventory();
			}
		else 
			StoreFront.main(null);
		}
	// getter methods for Inventory Manager counters
	public static int getInvSteelDagger() {
		return 50 - StoreFront.getSteelDaggerPurch();
	}
	public static int getInvExecutionerAxe() {
		return 250 - StoreFront.getExecutionerAxePurch();
	}
	public static int getInvTannedLeather() {
		return 150 - StoreFront.getTannedLeatherPurch();
	}
	public static int getInvSteeler() {
		return 100 - StoreFront.getSteelerPurch();
	}
	public static int getInvAdd100() {
		return 250 - StoreFront.getAdd100Purch();
	}
	public static int getInvAdd250() {
		return 100 - StoreFront.getAdd250Purch();
	}
}
