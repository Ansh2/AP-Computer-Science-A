package Loops;

import java.awt.*; 
import javax.swing.*;

public class LineArt2 extends JFrame{ 

	public LineArt2() {
		super("LineArt2");
		this.setVisible(true); 
		this.setSize(600, 600);
		this.repaint();
	}
	
	
	public void paint(Graphics g) {
		super.paint(g);
		Graphics2D g2 = (Graphics2D) g;
		g2.setStroke(new BasicStroke(1));
		
		
		g2.setColor(Color.RED);
		for (int x = 300, y = 100; x <= 500; x +=10, y+=10) {
			g.drawLine(x, 100, 500, y);
			
			try {
				Thread.currentThread().sleep(200); 
			} catch (InterruptedException e) { 
				e.printStackTrace(); 
			}
			
		}
		
		g2.setColor(Color.BLUE);
		
		for (int x = 500, y = 300; y <= 500; x-=10, y+=10) {
			g.drawLine(500, y, x, 500);
			
			try {
				Thread.currentThread().sleep(200); 
			} catch (InterruptedException e) { 
				e.printStackTrace(); 
			}
		}
		
		
		g2.setColor(Color.MAGENTA); 
		
		for (int x = 300, y = 500; x >= 100; x-=10, y-=10) {
			g.drawLine(x,  500, 100, y);
			
			try {
				Thread.currentThread().sleep(200); 
			} catch (InterruptedException e) { 
				e.printStackTrace(); 
			}
		}
		
		g2.setColor(Color.GREEN); 
		
		for (int x = 100, y = 300; x<=300; x+=10, y-=10) {
			g.drawLine(100, y, x, 100);
			
			try {
				Thread.currentThread().sleep(200); 
			} catch (InterruptedException e) { 
				e.printStackTrace(); 
			}
		}
 		 
		
	}
	
	public static void main(String[] args) {
		LineArt2 application = new LineArt2(); 
		application.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
	}

}
