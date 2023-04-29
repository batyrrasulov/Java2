package admin;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;
import com.fasterxml.jackson.databind.ObjectMapper;
import storefront.SalableProducts;

public class FileService {
	private File jsonFile = new File("JSON files.json");
	/// method for same items to a json file
	public void saveToFile(SalableProducts product, boolean append) {
		PrintWriter pw;
		try {
			FileWriter fw = new FileWriter(jsonFile, append);
			pw = new PrintWriter(fw);
			ObjectMapper objectMapper = new ObjectMapper();
			String json = objectMapper.writeValueAsString(product);
			// write the product as a JSON string
			pw.println(json);
			pw.close();
		} catch (Exception ex) {
			System.out.print("ERROR Something Happened!");
		}
	}
	public void saveToFile(ArrayList<SalableProducts> products, boolean append) {
		PrintWriter pw;
		try {
			FileWriter fw = new FileWriter(jsonFile, append);
			pw = new PrintWriter(fw);
			// loops through the arraylist and writes each product to the file
			for(SalableProducts product : products) {
				ObjectMapper objectMapper = new ObjectMapper();
				String json = objectMapper.writeValueAsString(product);
				// write the product as a JSON string
				pw.println(json);
			}
			pw.close();
		} catch (Exception ex) {
			System.out.print("ERROR Something Happened");
		}
	}
	/**
	 * reads from the designated json file declared above and transforms
	 * the contents to salable products and puts them into an array list
	 * 
	 * @return The array list of products from the json file
	 */
	public ArrayList<SalableProducts> readFromFile() {	
		ArrayList<SalableProducts> products = new ArrayList<SalableProducts>();
		try {
			Scanner s = new Scanner(jsonFile);
			while (s.hasNextLine()) {
				String json = s.nextLine();
				ObjectMapper objectMapper = new ObjectMapper();
				SalableProducts product = objectMapper.readValue(json, SalableProducts.class);
				products.add(product);
			}
			s.close();
		} catch (Exception ex) {

			ex.printStackTrace();
		}
		return products;

	}	
	public String printFile() throws FileNotFoundException {
		String response = "";
		Scanner s = new Scanner(jsonFile);
		while(s.hasNextLine()) {
			response += s.nextLine() + "@";
		}
		s.close();
		return response;
		
	}
	public void writeStringToFile(String jsonString, boolean append) throws IOException {
		PrintWriter pw;
		try {
			FileWriter fw = new FileWriter(jsonFile, append);
			pw = new PrintWriter(fw);
			pw.println(jsonString);
			pw.close();
		} catch (Exception ex) {
			System.out.print("ERROR Something Happened");
		}
	}
}
