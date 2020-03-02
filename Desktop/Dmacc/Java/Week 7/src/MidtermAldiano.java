import java.util.Scanner;
public class MidtermAldiano {
//Noah Aldiano//
	public static void main(String[] args) {
		boolean exit = false;
		Scanner scanner = new Scanner(System.in);
		while(exit != true) {
		System.out.println("Enter your team name or enter 'ZZZ' to exit:  ");
		String TeamName = scanner.next();
		if (TeamName.equals("ZZZ")){
			exit = true;
			break;
	}
		System.out.println("Is your team diamond? Enter 'Y' for yes or 'N' for no.");
		String Diamond = scanner.next();
		Diamond.toLowerCase();
		System.out.println("Enter your amount of sales: ");
		double SalesAmount = scanner.nextDouble();
		String Something = TeamName.substring(0,1);
		String SomethingTwo = TeamName.substring(1);
		String SomethingThree = Something.toUpperCase() + SomethingTwo.toLowerCase();
		System.out.println(SomethingThree + " -- " + BounusAmount(SalesAmount, Diamond));
		}
		scanner.close();

	}
		
	public static double BounusAmount(double SalesAmount, String Diamond) {
		if(Diamond.equals("Y")) {
			Double Total = SalesAmount *.03;
			return Total;
	} else {
			Double TotalTwo = SalesAmount * .02;
			return TotalTwo;
	}
}

}
