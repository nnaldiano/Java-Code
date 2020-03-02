
public class BlackJack {

	public static void main(String[] args) {
		int digit = 1 + (int)(Math.random() * 13);
		String digitName = "";
		String suitName = "";
		int suit = 1 + (int)(Math.random() * 4);
		
		switch(digit)
		{
		case 1: digitName = "ace"; break;
		case 2: digitName = "two"; break;
		case 3: digitName = "three"; break;
		case 4: digitName = "four"; break;
		case 5: digitName = "five"; break;
		case 6: digitName = "six"; break;
		case 7: digitName = "seven"; break;
		case 8: digitName = "eight"; break;
		case 9: digitName = "nine"; break;
		case 10: digitName = "ten"; break;
		case 11: digitName = "jack"; break;
		case 12: digitName = "queen"; break;
		case 13: digitName = "king"; break;
		default: digitName = ""; break;
		}
		switch(suit) {
		case 1: suitName = "diamond"; break;
		case 2: suitName = "heart"; break;
		case 3: suitName = "club"; break; 
		case 4: suitName = "spade"; break;
		}
		
		String playerCard = digitName + " of " + suitName;
		
		System.out.println(digit);
		System.out.println(suit);
		System.out.println("----------------");
		System.out.println(playerCard);
	}

}
