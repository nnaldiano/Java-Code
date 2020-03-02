
public class JavaWeek4 {

	public static void main (String[] args) {
		
	System.out.println("Order Total: " + (bookTotal(5,9.99, .7, 19.99)))	;
	
	}
	
	public static double bookTotal(int bookNum, double bookPrice, double Tax, double Shipping) {
		
		double booksubtotal = bookNum * bookPrice;
		double TaxShipping = Tax + Shipping;
		double TotalTotal = booksubtotal + TaxShipping;
		
		System.out.printf("Book Subtotal: $%.2f", booksubtotal);
		System.out.println("");
		System.out.printf("Tax: $%.2f", Tax);
		System.out.println("");
		System.out.printf("Shipping: $%.2f ", Shipping);
		System.out.println("");
		
		return TotalTotal;
		
		
	}
	
	
}
