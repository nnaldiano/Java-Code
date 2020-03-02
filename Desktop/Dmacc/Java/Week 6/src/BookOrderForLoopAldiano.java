import java.util.Scanner;
public class BookOrderForLoopAldiano {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Please enter the number of books you are purchasing ");
		int count = scan.nextInt();
		double subtotal = 0;
		
		for(int i = 0 ; i < count; i++) {
			System.out.print("Please enter the price of book " + i + " ");
			double bookPrice = scan.nextDouble();
			subtotal = bookPrice + subtotal;
			

		}
		System.out.print("Number of books purchased: " + count);
		System.out.println("");
		System.out.print("Book subtotal: $" + subtotal);
		System.out.println("");
		System.out.println("-----------");
		System.out.printf("Order Total: $" + (ShippingTax(subtotal)));
		scan.close();
	}
	
	public static double ShippingTax (double subtotal) {
		double tax = .07;
		double shipping = 19.99;
		double SubTotalTax = subtotal * tax;
		double SubtotalShipping = SubTotalTax + shipping + subtotal;
		
		return SubtotalShipping;
	}

}
