package challenges;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JApplet;

@SuppressWarnings("serial")
public class Challenge06 extends JApplet {
	
	private boolean[][] haveCircle = {{false, false, false, false}, {false, false, false, false}, {false, false, false, false}, {false, false, false, false}};
	private boolean clicked = false;
	
	public void init() {
		getContentPane().setBackground(Color.WHITE);
		addMouseListener(new MyMouseListener());
	}
	
	public void paint(Graphics g) {
		super.paint(g);
	    g.drawLine(10, 10, 170, 10);
	    g.drawLine(10, 50, 170, 50);
	    g.drawLine(10, 90, 170, 90);
	    g.drawLine(10, 130, 170, 130);
	    g.drawLine(10, 170, 170, 170);
	    
	    g.drawLine(10, 10, 10, 170);
	    g.drawLine(50, 10, 50, 170);
	    g.drawLine(90, 10, 90, 170);
	    g.drawLine(130, 10, 130, 170);
	    g.drawLine(170, 10, 170, 170);
	   
	    
	    for (int i = 0; i < haveCircle.length; i++) {
	    	for (int j = 0; j < haveCircle[i].length; j++) {
	    		if (clicked) {
	    			if (i == 0 && j == 0) {
			    		if (haveCircle[i][j]) {
			    			g.drawOval(10, 10, 40, 40);
			    		} 
	    			} else if (i == 0 && j == 1) {
			    		if (haveCircle[i][j]) {
			    			g.drawOval(50, 10, 40, 40);
			    		} 
	    			} else if (i == 0 && j == 2) {
			    		if (haveCircle[i][j]) {
			    			g.drawOval(90, 10, 40, 40);
			    		} 
	    			} else if (i == 0 && j == 3) {
			    		if (haveCircle[i][j]) {
			    			g.drawOval(130, 10, 40, 40);
			    		} 
	    			} else if (i == 1 && j == 0) {
			    		if (haveCircle[i][j]) {
			    			g.drawOval(10, 50, 40, 40);
			    		}
	    			} else if (i == 1 && j == 1) {
			    		if (haveCircle[i][j]) {
			    			g.drawOval(50, 50, 40, 40);
			    		} 
	    			} else if (i == 1 && j == 2) {
			    		if (haveCircle[i][j]) {
			    			g.drawOval(90, 50, 40, 40);
			    		} 
	    			} else if (i == 1 && j == 3) {
			    		if (haveCircle[i][j]) {
			    			g.drawOval(130, 50, 40, 40);
			    		}
	    			} else if (i == 2 && j == 0) {
			    		if (haveCircle[i][j]) {
			    			g.drawOval(10, 90, 40, 40);
			    		} 
	    			} else if (i == 2 && j == 1) {
			    		if (haveCircle[i][j]) {
			    			g.drawOval(50, 90, 40, 40);
			    		} 
	    			} else if (i == 2 && j == 2) {
			    		if (haveCircle[i][j]) {
			    			g.drawOval(90, 90, 40, 40);
			    		} 
	    			} else if (i == 2 && j == 3) {
			    		if (haveCircle[i][j]) {
			    			g.drawOval(130, 90, 40, 40);
			    		} 
	    			} else if (i == 3 && j == 0) {
			    		if (haveCircle[i][j]) {
			    			g.drawOval(10, 130, 40, 40);
			    		} 
	    			} else if (i == 3 && j == 1) {
			    		if (haveCircle[i][j]) {
			    			g.drawOval(50, 130, 40, 40);
			    		} 
	    			} else if (i == 3 && j == 2) {
			    		if (haveCircle[i][j]) {
			    			g.drawOval(90, 130, 40, 40);
			    		} 
	    			} else if (i == 3 && j == 3) {
			    		if (haveCircle[i][j]) {
			    			g.drawOval(130, 130, 40, 40);
			    		} 
	    			} 
	    		}
	    	}
	    }
	}
	
	private class MyMouseListener implements MouseListener {

		@Override
		public void mouseClicked(MouseEvent e) {
			// TODO Auto-generated method stub
			clicked = true;
			if (e.getX() > 10 && e.getX() < 50 && e.getY() > 10 && e.getY() < 50) {
				if (!haveCircle[0][0])
					haveCircle[0][0] = true;
				else
					haveCircle[0][0] = false;
			} else if (e.getX() > 50 && e.getX() < 90 && e.getY() > 10 && e.getY() < 50) {
				if (!haveCircle[0][1])
					haveCircle[0][1] = true;
				else
					haveCircle[0][1] = false;
			} else if (e.getX() > 90 && e.getX() < 130 && e.getY() > 10 && e.getY() < 50) {
				if (!haveCircle[0][2])
					haveCircle[0][2] = true;
				else
					haveCircle[0][2] = false;
			} else if (e.getX() > 130 && e.getX() < 170 && e.getY() > 10 && e.getY() < 50) {
				if (!haveCircle[0][3])
					haveCircle[0][3] = true;
				else
					haveCircle[0][3] = false;
			} else if (e.getX() > 10 && e.getX() < 50 && e.getY() > 50 && e.getY() < 90) {
				if (!haveCircle[1][0])
					haveCircle[1][0] = true;
				else
					haveCircle[1][0] = false;
			} else if (e.getX() > 50 && e.getX() < 90 && e.getY() > 50 && e.getY() < 90) {
				if (!haveCircle[1][1])
					haveCircle[1][1] = true;
				else
					haveCircle[1][1] = false;
			} else if (e.getX() > 90 && e.getX() < 130 && e.getY() > 50 && e.getY() < 90) {
				if (!haveCircle[1][2])
					haveCircle[1][2] = true;
				else
					haveCircle[1][2] = false;
			} else if (e.getX() > 130 && e.getX() < 170 && e.getY() > 50 && e.getY() < 90) {
				if (!haveCircle[1][3])
					haveCircle[1][3] = true;
				else
					haveCircle[1][3] = false;
			} else if (e.getX() > 10 && e.getX() < 50 && e.getY() > 90 && e.getY() < 130) {
				if (!haveCircle[2][0])
					haveCircle[2][0] = true;
				else
					haveCircle[2][0] = false;
			} else if (e.getX() > 50 && e.getX() < 90 && e.getY() > 90 && e.getY() < 130) {
				if (!haveCircle[2][1])
					haveCircle[2][1] = true;
				else
					haveCircle[2][1] = false;
			} else if (e.getX() > 90 && e.getX() < 130 && e.getY() > 90 && e.getY() < 130) {
				if (!haveCircle[2][2])
					haveCircle[2][2] = true;
				else
					haveCircle[2][2] = false;
			} else if (e.getX() > 130 && e.getX() < 170 && e.getY() > 90 && e.getY() < 130) {
				if (!haveCircle[2][3])
					haveCircle[2][3] = true;
				else
					haveCircle[2][3] = false;
			} else if (e.getX() > 10 && e.getX() < 50 && e.getY() > 130 && e.getY() < 170) {
				if (!haveCircle[3][0])
					haveCircle[3][0] = true;
				else
					haveCircle[3][0] = false;
			} else if (e.getX() > 50 && e.getX() < 90 && e.getY() > 130 && e.getY() < 170) {
				if (!haveCircle[3][1])
					haveCircle[3][1] = true;
				else
					haveCircle[3][1] = false;
			} else if (e.getX() > 90 && e.getX() < 130 && e.getY() > 130 && e.getY() < 170) {
				if (!haveCircle[3][2])
					haveCircle[3][2] = true;
				else
					haveCircle[3][2] = false;
			} else if (e.getX() > 130 && e.getX() < 170 && e.getY() > 130 && e.getY() < 170) {
				if (!haveCircle[3][3])
					haveCircle[3][3] = true;
				else
					haveCircle[3][3] = false;
			} 
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
