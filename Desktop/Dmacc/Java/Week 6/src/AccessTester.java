import java.util.Scanner;
public class AccessTester {

	public static void main(String[] args) {
		int total = 0;
		int dayCounter = 1;
		
		Scanner in = new Scanner(System.in);
		System.out.print("How many days did you work this week?");
		int numberOfDays = in.nextInt();
		
		while (dayCounter <= numberOfDays) {
			System.out.print("How many hours did you work on Day " + dayCounter);
			int numberofHours = in.nextInt();
			total += numberofHours;
			dayCounter++;
		}
		System.out.println("You worked " + total + " hours this week.");
		
		in.close();
	}

}
