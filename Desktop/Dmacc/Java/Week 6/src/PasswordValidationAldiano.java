import java.util.Scanner;
public class PasswordValidationAldiano {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		while (true) {
			System.out.print("Please enter the desired password: ");
			String password = in.nextLine();
			System.out.print("Please confirm password: ");
			String passwordConfirmation = in.nextLine();
			
			if(!password.equals(passwordConfirmation)) {
				System.out.println("Passwords do not match. Please re-enter password. ");
			}
			else if (password.equals(passwordConfirmation)) {
				Passwordvalidation(password, passwordConfirmation);
				System.out.print("Password has been changed");
				break;
			}
		}
	in.close();
	}
	public static boolean Passwordvalidation(String PASSWORD, String PASSWORDCONFIRM) {
		boolean Passwordlength = false;
		boolean isUpperCase = false;
		boolean isLowerCase = false;
		boolean isDigit = false;
		
		if(!PASSWORD.equals(PASSWORDCONFIRM)){
			System.out.print("Passwords do not match");
			return false;
		
		} 
		if(PASSWORD.length() >= 8){
			Passwordlength = true;
		}
		for(int i = 0; i < PASSWORD.length(); i++) {
			char charCase = PASSWORD.charAt(i);
			if (charCase >= 65 && charCase <= 90) {
				isUpperCase = true;
			}
		}
		for (int i = 0; i < PASSWORD.length(); i++) {
			char charCase = PASSWORD.charAt(i);
			if (charCase >= 97 && charCase <= 122) {
				isLowerCase = true;
			}
		}
		for(int a = 0; a < PASSWORD.length(); a++) {
			char n = PASSWORD.charAt(a);
			if(n >=48 && n <= 57) {
				isDigit = true;
			}
		}
		while(Passwordlength && isUpperCase && isLowerCase && isDigit) {
			System.out.println("Password changed");
			break;
		}
		/*if(!(Passwordlength && isUpperCase && isLowerCase && isDigit)) {
			while (true) {
				Scanner in = new Scanner(System.in);
				System.out.print("Please enter password: ");
				String password = in.nextLine();
				System.out.print("Please confirm password");
				String passwordConfirmation = in.nextLine();
				if (!password.equals(passwordConfirmation)) {
					System.out.println("\\nPasswords do not match. Try again.\n");
				}
				else if (password.equals(passwordConfirmation)) {
					Passwordvalidation(password,passwordConfirmation);
					break;
				}
				in.close();
				}
			} */
	
		return Passwordlength && isUpperCase && isLowerCase && isDigit;
	}
	
}

