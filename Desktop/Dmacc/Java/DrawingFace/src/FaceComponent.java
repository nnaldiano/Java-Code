import java.awt.Color; 
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.awt.Shape;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Line2D;
import java.awt.geom.Ellipse2D.Double;

import javax.swing.JComponent;

public class FaceComponent extends JComponent{
	public void paintComponent(Graphics g) {
		Graphics2D g2 = (Graphics2D) g;
		
		//draws the head 
		Ellipse2D.Double head = new Ellipse2D.Double(5,10,150,150);
		g2.draw(head);
		
		g2.setColor(Color.BLUE);
		Shape circle = new Ellipse2D.Double(40, 60, 15, 15);
		Shape circle2 = new Ellipse2D.Double(100, 60, 15, 15);

		//Rectangle eye = new Rectangle(25,70,15,15);
		g2.draw(circle);
		g2.draw(circle2);
		
		//draw the mouth 
		Line2D.Double mouth = new Line2D.Double(30,110,130,110);
		g2.setColor(Color.BLUE);
		g2.draw(mouth);
	}
}
