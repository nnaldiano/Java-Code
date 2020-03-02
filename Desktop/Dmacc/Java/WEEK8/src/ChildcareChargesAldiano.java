import java.util.Scanner;

public class ChildcareChargesAldiano {

	public static void main(String[] args) {
	Scanner in = new Scanner(System.in);
	
	
	System.out.print("Enter your child's age: ");
	int childAge = in.nextInt();
	System.out.print("Enter the number of days your child will attend this week: ");
	int daysPerWeek = in.nextInt();	
	System.out.print("Cost is: $" + childCost(childAge,daysPerWeek));
	
	in.close();
	}
		
	public static int childCost(int childAge,int daysPerWeek) {
		int AGECHILD = childAge;
		int WEEKDAYS = daysPerWeek;
		int rates [][] = {	
				{30,60,88,115,140},
				{26,52,70,96,120},
				{24,46,67,89,110},
				{22,40,60,75,88},
				{20,35,50,66,84},
		};
		int ratesCost = 0;
		Scanner in = new Scanner(System.in);
		
		while(AGECHILD >= 0 && AGECHILD <= 4 && AGECHILD != 999) {
			ratesCost = rates[AGECHILD ][WEEKDAYS - 1];
			System.out.print("Cost is: $" + ratesCost);
			System.out.println(" ");
			System.out.print("Enter your child's age or enter 999 to exit: ");
			AGECHILD = in.nextInt();
			if(AGECHILD == 999) {
				break;
			}
			System.out.print("Enter the number of days your child will attend this week or enter 999 to exit: ");
			System.out.print(" ");
			WEEKDAYS = in.nextInt();
			//ratesCost = rates[AGECHILD][WEEKDAYS -1];
		//	System.out.print(WEEKDAYS);
			//System.out.print(" ");
			//ratesCost = rates[AGECHILD][WEEKDAYS - 1];
			//System.out.print("Cost is: $" + ratesCost );
		}
		in.close();
		return ratesCost;
	}
}



