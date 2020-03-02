
public class ArrayExercise {

	public static void main(String[] args) {
		int[] numbers = new int[4]; 
		printArray(numbers);
		// 2 4 6 8 
		numbers[0] = 2;
		numbers[1] = 4;
		numbers[2] = 6; 
		numbers[3] = 8;
		printArray(numbers);
	}
	private static void printArray(int[] array) {
		for(int i = 0; i< array.length; i++) {
			System.out.printf("%d", array[i]);
		}
		System.out.println();
	}

}
