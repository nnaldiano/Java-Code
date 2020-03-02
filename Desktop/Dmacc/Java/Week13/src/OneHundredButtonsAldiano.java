
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class OneHundredButtonsAldiano {
	public static void main(String[] args) {
		
		JPanel panel = new JPanel();
		JLabel label = new JLabel("Noah Aldiano");
		panel.add(label);
		for(int i = 1; i< 101;i++) {
			String buttonLabel = String.valueOf(i);
			JButton button = new JButton(buttonLabel);
			
			System.out.println("hi");
			panel.add(button);
			
		}
		
		
		
		JFrame frame = new JFrame();
		frame.add(panel);
	
		

		final int FRAME_WIDTH = 1000;
		final int FRAME_HEIGHT = 1000;
		frame.setSize(FRAME_WIDTH, FRAME_HEIGHT);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		frame.setVisible(true);
		}
		
		}
	


