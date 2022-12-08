package Loops;

import javax.swing.*; 
import java.awt.*;


public class OpticalIllusion extends JFrame {

	public OpticalIllusion() {
		super("OpticalIllusion");
		this.setVisible(true); //in java.awt.window
		this.setSize(600, 600);
		this.repaint();//java.awt.Component
	}
	
	public void paint(Graphics g) {
		super.paint(g);
		Graphics2D g2 = (Graphics2D) g;
		
		g2.setStroke(new BasicStroke(1)); //changes the 
		g.setColor(Color.black);
		
		for (int x = 0; x <= 600; x += 30) { //change has to be same in order for it to be symmetric.
				
			for (int y = 0; y <= 600; y += 30) {
				g.fillRect(x, y, 20, 20);
				
				
				//this is how you do error handling. 
				//this is what we will do in animation
				try { //structure that is used to catch an exception before it happens
					//sleep puts your proccessor in a hypernating state for 100 milliseoconds
					Thread.currentThread().sleep(25); // intitaiting a try catch block //system relaxes and doesn't run anything for 100 ms. 
				} catch (InterruptedException e) { // catches an error (displays an error
					e.printStackTrace(); //this is where the exception is coming from 
				}
				
				
			}
		

			

			
		}
		
		
		
		
	}
	
	public static void main(String[] args) {
		OpticalIllusion application = new OpticalIllusion(); 
		application.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
	}
}
