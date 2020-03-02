import java.util.Scanner;
public class AverageAgeModifiedAldiano {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		Scanner age = new Scanner(System.in);
		System.out.print("How many ages would you like to enter?");
		int count = in.nextInt();
		double agesTotal = count;
		double total = 0;
		
		while(count > 0) { // while the count is more than 0//
			System.out.print("Enter an age");
			int userInput = age.nextInt();
			total = userInput + total; // add users input to the running total of ages//
			count --; // subtract 1 from the count variable//
		}
		double ageAverage = total/agesTotal; // divide the running total of ages by the amount of anges the user entered//
		System.out.println(ageAverage); // print out the average output//
	in.close();
	age.close();
	}

}
