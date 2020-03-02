import javax.swing.JFrame; 
import javax.swing.JPanel;

import view.GamePanel;

public class StartingGuessingGame {

	public static void main(String[] args) {
		
		JFrame frame = new JFrame();
		JPanel panel = new GamePanel();
		
		frame.add(panel);
		frame.setSize(250,350);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
	}

}
