import javax.swing.JComponent;
import javax.swing.JFrame;
public class ChartViewer4 {
	public static void main(String[]args) {
		JFrame frame = new JFrame();
		frame.setSize(400,200);
		frame.setTitle("A:=");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		ChartComponent4 component = new ChartComponent4();
		frame.add(component);
		
		frame.setVisible(true);
		
	}

}
