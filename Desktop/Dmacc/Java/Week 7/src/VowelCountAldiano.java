import java.util.Scanner;
public class VowelCountAldiano {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		System.out.println("Please enter a phrase: ");
		String phrase = in.nextLine();
		
		int blankCount = 1;
		
		for(int i = 0; i < phrase.length(); i++) {
			String sub = phrase.substring(i, i+1);
			
			if(sub.equals(" ")) {
				blankCount++;
			}
		}
		System.out.println("There are " + blankCount + " words in the phrase");
		in.close();
		
		
	 }

}
