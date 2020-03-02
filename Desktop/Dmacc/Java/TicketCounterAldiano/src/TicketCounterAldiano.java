import javax.swing.JFrame;
public class TicketCounterAldiano {

	public static void main(String[] args) {
		JFrame frame = new JTicketCounterFrame();
		
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
		frame.setAlwaysOnTop(true);
	}

}
