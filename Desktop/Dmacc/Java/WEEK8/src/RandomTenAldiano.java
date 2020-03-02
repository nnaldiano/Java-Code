
public class RandomTenAldiano {
public static int RandomNumbers() {
	final int Length = 20;
	int divider = 2;
	
	int j = (int)(Math.random() %divider) + (int)(Math.random() * Length);
	return(j);
}
	public static void main(String[] args) {
	
		int divider = 2;
		int Values = 10, randNum, i, min, max;
		int ArrayNum[] = new int[Values];
		for (i = 0; i < Values; i++) {
			randNum = RandomNumbers();
			ArrayNum[i] = randNum;
		}
		System.out.print("All array items: " );
		for(int elements : ArrayNum) {
			System.out.print(elements + ",");
		}
		System.out.println(" ");
		System.out.print("Even index items: ");
		for(i = 0; i <Values; i++) {
			if (i %divider == 0) {
				System.out.print(ArrayNum[i] + ",");
			}
		}
		System.out.println(" ");
		System.out.print("Even elements: ");
		for (i = 0; i <ArrayNum.length; i++) {
			if(ArrayNum[i] %divider == 0 ) {
				System.out.print(ArrayNum[i] + ",");
			}			
		}
		System.out.println(" ");
		System.out.print("Reversed array: ");
		for (i = Values - 1; i >= 0; i--) {
			System.out.print(ArrayNum[i] + ",");
		}
		System.out.println(" ");
		System.out.print("First array element: " + ArrayNum[0]);
		System.out.println("  ");
		System.out.print("Last array element: " + ArrayNum[Values - 1]);
		min = ArrayNum[0];
		max = ArrayNum[0];
		for (i = 0; i < Values; i++) {
			if (max < ArrayNum[i]) {
				max = ArrayNum[i];
			}
		}
		System.out.println(" ");
		System.out.print("Highest number in array: " + max);
		System.out.println(" ");
		for( i = 0; i < Values; i++) {
			if(min < ArrayNum[i]) {
				min = ArrayNum[i];
			}
		}
		System.out.print("Lowest number in array: " + min);
		System.out.println(" ");
		}
}
	
