

public class CoursNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public static boolean validateCourseNumber(String course) {
		//check to see if course string contains six characters
		//if not, automatically return false so we don't get an out of bounds error
		if (!(course.length() == 6)) {
			return false;
		}

		// check first char for letter
		char c1 = course.charAt(0);
		if (!(Character.isUpperCase(c1))) {
			return false;
		}

		// check second char for letter
		char c2 = course.charAt(1);
		if (!(Character.isUpperCase(c2))) {
			return false;
		}

		// check third char for letter
		char c3 = course.charAt(2);
		if (!(Character.isUpperCase(c3))) {
			return false;
		}

		// check fourth char for digit
		char d1 = course.charAt(3);
		if (!(Character.isDigit(d1))) {
			return false;
		}

		// check fifth char for digit
		char d2 = course.charAt(4);
		if (!(Character.isDigit(d2))) {
			return false;
		}

		// check fourth char for digit
		char d3 = course.charAt(5);
		if (!(Character.isDigit(d3))) {
			return false;
		}

		return true;
	}

}

