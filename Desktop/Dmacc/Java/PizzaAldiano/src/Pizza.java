public class Pizza extends MenuItem{
// Noah Aldiano
	private String toppings;
	private String size;
	private double price;
	private int orderNumber;
	private static int nextOrderNumber = 1001;
	
	
	public Pizza(String toppings, String size, double price) {
		setToppings(toppings);
		setSize(size);
		setPrice(price);
		nextOrderNumber++;
		this.orderNumber = nextOrderNumber;
		if (getSize() .equals(null)) {
			throw new IllegalArgumentException("Pizza cannot be created");
		}
	}
	
	public String getToppings() {
		return toppings;
	}
	public void setToppings(String toppings) {
		this.toppings = toppings;
	}
	public String getSize() {
		return size;
	}
	public void setSize(String size) {
		size = size.toLowerCase();
		if  ((size.equals("small")) || (size.equals("medium")) || (size.equals("large")) || (size.equals("extra large")))  {
			this.size = size;	
	}
		else {
			this.size = null;
		}
		}

	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}

	public int getOrderNumber() {
		return orderNumber;
	}

	public void setOrderNumber(int orderNumber) {
		this.orderNumber = orderNumber;
	}
	
	public static Pizza quickOrder(String topping) {
		Pizza p = new Pizza(topping, "large", 9.99);
		return p;
	}

	public String repeatOrder() {
		return super.getDescription() + "Order number: " +  this.getOrderNumber() + ",  Topping: " +  this.getToppings() + ",  Size: " + this.getSize() + ", Price: " + this.getPrice();
	}

	@Override
	public String toString() {
		return "Pizza [toppings=" + toppings + ", size=" + size + ", price=" + price + "]";
	}

	
	
}
