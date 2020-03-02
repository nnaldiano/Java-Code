import java.util.Scanner;

public class VowelCount2Aldiano {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	Scanner in = new Scanner(System.in);
		
		System.out.println("Please enter a phrase: ");
		String phrase = in.nextLine();
		int vowels = 0;
		int ys = 0;
		for(int i = 0; i < phrase.length(); i++) {
			char ch = phrase.charAt(i);
			if((ch == 'a') || (ch == 'e') || (ch == 'i') || (ch == 'o') || (ch == 'u')){
				vowels++;
			}
			if(vowels == 0) {
				for(int j = 0; j < phrase.length(); j++) {
					char bb = phrase.charAt(j);
					if((bb == 'y')) {
						ys++;
					}
				}
				
			}
			
		}
		if( vowels == 0 && ys == 0) {
			System.out.println("You have made a spelling mistake somewhere.");
		}
		System.out.println(vowels + " vowel in " + phrase);
		System.out.println(ys + " vowel in ");
		in.close();
	}
}
