package milestone1;
/**
 * Represents a Shopping Cart that contains items that the user has added to purchase.
 */
public class ShoppingCart {
	//two products declared which interact with Store Front in the beginning
	static int steelDaggerPurch;
	static int executionerAxePurch;
	//getters and setters
	public static int getSteelDaggerPurch() {
		return steelDaggerPurch;
	}
	public void setSteelDaggerPurch(int steelDaggerPurch) {
		ShoppingCart.steelDaggerPurch = steelDaggerPurch;
	}
	public static int getExecutionerAxePurch() {
		return executionerAxePurch;
	}
	public void setExecutionerAxePurch(int executionerAxePurch) {
		ShoppingCart.executionerAxePurch = executionerAxePurch;
	}
}
