package Loops;

import javax.swing.*;
import java.awt.*;
import java.awt.geom.Point2D;
import java.util.Random;

public class Pipes extends JFrame {

	public Pipes() {
		super("Pipes");
		this.setVisible(true);
		this.setSize(600, 600);
		this.repaint();
	}

	public void paint(Graphics g) {
		super.paint(g);
		Graphics2D g2 = (Graphics2D) g;
		g2.setStroke(new BasicStroke(4));
		g2.fillRect(0, 0, 600, 600);

		Random rand = new Random(600);

		int ax = 0;
		int ay = 0;
		int bx = rand.nextInt(600);
		int by = rand.nextInt(600);

		Point2D.Double a = new Point2D.Double((double) ax, (double) ay);
		Point2D.Double b = new Point2D.Double((double) bx, (double) by);

		g.setColor(Color.WHITE);
		a.setLocation(0, 0);

		for (int i = 1; i <= 20; i++) {

			b.setLocation(bx, by);

			g.drawLine((int) a.getX(), (int) a.getY(), (int) b.getX(), (int) b.getY());
			try {
				Thread.currentThread().sleep(200);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}

			a.setLocation(bx, by);

			bx = rand.nextInt(600);
			by = rand.nextInt(600);

		}
		g.setColor(Color.BLACK);

		Random gen = new Random(600);
		a.setLocation(0, 0);

		bx = gen.nextInt(600);
		by = gen.nextInt(600);

		for (int i = 1; i <= 20; i++) {

			b.setLocation(bx, by);

			g.drawLine((int) a.getX(), (int) a.getY(), (int) b.getX(), (int) b.getY());
			try {
				Thread.currentThread().sleep(200);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}

			a.setLocation(bx, by);

			bx = gen.nextInt(600);
			by = gen.nextInt(600);

		}

	}

	public static void main(String[] args) {
		Pipes application = new Pipes();
		application.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

}
