package challenges;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JApplet;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.Timer;

@SuppressWarnings("serial")
public class Challenge08 extends JApplet {
	
	private final int TIME_DELAY = 1000;
	private int seconds = 0; 
	private Timer timer;
	private JButton startButton;
	private JButton stopButton;
	private JPanel buttonsPanel;
	private WatchPanel watchPanel;
	
	public void init() {
		setLayout(new BorderLayout());
		
		timer = new Timer(TIME_DELAY, new TimerListener());
		
		watchPanel = new WatchPanel(seconds);
		
		buttonsPanel = new JPanel();
		startButton = new JButton("Start");
		stopButton = new JButton("Stop");
		startButton.addActionListener(new ButtonListener());
		stopButton.addActionListener(new ButtonListener());
		buttonsPanel.add(startButton);
		buttonsPanel.add(stopButton);
		
		add(watchPanel, BorderLayout.CENTER);
		add(buttonsPanel, BorderLayout.SOUTH);
		setVisible(true);
	}
	
	private class ButtonListener implements ActionListener {		
		public void actionPerformed(ActionEvent e) {
			if (e.getSource() == startButton) {
				System.out.println("Start timer...");
				timer.start();
			} else {
				System.out.println("Stop timer...");
				timer.stop();
			}
		}
	}
	
	//Με την χρονοκαθυστέρηση του timer μεταβάλλω κατά 1 τα seconds.
	//Θα μπορούσε να γίνει και με ένα απλό JLabel object.
	private class TimerListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			seconds++;
			System.out.println(seconds);
			watchPanel.setSeconds(seconds);
			watchPanel.repaint();
		}
	}
}
