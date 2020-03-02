
public class MultiplicationTableAldiano {

	public static void main(String[] args) {
		int numOfRows = 13;
		int numOfCols = 13;
		
		for(int r = 1; r < numOfRows; r++) {
			
			
			System.out.print(r + ": ");
			
			for(int c = 2; c < numOfCols; c++) {
				int sum = r*c;
				System.out.printf("%4d", sum);
				
			}
			System.out.println();
		}
	}

}
