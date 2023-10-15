package milestone4;
//class implements Comparable 
public class SalableProducts implements Comparable<SalableProducts> {
	//public instance variables
	public static int steelDaggerPurch;
	public static int executionerAxePurch;
	public static int tannedLeatherPurch;
	public static int steelerPurch;
	public static int add100Purch;
	public static int add250Purch;
	//private instance variables 
	private String name, description;
	private double price;
	private int quantity;
	//default constructor
	public SalableProducts() {
		name = " ";
		description = " ";
		price = 0;
		quantity = 0;
	}
	//non-default constructor
	public SalableProducts(String name, String description, double price, int quantity) {
		super();
		this.name = name;
		this.description = description;
		this.price = price;
		this.quantity = quantity;
	}
	//getters and setters methods
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	@Override
	public int compareTo(SalableProducts o) {
		//compares based on the products name and sets integer value to compare by description
		int value = this.description.compareTo(o.description);
		if (value == 0) {
			return this.name.compareTo(o.name);
		} else
			return value;
	}
}
