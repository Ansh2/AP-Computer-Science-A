package Loops;

import javax.swing.*;
import java.awt.*;

public class Sonar extends JFrame {

	public Sonar() {
		super("Sonar");
		this.setVisible(true);
		this.setSize(600, 600);
		this.repaint();
	}

	public void paint(Graphics g) {
		super.paint(g);
		Graphics2D g2 = (Graphics2D) g;
		g2.setStroke(new BasicStroke(1));
		int size = 10;
		g2.setColor(Color.RED);

		for (int i = 290; i >= 0; i -= 10) {
			g2.drawOval(i, i, size, size);
			try {
				Thread.currentThread().sleep(200);
			} catch (InterruptedException e) {
				e.printStackTrace();

			}
			size += 20;

		}
		size -= 20;

		g2.setColor(Color.WHITE);

		for (int i = 0; i <= 290; i += 10) {

			g2.drawOval(i, i, size, size);
			try {
				Thread.currentThread().sleep(200);
			} catch (InterruptedException e) {
				e.printStackTrace();

			}
			size -= 20;

		}

	}

	public static void main(String[] args) {
		Sonar application = new Sonar();
		application.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

}
