import java.util.Scanner;
public class PurchaseJava {
// Noah Aldiano and Brandon Klehm//
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter your invoice number: ");
		String InvoiceNumber  = scanner.next();
		InvoiceNumber.toUpperCase();
		System.out.println("Enter your amount of materials: ");
		double MaterialsAmount  = scanner.nextDouble();
		int length = InvoiceNumber.length();
		int length2 = 4;
		
		while(length < length2) {
			Scanner scanner2 = new Scanner(System.in);
			System.out.println("Enter your invoice number: ");
			String InvoiceNumber2 = scanner2.next();
			InvoiceNumber2.toUpperCase();
			int length3 = InvoiceNumber2.length();
			int length4 = 4; 
			if(length3 == length4) {
				break;
			}
		
		scanner2.close();
		}
		scanner.close();

		String output = Medallion(MaterialsAmount);
		System.out.println(recipt(MaterialsAmount));	
		System.out.print(output);
		}
	
	public static double recipt(double MaterialsAmount) {
		final double TAXRATE = 1.06;
		double output = MaterialsAmount * TAXRATE;
		
		return output;
	}
	public static String Medallion(double output) {
		double rankZero = 299.99;
		double rankOne = 499.99;
		double rankThree = 749.99;
		double rankFour = 750.00;
		String rank = " ";
		if(output > rankFour) {
			System.out.println("Gold");
			rank = "Gold";
		}
		if(output >= rankThree && output < rankFour){
			System.out.println("Silver");
			rank = "Silver";
		}
		if(output >= rankOne&& output < rankThree) {
			System.out.println("Bronze");
			rank = "Bronze";
		}
		if(output < rankZero) {
			System.out.println("None");
			rank = "None";
		}
		return rank;
	}

}
