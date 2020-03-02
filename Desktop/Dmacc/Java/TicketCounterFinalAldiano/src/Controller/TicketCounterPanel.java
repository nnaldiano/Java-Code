package Controller;
import java.awt.event.ActionListener;
import java.io.InputStream;
import java.awt.event.ActionEvent;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Image;
import javafx.scene.*;
import javax.swing.BorderFactory;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.Border;
import javax.swing.JProgressBar;
import Model.TicketCounter;

public class TicketCounterPanel extends JPanel {
	// Noah Aldiano
	private static final String GenerateImage = null;
	int ticketProgress = 0;
	String ticketString = "0";
	
	

	
	private JLabel Instructions = new JLabel("Enter how many tickets you'd like to purchase (1-6):");
	private JTextField ticketInput = new JTextField(12);
	private JButton purchaseTickets = new JButton("Purchase tickets");
	private JLabel ticketCounter = new JLabel("");
	private JLabel TICKETS = new JLabel("");
	private JLabel ticketWarning = new JLabel("");
	private JButton clearTicket = new JButton("Clear order");
	private JProgressBar ticketsLeft = new JProgressBar();
	private JLabel MovieLabel = new JLabel();
	
	
	Image icon = new ImageIcon(this.getClass().getResource("/FVF.jpg")).getImage();
	
	JLabel IMAGE = new JLabel();
	TicketCounter ticket = new TicketCounter();
	Font font = new Font("Courier", Font.BOLD,20);
	
	Border border = BorderFactory.createLineBorder(Color.BLACK,3);
	
	public TicketCounterPanel() {
		add(Instructions);
		add(ticketInput);
		add(purchaseTickets);
		TICKETS.setText(ticket.getTICKET_TOTAL()+ " tickets available.");
		add(clearTicket);
		add(ticketsLeft);
		add(TICKETS);
		add(ticketWarning);
		add(IMAGE);
		add(MovieLabel);
		IMAGE.setIcon(new ImageIcon(icon));
		MovieLabel.setText("Ford vs Ferrari ticket pre-sale!");
		MovieLabel.setFont(font);
		IMAGE.setVisible(true);
		ticketsLeft.setMinimum(0);
		ticketsLeft.setMaximum(45);
		ticketsLeft.setValue(0);
		ticketsLeft.setVisible(true);
		IMAGE.setBorder(border);
		
		purchaseTicketsListener ptl = new purchaseTicketsListener();
		purchaseTickets.addActionListener(ptl);
		
		clearTicketListener ctl = new clearTicketListener();
		clearTicket.addActionListener(ctl);
		
		
		
		}
	class purchaseTicketsListener implements ActionListener{
		@Override
		public void actionPerformed(ActionEvent arg0) {
			// TODO Auto-generated method stub
		int var;
		int ticketsRemaining;
		int checkforZero;
		String Userinput = ticketInput.getText();
		try {
		var = Integer.parseInt(Userinput);
		if(var <= 6 && var >= 1 && ticketProgress != 45) {
			ticketWarning.setVisible(false);
			TICKETS.setVisible(true);
			ticketInput.setText(Userinput);
			ticketProgress = var + ticketProgress;
			ticket.setTICKET_INPUT(ticketProgress);
			ticketsRemaining = ticket.getTICKET_TOTAL() - ticketProgress;
			ticketsLeft.setValue(ticketProgress);
			TICKETS.setText(Integer.toString(ticketsRemaining) + " available tickets.");
			}
		if(var <= 0) {
				ticketWarning.setVisible(true);
				ticketWarning.setText("You can't buy a negative amount of tickets.");
				ticketInput.setText("");
				}
		if(var > 6) {
				ticketWarning.setVisible(true);
				TICKETS.setVisible(false);
				ticketWarning.setText("There is a limit of 6 tickets per customer");
				ticketInput.setText("");
				}
		if(ticketProgress > 45) {
				TICKETS.setText("Ford vs Ferrari ticket pre-sale is sold out!");
			}
			
			
		}catch (NumberFormatException e) {
			ticketWarning.setVisible(true);
			ticketWarning.setText("Please enter an amount of tickets between 1 and 6 that isn't a decimal");
			ticketInput.setText("");
		}
	}
	
}
	class clearTicketListener implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent arg0) {
			// TODO Auto-generated method stub
			ticketInput.setText("");
			ticketWarning.setVisible(false);
			ticketCounter.setVisible(true);
			TICKETS.setVisible(true);
			ticketCounter.setText("0");
			
		}
		
	}

}
