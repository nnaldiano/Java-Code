import java.util.Scanner;

public class BookOrderSentinelAldiano {

	public static void main(String[] args) {
		double totalPrice = 0;
		int bookCount = 0;
		
		Scanner in = new Scanner(System.in);
		System.out.print("Enter a book price or enter -1 to exit ");
		double bookPrice = in.nextDouble();
		
		while(bookPrice >= 0) {
			totalPrice += bookPrice;
			bookCount ++;
			
			System.out.print("Enter another book price or enter -1 to exit ");
			bookPrice = in.nextDouble();
		}
		System.out.println("You have purchased: " + bookCount + " books");
		System.out.println("Your Book Subtotal is: $" + totalPrice);
		System.out.print("Your order total is: $" + ShippingTax(totalPrice));
		in.close();
	}
	public static double ShippingTax (double totalPrice) {
		double tax = 0.55;
		double shipping = 1.50;
		double SubTotalTax = totalPrice * tax;
		double SubtotalShipping = SubTotalTax + shipping + totalPrice;
		System.out.println("Tax: $" + SubTotalTax);
		System.out.println("Shipping: $" + shipping);
		
		return SubtotalShipping;

	}
}
