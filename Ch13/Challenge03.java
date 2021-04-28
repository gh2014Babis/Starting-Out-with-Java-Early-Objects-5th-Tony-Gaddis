package challenges;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;

import javax.swing.JApplet;

@SuppressWarnings("serial")
public class Challenge03 extends JApplet {
	
	private int xEye1 = 50;
	private int yEye1 = 70;
	private int xEye2 = 110;
	private int yEye2 = 70;
	private int xPupil1 = 65;
	private int yPupil1 = 90;
	private int xPupil2 = 125;
	private int yPupil2 = 90;
	private int widthEye = 50;
	private int heightEye = 60;
	private int widthPupil = 20;
	private int heightPupil = 20;
	
	public void init() {
		getContentPane().setBackground(Color.WHITE);
		addMouseMotionListener(new MyMouseMotionListener());
	}
	
	public void paint(Graphics g) {
		super.paint(g);
		g.drawOval(xEye1, yEye1, widthEye, heightEye);
		g.drawOval(xEye2, yEye2, widthEye, heightEye);
		g.setColor(Color.BLACK);
		g.fillOval(xPupil1, yPupil1, widthPupil, heightPupil);
		g.setColor(Color.BLACK);
		g.fillOval(xPupil2, yPupil2, widthPupil, heightPupil);
	}
	
	private class MyMouseMotionListener implements MouseMotionListener {

		@Override
		public void mouseDragged(MouseEvent e) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void mouseMoved(MouseEvent e) {
			// TODO Auto-generated method stub
			if (e.getY() <= yEye1) {
				xPupil1 = 65;
				yPupil1 = 70;
				xPupil2 = 125;
				yPupil2 = 70;
			} else if (e.getX() < xEye1 && e.getY() > yEye1 && e.getY() < (yEye1 + heightEye)) {
				xPupil1 = 50;
				yPupil1 = 90;
				xPupil2 = 110;
				yPupil2 = 90;
			} else if (e.getY() >= (yEye1 + heightEye)) {
				xPupil1 = 65;
				yPupil1 = 110;
				xPupil2 = 125;
				yPupil2 = 110;
			} else if (e.getX() > (xEye2 + widthEye) && e.getY() > yEye2 && e.getY() < (yEye2 + heightEye)) {				
				xPupil1 = 80;
				yPupil1 = 90;
				xPupil2 = 140;
				yPupil2 = 90;
			}
			repaint();
		}
	}
}