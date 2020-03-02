import java.util.Scanner;
public class ArrayExerciseUserInput {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int[] miles = new int[5];
		for(int i = 0 ; i < miles.length; i++) {
			System.out.printf("Miles run on day %d: ", i+1);
			miles[i] = input.nextInt();
				}
		PrintArray(miles);
		int total = 0;
		for(int i = 0; i < miles.length; i++) {
			total += miles[i];
			
		}
		System.out.printf("Total of miles run: %d", total);
		input.close();
	}
	private static void PrintArray( int[] array) {
		for(int i = 0; i < array.length; i++) {
			System.out.printf("%d ", array[i]);
		}
		System.out.println();
	}

}
