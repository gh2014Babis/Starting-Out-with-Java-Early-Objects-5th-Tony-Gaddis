package challenges;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JApplet;

@SuppressWarnings("serial")
public class Challenge02 extends JApplet {
	
	private int[] xtriangle = {10, 80, 150};
	private int[] ytriangle = {60, 10, 60};
	private int xHouse = 20;
	private int yHouse = 60;
	private int widthHouse = 120;
	private int heightHouse = 60;
	private int xWindow1 = 30;
	private int yWindow1 = 75;
	private int xWindow2 = 100;
	private int yWindow2 = 75;
	private int widthWindow = 30;
	private int heightWindow = 30;
	private int xDoor = 65;
	private int yDoor = 75;
	private int widthDoor = 30;
	private int heightDoor = 45;
	
	private int x1Line1 = 30;
	private int y1Line1 = 90;
	private int x2Line1 = 60;
	private int y2Line1 = 90;
	
	private int x1Line2 = 45;
	private int y1Line2 = 75;
	private int x2Line2 = 45;
	private int y2Line2 = 105;
	
	private int x1Line3 = 100;
	private int y1Line3 = 90;
	private int x2Line3 = 130;
	private int y2Line3 = 90;
	
	private int x1Line4 = 115;
	private int y1Line4 = 75;
	private int x2Line4 = 115;
	private int y2Line4 = 105;
	
	private int xOval = 85;
	private int yOval = 100;
	private int widthOval = 7;
	private int heightOval = 7;
	
	private Color color1 = Color.BLACK;
	private Color color2 = Color.BLACK;
	private Color color3 = Color.BLACK;
	
	private boolean openWindow1 = true;
	private boolean openWindow2 = true;
	private boolean openDoor = true;
	
	public void init() {
	    getContentPane().setBackground(Color.WHITE);
	    addMouseListener(new MyMouseListener());
	}
	
	public void paint(Graphics g) {
		super.paint(g);
		g.drawPolygon(xtriangle, ytriangle, 3);
		g.drawRect(xHouse, yHouse, widthHouse, heightHouse);
		if (!openWindow1) {
			g.drawRect(xWindow1, yWindow1, widthWindow, heightWindow);
			g.drawLine(x1Line1, y1Line1, x2Line1, y2Line1);
			g.drawLine(x1Line2, y1Line2, x2Line2, y2Line2);
		} else {
			g.setColor(color1);
			g.fillRect(xWindow1, yWindow1, widthWindow, heightWindow);
		}
		
		if (!openWindow2) {
			g.drawRect(xWindow2, yWindow2, widthWindow, heightWindow);
			g.drawLine(x1Line3, y1Line3, x2Line3, y2Line3);
			g.drawLine(x1Line4, y1Line4, x2Line4, y2Line4);
		} else {
			g.setColor(color2);
			g.fillRect(xWindow2, yWindow2, widthWindow, heightWindow);
		}
		
		if (!openDoor) {
			g.drawRect(xDoor, yDoor, widthDoor, heightDoor);			
			g.setColor(Color.RED);
		    g.fillOval(xOval, yOval, widthOval, heightOval);
		} else {
			g.setColor(color3);
			g.fillRect(xDoor, yDoor, widthDoor, heightDoor);
		}		
	}
	
	private class MyMouseListener implements MouseListener {

		@Override
		public void mouseClicked(MouseEvent e) {
			// TODO Auto-generated method stub
			if (e.getX() >= 30 && e.getX() <= 60 && e.getY() >= 75 && e.getY() <= 105) {
				if (openWindow1) 
					openWindow1 = false;
				else
					openWindow1 = true;
				repaint();
			} else if (e.getX() >= 100 && e.getX() <= 130 && e.getY() >= 75 && e.getY() <= 105) {
				if (openWindow2) 
					openWindow2 = false;
				else
					openWindow2 = true;
				repaint();
			} else if (e.getX() >= 65 && e.getX() <= 95 && e.getY() >= 75 && e.getY() <= 120) {
				if (openDoor) 
					openDoor = false;
				else
					openDoor = true;
				repaint();
			}				
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