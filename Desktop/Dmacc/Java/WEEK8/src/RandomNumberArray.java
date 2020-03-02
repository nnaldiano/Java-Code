
public class RandomNumberArray {

	public static void main(String[] args) {
		int[] values = new int[10];
		 
		for (int i = 0; i < values.length; i++) {
			int x = 1 + (int)(Math.random() * 100);
			
			values [i] = x; 
		}
		for (int element :values) {
			System.out.print(element + ",");
		}
		
		
			
	}

}
