package test;
import java.util.Scanner;
public class CompareNumberAldiano {
// Noah Aldiano//
	public static void main(String[] args) {
		Scanner num1 = new Scanner(System.in);
		System.out.println("Enter a number:");
		double int2 = num1.nextDouble();
		
		Scanner num2 = new Scanner(System.in);
		System.out.println("Enter another number:");
		double int3 = num2.nextDouble();
		/*System.out.println(int2);
		System.out.println(int3);*/
		 
		/* find out if the numbers are equal
		 * greater than or less than each other
		 */
		final boolean equalto = int2 == int3;
		System.out.println(int2 + " is equal to " + int3 + " " + equalto);
		
		final boolean greaterthan = int2 > int3;
		System.out.println(int2 + " is greater than " + int3 + " " + greaterthan);
		
		final boolean lessthan = int2 < int3;
		System.out.println(int2 + " is less than " + int3 + " " + lessthan);
		
		num1.close();
		num2.close();
	}

}
