package milestone1;
/**
 * Represents an Inventory Manager that keeps track of the Store's inventory of Salable Products.
 */
public class InventoryManager {
	//variables for the products themselves and their quantity which should be available in inventory
	static int quantitySteelDagger;
	static int quantityExecutionerAxe;
	int steelDaggerPurch;
	int executionerAxePurch;
	//getters and setters
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
	public int getSteelDaggerPurch() {
		return steelDaggerPurch;
	}
	public void setSteelDaggerPurch(int steelDaggerPurch) {
		this.steelDaggerPurch = steelDaggerPurch;
	}
	public int getExecutionerAxePurch() {
		return executionerAxePurch;
	}
	public void setExecutionerAxePurch(int executionerAxePurch) {
		this.executionerAxePurch = executionerAxePurch;
	}
}
