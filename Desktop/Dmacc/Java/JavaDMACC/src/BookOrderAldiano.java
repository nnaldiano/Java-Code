import java.util.Scanner;
public class BookOrderAldiano {
// Noah Aldiano//
	public static void main(String[] args) {
		double priceOfbooks = 19.99;
		double tax = 2.75;
		double shipping = 100;
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the number of books you are purchasing:");
		int numBooks = scan.nextInt();
		System.out.println("Enter the number of books purchased: " + numBooks);	
		double totalPrice = numBooks * priceOfbooks;
		System.out.printf("Book Subtotal: $%.2f",totalPrice);
		System.out.println("");
		System.out.printf("Tax: $%.2f",tax);
		System.out.println("");
		System.out.printf("Shipping: $%.2f ",shipping);
		System.out.println("");
		double orderTotal = totalPrice + tax + shipping;
		System.out.println("---------------");
		System.out.printf("Order Total: $%.2f",orderTotal);
		scan.close();
	}

}
