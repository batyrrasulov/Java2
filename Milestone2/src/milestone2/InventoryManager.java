package milestone2;

public class InventoryManager {
	private static int quantitySteelDagger = 50;
	private static int quantityExecutionerAxe = 250;
	private static int quantityTannedLeather = 200;
	private static int quantitySteeler = 100;
	private int steelDaggerPurch;
	private int executionerAxePurch;
	public static int getQuantitySteelDagger() {
		return quantitySteelDagger;
	}
	public void setQuantitySteelDagger(int quantitySteelDagger) {
		this.quantitySteelDagger = quantitySteelDagger;
	}
	public static int getQuantityExecutionerAxe() {
		return quantityExecutionerAxe;
	}
	public void setQuantityExecutionerAxe(int quantityExecutionerAxe) {
		this.quantityExecutionerAxe = quantityExecutionerAxe;
	}
	public static int getQuantityTannedLeather() {
		return quantityTannedLeather;
	}
	public void setQuantityTannedLeather(int quantityTannedLeather) {
		this.quantityTannedLeather = quantityTannedLeather;
	}
	public static int getQuantitySteeler() {
		return quantitySteeler;
	}
	public void setQuantitySteeler(int quantitySteeler) {
		this.quantitySteeler = quantitySteeler;
	}
}
