import javax.swing.JFrame; 
import javax.swing.JPanel;

import Controller.FormPanel;
public class StartMadlib {

	public static void main(String[] args) {
		JFrame frame = new JFrame();
		JPanel panel = new FormPanel();
		
	frame.add(panel);
	frame.setSize(250, 350);
	frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	frame.setVisible(true);

	}

}
