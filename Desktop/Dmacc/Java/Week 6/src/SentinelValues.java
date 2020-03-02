import java.util.Scanner;
public class SentinelValues {

	public static void main(String[] args) {
		int totalScore = 0;
		int testCount = 0;
		
		Scanner in = new Scanner(System.in);
		
		System.out.print("Enter a test score, or -1 to exit");
		int score = in.nextInt();
		
		while(score >= 0) {
			totalScore += score;
			testCount++;
			
			System.out.print("Enter another test score, or -1 to exit: ");
			score = in.nextInt();
		}
		System.out.println("Total score: " + totalScore);
		System.out.println("# of tests: " + testCount);
		System.out.println("The average score was " + (double)totalScore/testCount);
	in.close();
	}

}
