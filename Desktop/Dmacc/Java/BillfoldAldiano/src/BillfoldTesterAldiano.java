import java.time.LocalDate;


import billfold.Billfold;
import cards.CreditCard;
import cards.DMACCOneCard;
import cards.DriverLicense;
public class BillfoldTesterAldiano {

	public static void main(String[] args) {
		CreditCard a = new CreditCard();
		
		CreditCard visaDebitCard = new CreditCard("Noah", "7322 2493 1273 8923", 608);
		DriverLicense NoahDriverLicense = new DriverLicense("Noah", "1234567", LocalDate.of(2000, 2, 26));
		
		Billfold billfold1 = new Billfold();
		billfold1.addCard(visaDebitCard);
		billfold1.addCard(NoahDriverLicense);
		System.out.println(billfold1.formatCards());
		System.out.println();
		
		DriverLicense ExpiredDriverLicense = new DriverLicense("Noah", "2039276", LocalDate.of(1975, 12, 10));
		DMACCOneCard dmaccCard = new DMACCOneCard("Noah", "295829687");
		
		Billfold billfold2 = new Billfold();
		billfold2.addCard(ExpiredDriverLicense);
		billfold2.addCard(dmaccCard);
		
		System.out.println(billfold2.formatCards() + "\nExpired Cards: " + billfold2.getExpiredCardCount());
		System.out.println();
		
		DMACCOneCard me = new DMACCOneCard("Noah", "1QAZXSW");
		DMACCOneCard friend = new DMACCOneCard("Noah", "1QAZXSW");
		
		Billfold billfold3 = new Billfold();
		billfold3.addCard(me);
		billfold3.addCard(friend);
		
		System.out.println(billfold3.formatCards());
		
		System.out.println("Has the same card been created twice? " + me.equals(friend));
	}

}
