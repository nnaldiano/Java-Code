
public class SayThankYou {

	public static void main(String[] args) {
		System.out.println(sayThanks("Mike"));
		System.out.println(sayThanks("Michael", "Scott"));
		System.out.println(sayThanks("Sir","Michael", "Scott"));
		
		 }
		
		 public static String sayThanks(String firstName) {
		 return "Thanks, " + firstName + "!";
		 }
		
		 public static String sayThanks(String firstName, String lastName){
		 return "Thank you, " + firstName + " " + lastName;
		 }
		
		 public static String sayThanks(String title, String firstName, String lastName){
		 return "Thank you so very much, " + title + " " + firstName + " " + lastName;

	}

}
