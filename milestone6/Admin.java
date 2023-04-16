package milestone6;

import java.io.IOException;
import java.net.UnknownHostException;
import java.util.InputMismatchException;
// import JOptionPane package library
import javax.swing.JOptionPane;
// administration Application class implements Runnable interface
public class Admin implements Runnable {
	// implement the run() method (forced)
	@Override
	public void run() {
		try {
			greeting();
		} catch (UnknownHostException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	// welcomes the user on Admin's console
	public void greeting() throws UnknownHostException, IOException {
		// prompt for the user to input the letter according to their wish and command
		String admin = JOptionPane.showInputDialog("Welcome Admin!"
				+ "\nType 'U' to update the Store Inventory Management System with new Salable Products"
				+ "\nType 'R' to view and return the current Inventory Management System in JSON format");
		try {
			// update the Store Inventory Management System with new Salable Products
			// the data payload will be a JSON string of Salable Products
			if (admin.equals("U")||admin.equals("u")) {
				FileService.updateJSON();
				greeting();
			}
			// return all of the Salable Products from the Store Inventory Management System in JSON forma
			else if (admin.equals("R") || admin.equals("r")) {
				FileService.currentInventoryJSON();
				greeting();
			}
			// informs user that it is invalid input entered
			else {
				JOptionPane.showMessageDialog(null, "Invalid input, please try again");
				greeting();
			}
		} catch (InputMismatchException e) {
			e.printStackTrace();
			JOptionPane.showMessageDialog(null, "Invalid input, please try again");
			greeting();
		}
	}
}
