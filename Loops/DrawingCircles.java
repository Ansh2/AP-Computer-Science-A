package Loops;

import javax.swing.*;
import java.awt.*;

public class DrawingCircles extends JFrame {
	
	

	public DrawingCircles() {
		super("Drawing Circles");
		this.setVisible(true); //in java.awt.window
		this.setSize(800, 800);
		this.repaint();//java.awt.Component
	}
	
	public void paint(Graphics g) {
		super.paint(g);
		Graphics2D g2 = (Graphics2D) g; //this is allowed because Graphics2D is the superclass of Graphics
		//We have only done objec t manipulation
		//We should be able to work with a lot of methods. 
		//Need to understand everything in order to get a job
		//If you understand this that are interviewing as they will ask you about supeclass, subclass, and other basic things
		//We will talk about this in March and April and years ahead in this when we work with lists
		g2.setStroke(new BasicStroke(1)); //changes the 
		g.setColor(Color.blue);
//	    g.fillOval(250, 250, 100, 100); //go to JFrame and find filloval but it is in the paint class not the JFrame when searching in the API 
	    //         int x, int y, int width, int height
	    // In order to position in the center you do the whole window minus half of the width of the circle (polygon)
	    //In fillOVal, their are only positive coordinates NO NEGATIVES
//		g.drawOval(250, 250, 100, 100); 
		for (int i = 0; i <= 400; i += 40) {
			
			if (i % 80 == 0) {
				g.setColor(Color.red);
			} else {
				g.setColor(Color.blue);
			}
			g.drawOval(100 + i, 100 + i, 200 - i / 2, 200 - i / 2);

			//this is how you do error handling. 
			//this is what we will do in animation
			try { //structure that is used to catch an exception before it happens
				//sleep puts your proccessor in a hypernating state for 100 milliseoconds
				Thread.currentThread().sleep(100); // intitaiting a try catch block
			} catch (InterruptedException e) { // catches an error (displays an error
				e.printStackTrace();
			}
		}
	}

	public static void main(String[] args) {
		DrawingCircles application = new DrawingCircles(); 
		application.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
	}
	
	

}
