import java.util.Scanner;
public class BookOrder {

	public static void main(String[] args) {
			double priceOfbooks = 19.99;
			/*double tax = 2.75;
			double shipping = 100;
			*/
			Scanner scan = new Scanner(System.in);
			System.out.println("Enter the number of books you are purchasing:");
			int numBooks = scan.nextInt();
			double subTotal = numBooks * priceOfbooks;
			
			System.out.println("You ordered " + numBooks + " books");
			//		System.out.printf("Tax: $%.2f",tax);

			System.out.printf("Your book subtotal is: $%.2f " ,subTotal);
			System.out.println("");	
			System.out.println("---------------------------------------");
			System.out.println("Order total: $ " + (ShippingTax(subTotal)));
			
			
			scan.close();
		}
	public static double ShippingTax(double subTotal) {
		double tax = 2.75;
		double shipping = 100;
		double TaxShipping = tax * shipping;
		double OrderTotal = TaxShipping + subTotal;
		
		return OrderTotal;
	}
	}

