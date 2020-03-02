import java.util.Scanner;
public class SimpleHelloUserInput {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		System.out.print("How many times do you want to say hello?");
		int count = in.nextInt();
		
		while(count > 0){
			System.out.println("Hello");
			count --;
		}
		System.out.println("Goodbye.");
		in.close();
	}
}

