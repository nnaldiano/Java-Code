
public class TwoDArrayPractice {

	public static void main(String[] args) {
		final int rows = 7;
		final int columns = 3;
		int[][] table = new int[rows][columns];
		int firstElement = table[0][0]; // gets first element of the array 
		int lastElement = table[rows -1][columns -1]; // gets last element of the array 
		
		for(int i = 0; i < rows; i++) {
			for(int j = 0; j < columns; j++) {
				//table[i][j] = 13; this will fill the whole table with 13
				//table[i][j] = (i + j) % 2; will fill the table with 0's and 1's
				//table[0][j] = 0; prints the top row of the table
				//table[rows - 1][j] = 0; prints the bottom row
				//sum = sum + table[i][j]; will print out the sum of the whole table
				System.out.printf("%8d", table[i][j]);
			}
			System.out.println();
		}
		System.out.println(lastElement);
		System.out.println(firstElement);

	}

}
