
public class NestedLoops {

	public static void main(String[] args) {
		int numOfRows = 10;
		int numOfCols = 10;
		
		for(int r = 0; r < numOfRows; r++) {
			
			System.out.print(r + ": ");
			
			for(int c = 0; c < numOfCols; c++) {
				System.out.print(c + " ");
			}
			System.out.println();
		}
	}

}
