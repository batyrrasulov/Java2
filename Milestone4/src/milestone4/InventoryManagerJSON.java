package milestone4;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;
import com.fasterxml.jackson.databind.ObjectMapper;

public class InventoryManagerJSON {
	//eventually changes Salable Products to Inventory or InventoryManager and saves it to a file
	private static void saveToFile(String fileName, SalableProducts salable, boolean append) {
		PrintWriter pw;
		try {
			File file = new File(fileName);
			FileWriter fw = new FileWriter(file, append);
			pw = new PrintWriter(fw);
			ObjectMapper objectMapper = new ObjectMapper();
			String json = objectMapper.writeValueAsString(salable);
			pw.println(json);
			pw.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	//array list to read from the file with the consequent try/catch function
	private static ArrayList<SalableProducts> readFromFile(String fileName) {
		ArrayList<SalableProducts> salables = new ArrayList<SalableProducts>();
		try {
			File file = new File(fileName);
			Scanner s = new Scanner(file);
			while (s.hasNext()) {
				String json = s.nextLine();
				ObjectMapper objectMapper = new ObjectMapper();
				SalableProducts salable = objectMapper.readValue(json, SalableProducts.class);
				salables.add(salable);
			} s.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return salables;
	}
	//main method to hold array of all products
	public static void main(String[] args) {
		SalableProducts[] salables = new SalableProducts[6];
		salables[0] = new WeaponProducts("Steel Dagger", "Cold Carbon steel Italian", 50.00, 50);
		salables[1] = new WeaponProducts("Executioner Axe", "Skeleteen Viking Medieval Costume", 10.00, 250);
		salables[2] = new ArmorProducts("Tanned Leather", "Original Dutch", 200.00, 150);
		salables[3] = new ArmorProducts("Steeler", "Tribal Power", 300.00, 100);
		salables[4] = new HealthProducts("Add100HP", "Extra 100 health points", 100.00, 250);
		salables[5] = new HealthProducts("Add250HP", "Extra 250 health points", 200.00, 100);
		//for loop to save the Inventory with the products to a file
		for (int x = 0; x < 5; x++) {
			saveToFile("out.json", salables[x], true);
		}
		//array list for salable products to get it as an organized text and print it to the console
		ArrayList<SalableProducts> salableList = readFromFile("out.json");
		for (SalableProducts salable : salableList) {
			String text = (salable.getName()) + " , " +
		                   salable.getDescription() + " , " +
					       Double.toString(salable.getPrice()) + " , " +
		                   Integer.toString(salable.getQuantity());
			System.out.println(text);
		}
	}
}
