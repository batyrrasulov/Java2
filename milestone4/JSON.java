package milestone4;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class JSON {
	//method to read the file
	private static int readFile(String inFile, String outFile) {
		BufferedReader in = null;
		BufferedWriter out = null;
		try {
			in = new BufferedReader(new FileReader(inFile));
			out = new BufferedWriter(new FileWriter(outFile));
			String line;
			while ((line = in.readLine()) != null) {
				String[] tokens = line.split("\\|");
				out.write(String.format("Item: %s. Category: %s. Price: %s. Quantity: %s\n", tokens[0], tokens[1], tokens[2], tokens[3]));
			} out.close();
			return 0;
		} catch (FileNotFoundException e) {
			e.printStackTrace();
			return -1;
		} catch (IOException e) {
			e.printStackTrace();
			return -1;
		}
	}
	public static void main(String[] args) {
		//copy file from .txt file and save it to JSON file
		int err = JSON.readFile("StartingInventory.txt", "inventory.json");
		switch(err) {
		case 0:
			System.out.println("File was successfully copied!");
			break;
		case -1:
			System.out.println("File not found");
			break;
		case -2:
			System.out.println("I/O error");
			break;
		}
	}
}
