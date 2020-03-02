import javax.swing.JFrame;

public class BankAccountViewer {

	public static void main(String[] args) {
		BankAccount account = new BankAccount(1000);
		JFrame frame = new BankAccountFrame(account);
		frame.setTitle("Bank Account");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
		
		
	}

}
