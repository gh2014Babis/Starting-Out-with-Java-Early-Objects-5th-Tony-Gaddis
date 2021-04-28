package challenges;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

@SuppressWarnings("serial")
public class Challenge09 extends JFrame {
	
	private JPanel dicePanel;
	private JPanel rollPanel;
	private JLabel die1Label;
	private JLabel die2Label;
	private JButton rollButton;
	
	public Challenge09() {
		super("Dice Simulator");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(500, 200);		
		//setLayout(new BorderLayout());
		
		dicePanel = new JPanel();
		
		die1Label = new JLabel();
		die1Label.setIcon(new ImageIcon("E:\\BABIS\\Programming\\Java\\Java Early Objects\\Ch12\\src\\challenges\\Dice\\1Die.jpg"));
		//System.out.println(dice1Label.getIcon());
		
		die2Label = new JLabel();
		die2Label.setIcon(new ImageIcon("E:\\BABIS\\Programming\\Java\\Java Early Objects\\Ch12\\src\\challenges\\Dice\\Die1.jpg"));
		//System.out.println(dice2Label.getIcon());
		
		dicePanel.add(die1Label);
		dicePanel.add(die2Label);
		
		rollPanel = new JPanel();
		rollButton = new JButton("Roll the Dice");
		rollButton.addActionListener(new ButtonListener());
		rollPanel.add(rollButton);
		
		add(dicePanel
				, BorderLayout.CENTER);
		add(rollPanel, BorderLayout.SOUTH);
		pack();
		setVisible(true);
	}
	
	private class ButtonListener implements ActionListener {
		
		public void actionPerformed(ActionEvent e) {
			Random r = new Random();
			int num1 = r.nextInt(6) + 1;
			int num2 = r.nextInt(6) + 1;
			System.out.println(num1 + " " + num2);
			ImageIcon icon1 = new ImageIcon("E:\\BABIS\\Programming\\Java\\Java Early Objects\\Ch12\\src\\challenges\\Dice\\" + num1 + "Die.jpg");
			die1Label.setIcon(icon1);
			ImageIcon icon2 = new ImageIcon("E:\\BABIS\\Programming\\Java\\Java Early Objects\\Ch12\\src\\challenges\\Dice\\Die" + num2 + ".jpg");
			die2Label.setIcon(icon2);
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Challenge09();
	}
}
