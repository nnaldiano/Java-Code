import java.util.Scanner;
public class GradeScale {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String grade = " ";
		int counter = 0;
		int runningTotal = 0;
		
		System.out.print("How many tests have you taken?");
		int numOfTests = in.nextInt();
		
		while (counter < numOfTests) {
			System.out.print("What score did you earn on your exam: ");
			int score = in.nextInt();
			
			runningTotal += score;
			counter ++;
		}
		double earnedScore = (double)runningTotal/numOfTests;
		
		if (earnedScore >= 90) {
			grade = "A";
		} else if (earnedScore >= 80) {
			grade = "B";
		} else if (earnedScore >= 70) {
			grade = "C";
		} else if (earnedScore >= 60) {
			grade = "D";
		} else {
			grade = "F";
		}
		in.close();
	}
}
