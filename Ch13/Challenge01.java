package challenges;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;

import javax.swing.JApplet;

@SuppressWarnings("serial")
public class Challenge01 extends JApplet { 
	
	private int currentX = 60; 
	private int currentY = 100; 
	
	public void init() {
	    getContentPane().setBackground(Color.WHITE);
	    addMouseMotionListener(new MyMouseMotionListener());
	}
	
	public void paint(Graphics g) {
		super.paint(g);
		g.setColor(Color.BLACK);
	    g.setFont(new Font("SansSerif", Font.BOLD, 35));
	    g.drawString("Hello", currentX, currentY);
	}
	
	private class MyMouseMotionListener implements MouseMotionListener {
		
		public void mouseDragged(MouseEvent e) {
			
		}
		
		public void mouseMoved(MouseEvent e) {
			currentX = e.getX();
			currentY = e.getY();
			repaint();
		}
	}
}