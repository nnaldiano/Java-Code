
public class SimpleArrayYourLastName {

	public static void main(String[] args) {
	double[] arrInt = new double[15];
	
	int i = arrInt.length;
	int count = 0;
		for(i = 0; i <arrInt.length; i++) {
			count++;
			
			arrInt[i] = count;
		}
		arrInt[0] = 13.01;
		for(double element: arrInt) {
			System.out.println(element);
		}
		
	}
}


