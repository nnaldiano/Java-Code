import java.util.Scanner;
public class ShopperRewardsAldiano {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the total for your groceries: ");
		double Totalgrocery = scanner.nextDouble();
		System.out.printf("You recieve a discount coupon of: $" + "%.2f", couponDiscount(Totalgrocery));
		double GASdiscount = gasReward(Totalgrocery);
		System.out.printf("You have earned a $" + GASdiscount + " discount per gallon of gas");
		scanner.close();
	}

	public static double couponDiscount(double Totalgrocery) {
		double percentage = .04;
		double percentageOne = .07;
		double percentageTwo = .1;
		double percentageThree = .15;
		double coupon = 0;
		int levelOne = 10;
		int levelTwo = 70;
		int levelThree = 150;
		int levelFour = 250;
		if ( Totalgrocery > levelOne && Totalgrocery < levelTwo) {
				coupon = 0;
				coupon = Totalgrocery * percentage;
		} else if ( Totalgrocery > levelTwo && Totalgrocery < levelThree ) { 
		       coupon = 0;
		       coupon = Totalgrocery * percentageOne;
		} else if ( Totalgrocery > levelThree && Totalgrocery < levelFour) { 
		       coupon = 0;
		       coupon = Totalgrocery * percentageTwo;
		} else if (Totalgrocery > levelFour) { 
		       coupon = 0;
		       coupon = Totalgrocery * percentageThree;
		}
		return coupon;
	}
	public static double gasReward(double Totalgrocery) {
		double Gdiscount = .01;
		double GdiscountTwo = .02;
		double GdiscountThree = .03;
		double coupon1 = 0;
		double levelOne = 1;
		double levelTwo = 49;
		double levelThree = 49.01;
		double levelFour = 100;
		double levelFive = 100.1;
		if ( Totalgrocery > levelOne && Totalgrocery < levelTwo) {
				System.out.println("");
				coupon1 = Gdiscount;
		} else if ( Totalgrocery > levelThree && Totalgrocery < levelFour ) { 
				System.out.println("");
		       coupon1 = GdiscountTwo;
		} else if ( Totalgrocery > levelFive) { 
				System.out.println("");
		       coupon1 = GdiscountThree;
		       
		} 
	return coupon1;
	}
}


	

			

