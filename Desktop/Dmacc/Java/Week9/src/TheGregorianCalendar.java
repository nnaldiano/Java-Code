import java.util.Date;
import java.util.GregorianCalendar;
public class TheGregorianCalendar {

	public static void main(String[] args) {
		/** The date at the end of the last century */
	    Date d1 = new GregorianCalendar(1978, 02, 02, 23, 59).getTime();
	    /** Today's date */
	    Date today = new Date();
	    // Get msec from each, and subtract.
	    long diff = today.getTime() - d1.getTime();
	    System.out.println("You (up to " + today + ") are " + (diff / (1000 * 60 * 60 * 24)) + " days old.");
	}

}
