import java.util.Scanner;
public class SimpleForuserinput {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("How many times do you want to say hello?");
		int count = in.nextInt();
		
		for (int i = 0; i < count; i++) {
			System.out.println("Hello");
		}
		System.out.println("Goodbye");
		in.close();
	}

}
