package Loops;

import java.awt.*; 
import javax.swing.*;


public class LineArt1 extends JFrame {

	public LineArt1() {
		super("LineArt1");
		this.setVisible(true); 
		this.setSize(600, 600);
		this.repaint();
	}
	
	public void paint(Graphics g) {
		super.paint(g);
		Graphics2D g2 = (Graphics2D) g;
		g2.setStroke(new BasicStroke(1));
		g.setColor(Color.RED);
		
		
		for (int x = 300, y = 0; x < 550; x += 50, y += 50) {
			g.drawLine(300, y + 50, x + 50, 300);

			try {
				Thread.currentThread().sleep(400); 
			} catch (InterruptedException e) { 
				e.printStackTrace(); 
			}
			
		}
		
		g.setColor(Color.BLUE);
		
		for (int x = 600,  y = 300;  y < 550; x -= 50,  y += 50) {
			 
			
			g.drawLine(x - 50, 300, 300, y + 50);
			
			try {
				Thread.currentThread().sleep(400); 
			} catch (InterruptedException e) { 
				e.printStackTrace(); 
			}
			
		}
		
		g.setColor(Color.MAGENTA);
	
	
		
		for (int x = 250, y = 550; x > 0 ; y -= 50, x -= 50) {
			
			
			g.drawLine(300, y, x, 300);
			
			try {
				Thread.currentThread().sleep(400); 
			} catch (InterruptedException e) { 
				e.printStackTrace(); 
			}
			
		}
		
		g.setColor(Color.GREEN);
		
		for (int i = 50, j = 250; i<300; i += 50, j -= 50) { 
			 
			g.drawLine(300, i, j, 300);
			
			try {
				Thread.currentThread().sleep(400); 
			} catch (InterruptedException e) { 
				e.printStackTrace(); 
			}
			
		}
		
	}
	
	
	
	public static void main(String[] args) {
		
		LineArt1 application = new LineArt1(); 
		application.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
		
	}

}
