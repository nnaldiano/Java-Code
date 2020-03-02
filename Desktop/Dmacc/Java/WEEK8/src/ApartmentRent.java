import java.util.Scanner;
public class ApartmentRent {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		int[][]rents = {
		{500,800,1100}, //represents first floor
		{650, 950, 1200}, //2nd floor
		{700, 1100, 1400}, //3rd floor
		{1000,1300,1700}, //4th floor
		}; 
		
		
		System.out.print("Enter a floor: ");
		int floor = in.nextInt();
		
		while (floor > 0 && floor < 5) {
			System.out.print("Enter # of bedrooms: ");
			int bedrooms = in.nextInt();
			// [floor] will access the 1st item 
			// we need the item at position 0 
			// [floor -1] will access items at position 0
			int monthlyRent = rents[floor -1][bedrooms];
			
			System.out.println("The rent per month is $" + monthlyRent);
			
			System.out.print("Select another floor or -1 to exit: ");
			floor = in.nextInt();
					}
		
		in.close();
		
	}

}
