import java.util.Scanner;
public class PrintStarsAldiano {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("How many rows of stars would you like printed?");
		int counter = scan.nextInt();
		int rowOfstars = 0;
		 
			do {
		
				System.out.print(rowOfstars);
				System.out.println("********");
				rowOfstars++;
			} while(rowOfstars <= counter);
			scan.close();
		}
	}


