import java.util.Scanner;
public class CourseNumber {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Please enter a valid course number: ");
		String userCourseNumber = in.nextLine();

		while(!(validateCourseNumber(userCourseNumber))){
			System.out.println("Try again!Please enter a vlaid course number:");
			userCourseNumber = in.nextLine();
			}
		System.out.println("You have entered a valid course number.");
		
		in.close();
	}
	public static boolean validateCourseNumber(String course) {
		if (!(course.length() ==6 )) {
		}
		return false;
	}

}
