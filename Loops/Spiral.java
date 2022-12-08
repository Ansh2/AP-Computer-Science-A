package Loops;

import javax.swing.*;
//import java.awt.geom.Point2D;
import java.awt.*;
import java.awt.geom.Point2D;
import javax.swing.JFrame;

public class Spiral extends JFrame {

	public Spiral() {
		super("Spiral");
		this.setVisible(true);
		this.setSize(600, 600);
		this.repaint();

	}

	public void paint(Graphics g) {
		super.paint(g);
		Graphics2D g2 = (Graphics2D) g;
		g2.setStroke(new BasicStroke(1));
		g.setColor(Color.white);
		g.fillRect(0, 0, 600, 600);

		Point2D.Double a = new Point2D.Double(300, 300);
		Point2D.Double b = new Point2D.Double(303, 300);
		
		
		
		int counter = 0;

		g.setColor(Color.red);
		for (int i = 0; i <= 507; i += 5) {
			g.drawLine((int) a.getX(), (int) a.getY(), (int) b.getX(), (int) b.getY());
			a.setLocation(b.getX(), b.getY());

			if (counter % 4 == 0) {
				b.setLocation(b.getX() + i, b.getY()); 

			} else if (counter % 4 == 1) {
				b.setLocation(b.getX(), b.getY() + i); 

			} else if (counter % 4 == 2) {
				b.setLocation(b.getX() - i, b.getY());

			} else if (counter % 4 == 3) {
				b.setLocation(b.getX(), b.getY() - i);
			
			}
			
			try {
				Thread.currentThread().sleep(200); 
			} catch (InterruptedException e) { 
				e.printStackTrace(); 
			
			}

			counter++;
		}

	}

	public static void main(String[] args) {
		Spiral application = new Spiral();
		application.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}