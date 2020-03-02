import javax.lang.model.element.Name;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class JTicketCounterFrame extends JFrame {
	private int TICKET_AMOUNT = 30;
	private JLabel instructions = new JLabel();
	private JTextField name = new JTextField(15);
	private JButton submit = new JButton();
	private JLabel results = new JLabel();
	
	
	
	public JTicketCounterFrame() {
		instructions.setText("Limit of only 5 tickets per cusomter");
		submit.setText("Confirm");
		ClickListener l = new ClickListener();
		submit.addActionListener(l);
		JPanel p =  new JPanel();
		
		p.add(instructions);
		p.add(name);
		p.add(submit);
		p.add(results);
		
		add(p);
		setSize(300,150);
		}  
class ClickListener implements ActionListener{
	@Override
	public void actionPerformed(ActionEvent e) {
		
		int buyers;
		String tempName = name.getText();
		int var = Integer.parseInt(tempName);
		String nextText = tempName + " tickets bought";
		TICKET_AMOUNT = TICKET_AMOUNT - var;
		System.out.println(TICKET_AMOUNT);
		results.setText(nextText);
		name.setText("");
	
			
		
		if(var > 5) {
			nextText = 0 + " tickets bought, only 5 tickets per customer.";
			TICKET_AMOUNT = TICKET_AMOUNT + var;
			results.setText(nextText);
			System.out.println(TICKET_AMOUNT);
		} 
		if(TICKET_AMOUNT == 0 ) {
			results.setText("Tickets are now sold out.");
		}
		
		
		
	
	}
}		
			

	
}




