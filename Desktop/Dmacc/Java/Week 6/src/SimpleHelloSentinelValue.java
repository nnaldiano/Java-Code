import java.util.Scanner;
public class SimpleHelloSentinelValue {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("Enter a name. When you are finished type 'done' .");
		String name = in.nextLine();
		
		while(!name.equalsIgnoreCase("done")) {
			System.out.println("Hello " + name + "!");
			System.out.print("Enter another name. When you are finished, type 'done'");
			name = in.nextLine();
		}
		System.out.println("Goodbye");
		in.close();
	}

}
