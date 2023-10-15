package milestone3;

import java.util.Scanner;

public abstract class InventoryManager {
	//initial initialized inventory
	private static int quantitySteelDagger = 50;
	private static int quantityExecutionerAxe = 250;
	private static int quantityTannedLeather = 200;
	private static int quantitySteeler = 100;
	private static int quantityAdd100 = 300;
	private static int quantityAdd250 = 250;
	//method to display or view the inventory
	public static void InventoryDisplay() {
		Scanner input = new Scanner(System.in);
		System.out.println("Current inventory stock: " + "\n1. Weapon Products:" +
		"\n\ta. Steel Daggers: " + quantitySteelDagger + "\n\tb. Executioner Axes: " +
		quantityExecutionerAxe + "\n2. Armor Products:" +
		"\n\ta. Tanned Leather: " + quantityTannedLeather + "\n\tb. Steeler: " + 
		quantitySteeler + "\n3. Health Products:" +
		"\n\ta. Add 100hp: " + quantityAdd100 + "\n\tb. Add 250hp: " +
		quantityAdd250 + "\nType any number to return to the Main Menu");
		byte selection = input.nextByte();
		if (selection == 1) 
			StoreFront.menu();
		else 
			StoreFront.menu();
	}
	//methods to remove products from inventory
	public static void removeSteelDagger(int steelDaggerPurch) {
		quantitySteelDagger -= steelDaggerPurch;
	}
	public static void removeExecutionerAxe(int executionerAxePurch) {
		quantityExecutionerAxe -= executionerAxePurch;
	}
	public static void removeTannedLeather(int tannedLeatherPurch) {
		quantityTannedLeather -= tannedLeatherPurch;
	}
	public static void removeSteeler(int steelerPurch) {
		quantitySteeler -= steelerPurch;
	}
	public static void removeAdd100(int add100Purch) {
		quantityAdd100 -= add100Purch;
	}
	public static void removeAdd250(int add250Purch) {
		quantityAdd250 -= add250Purch;
	}
	//return to the entire inventory
	public static void returnSteelDagger(int steelDaggerPurch) {
		quantitySteelDagger += steelDaggerPurch;
	}
	public static void returnExecutionerAxe(int executionerAxePurch) {
		quantityExecutionerAxe += executionerAxePurch;
	}
	public static void returnTannedLeather(int tannedLeatherPurch) {
		quantityTannedLeather += tannedLeatherPurch;
	}
	public static void returnSteeler(int steelerPurch) {
		quantitySteeler += steelerPurch;
	}
	public static void returnAdd100(int add100Purch) {
		quantityAdd100 += add100Purch;
	}
	public static void returnAdd250(int add250Purch) {
		quantityAdd250 += add250Purch;
	}
	//getter and setter methods with "InventoryManager." instead of "this." as it was in previous milestone
	public static int getQuantitySteelDagger() {
		return quantitySteelDagger;
	}
	public void setQuantitySteelDagger(int quantitySteelDagger) {
		InventoryManager.quantitySteelDagger = quantitySteelDagger;
	}
	public static int getQuantityExecutionerAxe() {
		return quantityExecutionerAxe;
	}
	public void setQuantityExecutionerAxe(int quantityExecutionerAxe) {
		InventoryManager.quantityExecutionerAxe = quantityExecutionerAxe;
	}
	public static int getQuantityTannedLeather() {
		return quantityTannedLeather;
	}
	public void setQuantityTannedLeather(int quantityTannedLeather) {
		InventoryManager.quantityTannedLeather = quantityTannedLeather;
	}
	public static int getQuantitySteeler() {
		return quantitySteeler;
	}
	public void setQuantitySteeler(int quantitySteeler) {
		InventoryManager.quantitySteeler = quantitySteeler;
	}
	public static int getQuantityAdd100() {
		return quantityAdd100;
	}
	public void setQuantityAdd100(int quantityAdd100) {
		InventoryManager.quantityAdd100 = quantityAdd100;
	}
	public static int getQuantityAdd250() {
		return quantityAdd250;
	}
	public void setQuantityAdd250(int quantityAdd250) {
		InventoryManager.quantityAdd250 = quantityAdd250;
	}
}
