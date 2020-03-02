import java.util.Scanner;

public class VowelFoundAldiano {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Please enter a phrase or type  to exit: ");
			String phrase = in.nextLine();
			System.out.println(phrase);
			while(!phrase.equals("~exit"))
				for(int i = 0; i < phrase.length(); i++) {
					char ch = phrase.charAt(i);
					if((ch == 'a') || (ch == 'e') || (ch == 'i') || (ch == 'o') || (ch == 'u') || (ch == 'y')){
						System.out.println("A vowel was found!");
						System.out.println("Please enter a phrase or type ~exit to exit:");
						phrase = in.nextLine();
					}
					if(phrase.equals("~exit")) {
						break;
					}
				}
			in.close();
	}
}
	

