package milestone5;

//this import which will allow to compare being able to sort Salable Products in ascending and descending order based on name and price
import java.util.Comparator;

public class SalableProducts implements Comparable <SalableProducts> {
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
	//getter and setter methods
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
	//override the Comparators 
	public static Comparator <SalableProducts> nameUPComparator = new Comparator <SalableProducts>() {
		public int compare (SalableProducts c1, SalableProducts c2) {
			String name1 = c1.getName();
			String name2 = c2.getName();
			return name2.compareTo(name1);
			}
		};
		public static Comparator <SalableProducts> nameDOWNComparator = new Comparator <SalableProducts>() {
			public int compare (SalableProducts c1, SalableProducts c2) {
				String name1 = c1.getName();
				String name2 = c2.getName();
				return name1.compareTo(name2);
				}
			};
			public static Comparator <SalableProducts> priceUPComparator = new Comparator <SalableProducts>() {
				public int compare (SalableProducts c1, SalableProducts c2) {
					double price1 = c1.getPrice();
					double price2 = c2.getPrice();
					return (int) (price1 - price2);
					}
				};
				public static Comparator <SalableProducts> priceDOWNComparator = new Comparator <SalableProducts>() {
					public int compare (SalableProducts c1, SalableProducts c2) {
						double price1 = c1.getPrice();
						double price2 = c2.getPrice();
						return (int) (price2 - price1);
						}
					};
					//this one is for the Shopping Cart
					public static Comparator <SalableProducts> quantityComparator = new Comparator <SalableProducts>() {
						public int compare (SalableProducts c1, SalableProducts c2) {
							int quant1 = c1.getQuantity();
							int quant2 = c2.getQuantity();
							return quant1 - quant2;
							}
						};
						@Override
						public int compareTo(SalableProducts o) {
							//in previous milestones compares based on the products name and sets integer value to compare by description
							int value = this.description.compareTo(o.description);
							if (value == 0) {
								return this.name.compareTo(o.name);
								} else
									return value;
							}
						}
