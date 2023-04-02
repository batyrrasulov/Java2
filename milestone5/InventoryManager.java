package milestone5;

import java.util.Scanner;
//these imports will allow to convert all arrays in order to use generics, as well as the use of classes and algorithms from the Collections Framework.
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class InventoryManager {
	//private helper method to display currently available products in the Inventory
	private static void displayProduct(SalableProducts product) {
		System.out.println(product.getName() + " | " + product.getDescription() + " | $"
	            + product.getPrice() + " | " + product.getQuantity());
		}
	//method to call the inventory which interacts with StoreFront
	public static void Inventory() {
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
		inventoryManager.add(new WeaponProducts("Steel Dagger", "Cold Carbon steel Italian", 50.00, invSteelDagger));
		inventoryManager.add(new WeaponProducts("Executioner Axe", "Skeleteen Viking Medieval Costume", 10.00, invExecutionerAxe));
		inventoryManager.add(new ArmorProducts("Tanned Leather", "Original Dutch", 200.00, invTannedLeather));
		inventoryManager.add(new ArmorProducts("Steeler", "Tribal Power", 300.00, invSteeler));
		inventoryManager.add(new HealthProducts("Add100HP", "Extra 100 health points", 100.00, invAdd100));
		inventoryManager.add(new HealthProducts("Add250HP", "Extra 250 health points", 200.00, invAdd250));
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
	}
