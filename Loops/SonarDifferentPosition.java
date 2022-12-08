package Loops;

import javax.swing.*;
import java.awt.*;
import java.util.Random;

public class SonarDifferentPosition extends JFrame {

	public SonarDifferentPosition() {
		super("SonarDifferentPosition");
		this.setVisible(true);
		this.setSize(600, 600);
		this.repaint();
	}

	public void paint(Graphics g) {
		super.paint(g);
		Graphics2D g2 = (Graphics2D) g;
		g2.setStroke(new BasicStroke(1));
		Random rand = new Random();

		while (true) {

			int xpos = rand.nextInt(600);
			int ypos = rand.nextInt(600); 

			g2.setColor(Color.RED);
				
				
				for (int size = 0; size <= 400; size += 20) {
					g2.drawOval(xpos - size/2, ypos - size/2, size, size);

					try {
						Thread.currentThread().sleep(50);
					} catch (InterruptedException e) {
						e.printStackTrace();

					}
				
				}

				g2.setColor(Color.WHITE);

				
				for (int size = 400; size >=0; size -= 20) {
					
					g2.drawOval(xpos - size/2, ypos - size/2, size, size);
					try {
						Thread.currentThread().sleep(50);
					} catch (InterruptedException e) {
						e.printStackTrace();

					}
				
			}
	

		}

	}

	public static void main(String[] args) {
		SonarDifferentPosition application = new SonarDifferentPosition();
		application.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

}
