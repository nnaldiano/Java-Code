
import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.Dimension;
import java.awt.GridLayout;
import Controller.TicketCounterPanel;
import Model.TicketCounter;
public class StartTicketCounter {
	//Noah Aldiano
	public static void main(String[] args) {
	
	
	JFrame frame = new JFrame();
	JPanel panel = new TicketCounterPanel();
	
	frame.add(panel);

	frame.setSize(450,475);
	frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	frame.isAlwaysOnTop();
	frame.setVisible(true);

	
	
	}

}
