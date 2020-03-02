//import java.util.Arrays;
import java.util.Scanner;
public class BadArrayIndexAldiano {

	public static void main(String[] args) {
		try 
		{
			Scanner in = new Scanner(System.in);
			String [] AnArray = new String[] {"Noah", "Joe", "Bob", "Taylor", "Hannah", "Isaiah", "Lisa", "Carl", "Jennifer", "Nigel"};
			System.out.println("Please enter a number between 0 and 9:");
			int UserInput = in.nextInt();
			System.out.println(AnArray[UserInput]);
			in.close();
		}catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("An exception happened, your input was out of bounds.");
		}
			
		
		
		
		
	}

}
