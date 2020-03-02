import javax.swing.JOptionPane;
import java.time.LocalDateTime;
public class TimedResponseAldiano {

	public static void main(String[] args) {
		LocalDateTime time1 = LocalDateTime.now();
		int secs1 = time1.getSecond();
		int minute1 = time1.getMinute();
		JOptionPane.showConfirmDialog(null, "Is cereal soup?");
		LocalDateTime time2 = LocalDateTime.now();
		int secs2 = time2.getSecond();
		int minute2 = time2.getMinute();
		int difference = secs2 - secs1;
		if(minute2 != minute1) {
			difference = secs2 - secs1 + 60;
		}
		JOptionPane.showMessageDialog(null, "Start seconds: " + secs1 + "\nEnd seconds: " + secs2 + "\nIt took " + difference + " seconds for you to answer. \nWas it a difficult decision?");
		
	}

}
