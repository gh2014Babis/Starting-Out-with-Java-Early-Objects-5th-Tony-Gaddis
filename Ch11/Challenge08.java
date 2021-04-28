package challenges;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

@SuppressWarnings("serial")
public class Challenge08 extends JFrame {
	
	private final int WINDOW_WIDTH = 350;
	private final int WINDOW_HEIGHT = 350;
	private JPanel panel;
	private JLabel latin;
	private JLabel english;
	private JButton latinWord1;	
	private JButton latinWord2;	
	private JButton latinWord3;	
	private JLabel engWord1;
	private JLabel engWord2;
	private JLabel engWord3;
	
	public Challenge08() {
		super("Latin Translator");
		setSize(WINDOW_WIDTH, WINDOW_HEIGHT);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);	
		panel = new JPanel();
		panel.setLayout(new GridLayout(4, 1));
		latin = new JLabel("Latin");
		english = new JLabel("English");
		latinWord1 = new JButton("sinister");
		latinWord2 = new JButton("dexter");
		latinWord3 = new JButton("medium");
		engWord1 = new JLabel();
		engWord2 = new JLabel();
		engWord3 = new JLabel();
		latinWord1.addActionListener(new ButtonListener());
		latinWord2.addActionListener(new ButtonListener());
		latinWord3.addActionListener(new ButtonListener());
		panel.add(latin);
		panel.add(english);
		panel.add(latinWord1);
		panel.add(engWord1);
		panel.add(latinWord2);
		panel.add(engWord2);
		panel.add(latinWord3);
		panel.add(engWord3);
		add(panel);
		setVisible(true);
	}
	
	private class ButtonListener implements ActionListener {
		
		public void actionPerformed(ActionEvent e) {
			if (e.getSource() == latinWord1) {
				engWord1.setText("left");
				engWord2.setText("");
				engWord3.setText("");
			} else if (e.getSource() == latinWord2) {
				engWord1.setText("");
				engWord2.setText("right");
				engWord3.setText("");
			} else {
				engWord1.setText("");
				engWord2.setText("");
				engWord3.setText("center");
			}
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Challenge08();
	}

}
