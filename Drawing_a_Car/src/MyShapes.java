import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JComponent;


public class MyShapes extends JComponent{
	
	public void paintComponent(Graphics g)
	{
		g.setColor(Color.BLACK);
		g.drawLine(50, 150, 300, 150); // Bottom
		g.drawLine(50, 150, 50, 100); // Back
		g.drawLine(50, 100, 100, 100); //trunk
		g.drawLine(100, 100, 125, 50); // back window
		g.drawLine(125, 50, 225, 50); //roof
		g.drawLine(225, 50, 250, 100); // front window
		g.drawLine(250, 100, 300, 100); // hood
		g.drawLine(300, 100, 300, 150); // grill
		g.setColor(Color.RED);
		g.drawOval(75, 150, 50, 50);
		g.drawOval(225, 150, 50, 50);
		
		
	}

}
