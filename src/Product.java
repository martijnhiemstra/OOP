
public class Product {

	// Properties
	private String name;
	
	private int price;
	
	public boolean electric;
	
	public int tax;
	
	
	// Constructors
	public Product() {
		System.out.println("In constructor");
	}
	
	public Product(String name, int price, boolean electric, int tax) {
		// Property = Argument
		this.name = name;
	}
	
	
	// Method declaration
	public void printName() {
		System.out.println("Naam is " + name);
	}
	
	public void overridePrice(int newPrice, String b) {
		price = newPrice;
	}
	
	public double calculateTotalPrice() {
		double totalPrice = price * 1.21;

		return totalPrice;
	}
	
}
