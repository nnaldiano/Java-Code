
public class CompoundInterestAldiano {

	public static void main(String[] args) {
		System.out.println(computeBalance(125.53,.5,14));
		
	}
	
	public static double computeBalance(double initialDeposit, double annualInterest, int numberOfyears) {
		
		// A = P(1 + r) ^ t //
		
		double interest = initialDeposit * (Math.pow((1 + annualInterest),numberOfyears));
		return interest;	
	}
	
	
	
}


