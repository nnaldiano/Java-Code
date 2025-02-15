package frame;
import control.BankAccount;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;



public class BankAccountFrame extends JFrame  {
	BankAccount account;
	private JButton Withdraw = new JButton("Withdraw");
	private JButton Deposit = new JButton("Deposit");
	private JLabel Balance = new JLabel("Balance: ");
	private JLabel Amount = new JLabel("Amount: ");
	private JTextField AmountText = new JTextField(12);

public BankAccountFrame(BankAccount b) {
	account = b;
	Balance.setText("balance=" + b.getBalance());
}
private void createComponents() {
	depositClickListener d = new depositClickListener();
	Deposit.addActionListener(d);
	withdrawClickListener w = new withdrawClickListener();
	Withdraw.addActionListener(w);
	JPanel controlPanel = new JPanel();
	controlPanel.add(Amount);
	controlPanel.add(AmountText);
	controlPanel.add(Balance);
	controlPanel.add(Deposit);
	controlPanel.add(Withdraw);
	add(controlPanel);
	setSize(400,100);
	
		
	
}
class depositClickListener implements ActionListener{

	@Override
	public void actionPerformed(ActionEvent e) {
		String a = Amount.getText();
		double depositAmt = Double.parseDouble(a);
		account.withdraw(depositAmt);
	}	
}
class withdrawClickListener implements ActionListener{

	@Override
	public void actionPerformed(ActionEvent e) {
		String a = Amount.getText();
		double withdrawAmt = Double.parseDouble(a);
		account.withdraw(withdrawAmt);	
	}
}

}
