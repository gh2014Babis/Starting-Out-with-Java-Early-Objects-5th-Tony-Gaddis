package challenges;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Graphics;

import javax.swing.JPanel;

@SuppressWarnings("serial")
public class WatchPanel extends JPanel {
	
	private int seconds;
	
	public WatchPanel(int seconds) {
		this.seconds = seconds;
		setBackground(Color.WHITE);
		setPreferredSize(new Dimension(300, 200));
	}
	
	public void setSeconds(int seconds) {
		this.seconds = seconds;
	}
	
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		g.setColor(Color.BLACK);
		g.setFont(new Font("SansSerif", Font.BOLD, 35));
		g.drawString(String.valueOf(seconds), 120, 95);
	}
}