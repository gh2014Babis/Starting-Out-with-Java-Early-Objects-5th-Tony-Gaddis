package challenges;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JApplet;

@SuppressWarnings("serial")
public class Challenge05 extends JApplet {
	
	private int pointNum;
	private int[] pointsX;
	private int[] pointsY;
	
	public void init() {
	    pointNum = 0;
	    pointsX = new int[6];
	    pointsY = new int[6];
	    getContentPane().setBackground(Color.WHITE);
	    addMouseListener(new MyMouseListener());
	}
	
	public void paint(Graphics g) {
		super.paint(g);
		g.drawPolygon(pointsX, pointsY, pointNum);
		pointNum = 0;
	    pointsX = new int[6];
	    pointsY = new int[6];
	}
	
	private class MyMouseListener implements MouseListener {

		@Override
		public void mouseClicked(MouseEvent e) {
			// TODO Auto-generated method stub
			pointNum++;
			if (pointNum <= 6) {				
				System.out.println(pointNum);				
				pointsX[pointNum - 1] = e.getX();
				pointsY[pointNum - 1] = e.getY();
			}  
			if (pointNum == 6)
				repaint();
		}

		@Override
		public void mousePressed(MouseEvent e) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void mouseReleased(MouseEvent e) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void mouseEntered(MouseEvent e) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void mouseExited(MouseEvent e) {
			// TODO Auto-generated method stub
			
		}
	}
}
