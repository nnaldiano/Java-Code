
public class LessThan50 {

	public static void main(String[] args) {
		int [] values = { 6, 90, 74, 33, 26, 19, 99, 105, 37, 2};
		
		for (int element : values ) {
			if (element < 50 ) {
				System.out.println(element);
			}
		}
	}

}
