import java.util.Scanner;
public class Forloopcountdown {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		System.out.print("How many times do you want to say hello?");
		int count = in.nextInt();
		
		for(int i = count; i > 0; i--) {
			System.out.println("Hello");
		}
	
		System.out.print("Goodbye");
		in.close();
	}

}
