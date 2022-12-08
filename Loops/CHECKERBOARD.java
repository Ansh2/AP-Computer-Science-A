package Loops;

import java.awt.*; 
import javax.swing.*;

public class CHECKERBOARD extends JFrame {  //Done

	public CHECKERBOARD() {
		super("CHECKERBOARD");
		this.setVisible(true); 
		this.setSize(560, 560);
		this.repaint();
	}
	
	public void paint(Graphics g) {
		super.paint(g);
		Graphics2D g2 = (Graphics2D) g;
		g2.setStroke(new BasicStroke(1));
		
		int counter = 1; 
		for (int x = 55; x <= 495; x+=50) {
			for (int y = 55; y<=495; y+=50) {
				if (counter % 2 == 1) {
					g2.setColor(Color.BLACK);
				} else {
					g2.setColor(Color.RED);
				} 
				g2.fillRect(x, y, 50, 50); 
				try {
					Thread.currentThread().sleep(200); 
				} catch (InterruptedException e) { 
					e.printStackTrace(); 
				
				}
				counter++; 
				
				}
				
			}
		}
		

	
	
	
	public static void main(String[] args) {
		CHECKERBOARD application = new CHECKERBOARD(); 
		application.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
	}

}
