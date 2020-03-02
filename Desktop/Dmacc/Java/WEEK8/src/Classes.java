import java.util.Scanner;
public class Classes {

	public static void main(String[] args) {
		String [] classes = {"Yoga 1", "Yoga 2", "Children's Yoga", "Prenatal Yoga", "Senior Yoga"};
		
		Scanner in = new Scanner(System.in);
		
		System.out.print("Please enter a class number to see the class: ");
		int num = in.nextInt();
		
		if ((num >=1 && (num <= classes.length))) {
			String className = classes[num - 1];
			System.out.println("You selected "+ num + ": " + className);
		}else {
			System.out.println("Invalid entry");
		}
		in.close();
	}

}
