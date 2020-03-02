
public class EqualArrayCheckAldiano {

	public static void main(String[] args) {
		int a1 [] = {1,2,3,4,5};
		int[]a2 = {3,6,2,9,8,2,5,2,4,5};
		int[]a3 = {2,5,6,7,8,2,5,2,5,6,7,2,1,2,4,2,2};
		int[]a4 = {1,2,3,4,5};
		
		
		System.out.println(CheckArrayLengths(a1,a2));
		System.out.println(CheckArrayLengths(a1,a3));
		System.out.println(CheckArrayLengths(a1,a4));
	}
	public static String CheckArrayLengths(int[] array, int[] array2) {
		String ArrayCheck = " ";
		for( int i = 0; i < array.length; i++) {
			if(array.length != array2.length) {
				ArrayCheck = "Arrays 1 and 2 and 3 are not equal.";
			}else if(array.length == array2.length) {
				ArrayCheck = "Arrays 1 and 4 are equal.";
			}
		}
		return ArrayCheck;
	
	}
}
