import java.awt.event.ActionListener; 
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
public class ButtonFrame1 extends JFrame{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private static final int FRAME_WIDTH = 100;
	private static final int FRAME_HEIGHT = 200;
	
	public ButtonFrame1() {
		createComponents();
		setSize(FRAME_WIDTH, FRAME_HEIGHT);
	}
	private void createComponents() {
		JButton button1 = new JButton("A");
		JButton button = new JButton("B");
		JPanel panel = new JPanel();
		panel.add(button1);
		panel.add(button);
		add(panel);
		ActionListener listener = new ClickListener();
		ActionListener listener1 = new ClickListener();
		button.addActionListener(listener);
		button1.addActionListener(listener1);
	}

}
