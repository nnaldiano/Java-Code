package billfold;
import cards.Card;

public class Billfold {
	private Card card1;
	private Card card2;
	
	public Billfold() {
	}
	public void addCard(Card c1) {
		if(card1 == null) {
			card1 = c1;
		}
		else if(card2 == null) {
			card2 = c1;
		}
	}
	public String formatCards() {
		return "[" + card1.format() + " | " + card2.format() + "]";
	}
	
	public int getExpiredCardCount() {
		int count=0;
		if(card1.isExpired()) {
			count++;
		}
		if(card2.isExpired()) {
			count++;
		}
		return count;
	}
}
