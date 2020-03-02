
public class ArrayMethods {

	public static void main(String[] args) {
		int[] a1 = {1,2,3,4,5};
		int[] a2 = {4,5,3,4,2};
		
		// compare two arrays a1 and a2
		boolean equal = true;
		for(int i =0; i < a1.length; i++) {
			// if an item in array a1 
			// is not equal to an item of array a2
			// make equal false
			if(a1[i] != a2[i]) {
				equal = false;
			}
		}
		System.out.println("Arrays are equal?" + equal);
		
		
	}

}
