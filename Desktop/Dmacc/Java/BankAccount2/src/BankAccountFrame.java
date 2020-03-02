import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class BankAccountFrame extends JFrame {
	BankAccount account;
	
	private static final int FIELD_WIDTH = 10;
	private JTextField amountTextbox = new JTextField(FIELD_WIDTH);
	private JLabel Amount = new JLabel("Amount: ");
	private JButton Withdraw = new JButton("Withdraw: ");
	private JButton Deposit = new JButton("Deposit: ");
	private JLabel Balance = new JLabel();
	
	public BankAccountFrame(BankAccount b) {
		account = b;
		depositClickListener d = new depositClickListener();
		Deposit.addActionListener(d);
		withdrawClickListener w = new withdrawClickListener();
		Withdraw.addActionListener(w);
		
		JPanel panel = new JPanel();
		panel.add(Amount);
		panel.add(amountTextbox);
		panel.add(Withdraw);
		panel.add(Deposit);
		panel.add(Balance);
		
		add(panel);
		setSize(400,100);
		Balance.setText(String.format("Balance: %.2f", account.getBalance()));
		
	}
	
	
	class depositClickListener implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent arg0) {
			String a = amountTextbox.getText();
			double depositAmount = Double.parseDouble(a);
			account.deposit(depositAmount);
			Balance.setText(String.format("Balance: %.2f", account.getBalance()));
		}
		
	}
	
	class withdrawClickListener implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			String a = amountTextbox.getText();
			double withdrawAmount = Double.parseDouble(a);
			account.withdraw(withdrawAmount);
			Balance.setText(String.format("Balance: %.2f", account.getBalance()));
		}
		
	}
	
	


}
