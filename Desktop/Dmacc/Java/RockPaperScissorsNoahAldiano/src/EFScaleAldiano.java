import java.util.Scanner;
public class EFScaleAldiano {
	public static void main(String[] args) {
		 Scanner scanner = new Scanner(System.in);
		 System.out.println("enter a 3 second wind gust speed");
		 int gust = scanner.nextInt();
		 int WS = WindSpeed(gust);
		 System.out.println(WS);
		 scanner.close();
	}
		 public static int WindSpeed(int gust) {
				//double coupon1 = 0;//
			 	int efLevel = 0;
				int levelOne = 65;
				int levelTwo = 85;
				int levelThree = 86;
				int levelFour = 110;
				int levelFive = 111;
				int levelSix = 135;
				int levelSeven = 136;
				int levelEight = 165;
				int levelNine = 166; 
				int levelTen = 200;
				
				int levelEF =  0;
				int levelEFone = 1;
				int levelEFtwo = 2;
				int levelEFthree = 3;
				int levelEFfour = 4;
				int levelEFfive = 5;
				if ( gust > levelOne && gust < levelTwo)
				{
					System.out.println("");
					efLevel = levelEF;	 //65-85//
				}
				if (gust > levelThree && gust < levelFour)
				{
					System.out.println("");
					efLevel = levelEFone; //86-110//
				}
				if (gust > levelFive && gust < levelSix)
				{
					System.out.println("");
					efLevel = levelEFtwo; //111-135//
				}
				if (gust > levelSeven && gust < levelEight)
				{
					System.out.println("");
					efLevel = levelEFthree; //136-165//
				}
				if (gust > levelNine && gust < levelTen)
				{
					System.out.println("");
					efLevel = levelEFfour; //166-200//
				}
				if (gust > levelTen)
				{
					System.out.println("");
					efLevel = levelEFfive; //more than 200//
				}
				return efLevel;

			}
		}
	

