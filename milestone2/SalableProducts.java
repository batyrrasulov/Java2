package milestone2;
import java.util.Scanner;
import java.text.DecimalFormat;

public class SalableProducts {
	static String name;
	static String description;
	static float price;
	static int quantity;
	private static int steelDaggerPurch = 0;
	private static int executionerAxePurch = 0;
	private static int tannedLeatherPurch = 0;
	private static int steelerPurch = 0;
	private static int add100Purch = 0;
	private static int add250Purch = 0;
	//menu to display product categories
	static void products() {
		Scanner input = new Scanner(System.in);
		System.out.println("Select a category to view products: (1-4)" + "\n\t1. Weapons" +
		"\n\t2. Armor" + "\n\t3. Health" + "\n\t4. Back to main menu");
		byte select = input.nextByte();
		if (select == 1)
			weapons();
		else if (select == 2)
			armor();
		else if(select == 3)
			health();
		else 
			StoreFront.menu();
	}
	//weapons menu
	static void weapons() {
		Scanner input = new Scanner(System.in);
		System.out.print("Select a weapon to view details: (1-3)"
				+ "\n\t1. SteelDagger" + "\n\t2. ExecutionerAxe" + "\n\t3. Cancel Order");
		byte wpn = input.nextByte();
		if (wpn == 1) {
			WeaponProducts.steelDagger(); //calls steelDagger method from WeaponProducts class
			Scanner purchInSD = new Scanner(System.in);
			System.out.println("Would you like to purchase this item? (y/n)");
			String answerSD = purchInSD.nextLine();
			char ansSD = answerSD.charAt(0);
			if (ansSD == 'y' || ansSD == 'Y' ) {
				Scanner quantInSD = new Scanner(System.in);
				System.out.println("How many would you like to purchase? ");
				steelDaggerPurch = quantInSD.nextInt(); //changes steelDaggerPurch variable to desired purchase quantity
				StoreFront.menu();
			} else //if decides not to buy brings back to products menu
				products();
		} else if (wpn == 2) {
			WeaponProducts.executionerAxe(); //calls executionerAxe method from WeaponProducts class
			Scanner purchInTS = new Scanner(System.in);
			System.out.println("Would you like to purchase this product? (y/n)");
			String answerTS = purchInTS.nextLine();
			char ansTS = answerTS.charAt(0);
			if(ansTS == 'y' || ansTS == 'Y') {
				Scanner quantInTS = new Scanner(System.in);
				System.out.println("How many would you like to purchase? ");
				executionerAxePurch = quantInTS.nextInt(); //changes executionerAxePurch variable to desired purchase quantity
				StoreFront.menu();
			} else //if decides not to buy brings back to product menu
				products();
		}
		else if (wpn == 3)
			System.exit(0);
		else {
			System.out.println("Invalid input");
			products();
		}
	}
	//armor menu
	static void armor() {
		Scanner input = new Scanner(System.in);
		System.out.print("Select an armor to view details: (1-3)"
				+ "\n\t1. TannedLeather" + "\n\t2. Steeler" + "\n\t3. Cancel Order");
		byte armr = input.nextByte();
		if (armr == 1) {
			ArmorProducts.tannedLeather(); // calls tannedLeather method from ArmorProducts class
			Scanner purchInTL = new Scanner(System.in);
			System.out.println("Would you like to purchase this product? (y/n)");
			String answerTL = purchInTL.nextLine();
			char ansTL = answerTL.charAt(0);
			if (ansTL == 'y' || ansTL == 'Y') {
				Scanner quantInTL = new Scanner(System.in);
				System.out.println("How many would you like to purchase? ");
				tannedLeatherPurch = quantInTL.nextInt(); //changes tannedLeatherPurch variable to desired purchase quantity
				StoreFront.menu();
			} else //if decides not to buy brings back to product menu
				products();
		}
		else if (armr == 2) {
			ArmorProducts.steeler();//calls steeler method from armor class
			Scanner purchInS = new Scanner(System.in);
			System.out.println("Would you like to purchase this product? (y/n)");
			String answerS = purchInS.nextLine();
			char ansS = answerS.charAt(0);
			if (ansS == 'y' || ansS == 'Y') {
				Scanner quantInS = new Scanner(System.in);
				System.out.println("How many would you like to purchase? ");
				steelerPurch = quantInS.nextInt(); //changes steelerPurch variable to desired purchase quantity
				StoreFront.menu();
			} else //if decides not to buy brings back to product menu
				products();
		}
		else if (armr == 3)
			System.exit(0);
		else {
			System.out.println("Invalid input");
			products();
		}
	}
	//health menu
	static void health() {
		Scanner input = new Scanner(System.in);
		System.out.print("Select a health option to view details: (1-3)"
				+ "\n\t1. + 100hp" + "\n\t2. + 250hp" + "\n\t3. Cancel Order");
		byte hlth = input.nextByte();
		if (hlth == 1) {
			HealthProducts.add100(); //calls add100 from HealthProducts class
			Scanner purchIn1 = new Scanner(System.in);
			System.out.println("Would you like to purchase this option? (y/n)");
			String answerS = purchIn1.nextLine();
			char ansS = answerS.charAt(0);
			if(ansS == 'y' || ansS == 'Y') {
				Scanner quantInS = new Scanner(System.in);
				System.out.println("How many would you like to purchase? ");
				add100Purch = quantInS.nextInt(); //changes add100 variable to desired purchase quantity
				StoreFront.menu();
			} else //if decides not to buy brings back to product menu
				products();
		}
		else if (hlth == 2) {
			HealthProducts.add250(); //calls add250 from HealthProducts class
			Scanner purchIn2 = new Scanner(System.in);
			System.out.println("Would you like to purchase this option? (y/n)");
			String answerTS = purchIn2.nextLine();
			char ansTS = answerTS.charAt(0);
			if(ansTS == 'y' || ansTS == 'Y') {
				Scanner quantInTS = new Scanner(System.in);
				System.out.println("How many would you like to purchase? ");
				add250Purch = quantInTS.nextInt(); //changes add250 variable to desired purchase quantity
				StoreFront.menu();
			} else //if decides not to buy brings back to product menu
				products();
		}
		else if (hlth == 3)
			System.exit(0);
		else {
			System.out.println("Invalid input");
			products();
		}
	}
	public static int getSteelDaggerPurch() {
		return steelDaggerPurch;
	}
	public static void setSteelDaggerPurch(int steelDaggerPurch) {
		SalableProducts.steelDaggerPurch = steelDaggerPurch;
	}
	public static int getExecutionerAxePurch() {
		return executionerAxePurch;
	}
	public static void setExecutionerAxePurch(int executionerAxePurch) {
		SalableProducts.executionerAxePurch = executionerAxePurch;
	}
	public static int getTannedLeatherPurch() {
		return tannedLeatherPurch;
	}
	public static void setTannedLeatherPurch(int tannedLeatherPurch) {
		SalableProducts.tannedLeatherPurch = tannedLeatherPurch;
	}
	public static int getSteelerPurch() {
		return steelerPurch;
	}
	public static void setSteelerPurch(int steelerPurch) {
		SalableProducts.steelerPurch = steelerPurch;
	}
	public static int getAdd100Purch() {
		return add100Purch;
	}
	public static void setAdd100Purch(int add100Purch) {
		SalableProducts.add100Purch = add100Purch;
	}
	public static int getAdd250Purch() {
		return add250Purch;
	}
	public static void setAdd250Purch(int add250Purch) {
		SalableProducts.add250Purch = add250Purch;
	}
}