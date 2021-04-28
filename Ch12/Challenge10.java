package challenges;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

@SuppressWarnings("serial")
public class Challenge10 extends JFrame {
	
	private JPanel deckPanel;
	private JPanel dealPanel;
	private JLabel deck1Label;
	private JLabel deck2Label;
	private JButton dealButton;
	private String[] cards = {"Ace_Clubs.jpg", "2_Clubs.jpg", "3_Clubs.jpg", "4_Clubs.jpg", "5_Clubs.jpg", "6_Clubs.jpg", "7_Clubs.jpg", "8_Clubs.jpg", "9_Clubs.jpg", "10_Clubs.jpg", "Jack_Clubs.jpg", "Queen_Clubs.jpg", "King_Clubs.jpg",
							  "Ace_Spades.jpg", "2_Spades.jpg", "3_Spades.jpg", "4_Spades.jpg", "5_Spades.jpg", "6_Spades.jpg", "7_Spades.jpg", "8_Spades.jpg", "9_Spades.jpg", "10_Spades.jpg", "Jack_Spades.jpg", "Queen_Spades.jpg", "King_Spades.jpg",
							  "Ace_Diamonds.jpg", "2_Diamonds.jpg", "3_Diamonds.jpg", "4_Diamonds.jpg", "5_Diamonds.jpg", "6_Diamonds.jpg", "7_Diamonds.jpg", "8_Diamonds.jpg", "9_Diamonds.jpg", "10_Diamonds.jpg", "Jack_Diamonds.jpg", "Queen_Diamonds.jpg", "King_Spades.jpg",
							  "Ace_Hearts.jpg", "2_Hearts.jpg", "3_Hearts.jpg", "4_Hearts.jpg", "5_Hearts.jpg", "6_Hearts.jpg", "7_Hearts.jpg", "8_Hearts.jpg", "9_Hearts.jpg", "10_Hearts.jpg", "Jack_Hearts.jpg", "Queen_Hearts.jpg", "King_Hearts.jpg",
							  "Joker_Black.jpg", "Joker_Red.jpg"};
	private ArrayList<String> deck1 = new ArrayList<String>(Arrays.asList(cards));
	private ArrayList<String> deck2 = new ArrayList<String>();
	private int count = 0;
	
	public Challenge10() {
		super("Card Dealer");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(800, 200);		
		//setLayout(new BorderLayout());
		
		deckPanel = new JPanel();
		
		deck1Label = new JLabel();
		deck1Label.setIcon(new ImageIcon("E:\\BABIS\\Programming\\Java\\Java Early Objects\\Ch12\\src\\challenges\\Cards\\Backface_Blue.jpg"));
				
		deck2Label = new JLabel();
				
		deckPanel.add(deck1Label);
		deckPanel.add(deck2Label);
		
		dealPanel = new JPanel();
		dealButton = new JButton("Deal a Card");
		dealButton.addActionListener(new ButtonListener());
		dealPanel.add(dealButton);
		
		add(deckPanel, BorderLayout.CENTER);
		add(dealPanel, BorderLayout.SOUTH);
		pack();
		setVisible(true);
	}
	
	private class ButtonListener implements ActionListener {
		
		public void actionPerformed(ActionEvent e) {
			if (count == 54)
				JOptionPane.showMessageDialog(null, "The deck1 is empty");
			else {
				Random r = new Random();
				int num = r.nextInt(deck1.size());
				String imageName = deck1.get(num);
				deck1.remove(num);
				count++;
				System.out.println("Count: " + count + " Num: " + num + "Card: " + imageName);
				if (count != 54) {
					if (count % 2 != 0)
						deck1Label.setIcon(new ImageIcon("E:\\BABIS\\Programming\\Java\\Java Early Objects\\Ch12\\src\\challenges\\Cards\\Backface_Red.jpg"));
					else
						deck1Label.setIcon(new ImageIcon("E:\\BABIS\\Programming\\Java\\Java Early Objects\\Ch12\\src\\challenges\\Cards\\Backface_Blue.jpg"));
				} else {
					deck1Label.setIcon(null);
				}
				ImageIcon icon = new ImageIcon("E:\\BABIS\\Programming\\Java\\Java Early Objects\\Ch12\\src\\challenges\\Cards\\" + imageName);
				deck2Label.setIcon(icon);
				deck2.add(cards[num]);
			}
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Challenge10();
	}
}
