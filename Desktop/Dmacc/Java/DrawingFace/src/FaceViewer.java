import javax.swing.JFrame;
public class FaceViewer {

	public static void main(String[] args) {
		JFrame frame = new JFrame();
		frame.setSize(250,250);
		frame.setTitle("A face");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		FaceComponent component = new FaceComponent();
		frame.add(component);
		
		frame.setVisible(true);

	}

}
