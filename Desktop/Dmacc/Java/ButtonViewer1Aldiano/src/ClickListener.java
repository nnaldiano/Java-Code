import java.awt.event.ActionEvent;  
import java.awt.event.ActionListener;

public class ClickListener implements ActionListener {
	private int clicked;
	
	public void actionPerformed(ActionEvent e) {
		System.out.println("I was clicked " + clicked + " times!");
		clicked++;
		
	}

}
