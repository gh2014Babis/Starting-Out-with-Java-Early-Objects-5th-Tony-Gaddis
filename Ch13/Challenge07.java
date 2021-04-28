package challenges;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JApplet;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

@SuppressWarnings("serial")
public class Challenge07 extends JApplet {
	
	private int colaNum = 20;
	private int lemonLimeSodaNum = 20;
	private int grapeSodaNum = 20;
	private int rootBeerNum = 20;
	private int bottledWaterNum = 20; 
	
	private JPanel buttonsPanel;
	private JButton colaButton;
	private JButton lemonLimeSodaButton;
	private JButton grapeSodaButton;
	private JButton rootBeerButton;
	private JButton bottledWaterButton;
	private JPanel fieldsPanel;
	private JLabel moneyLabel;
	private JTextField moneyTextField;
	private JLabel changeLabel;
	private JTextField changeTextField;
	
	public void init() {
		setLayout(new BorderLayout());
		buttonsPanel = new JPanel();
		buttonsPanel.setLayout(new GridLayout(5, 1));
		
		colaButton = new JButton("cola");
		lemonLimeSodaButton = new JButton("lemon-lime soda");
		grapeSodaButton = new JButton("grape soda");
		rootBeerButton = new JButton("root beer");
		bottledWaterButton = new JButton("bottled water");
		
		colaButton.addActionListener(new ButtonListener());
		lemonLimeSodaButton.addActionListener(new ButtonListener());
		grapeSodaButton.addActionListener(new ButtonListener());
		rootBeerButton.addActionListener(new ButtonListener());
		bottledWaterButton.addActionListener(new ButtonListener());
		
		buttonsPanel.add(colaButton);
		buttonsPanel.add(lemonLimeSodaButton);
		buttonsPanel.add(grapeSodaButton);
		buttonsPanel.add(rootBeerButton);
		buttonsPanel.add(bottledWaterButton);
		
		fieldsPanel = new JPanel();
		fieldsPanel.setLayout(new GridLayout(2, 1));
		JPanel moneyPanel = new JPanel();
		moneyLabel = new JLabel("Enter the amount of money: ");
		moneyTextField = new JTextField(5);
		moneyPanel.add(moneyLabel);
		moneyPanel.add(moneyTextField);
		JPanel changePanel = new JPanel();
		changeLabel = new JLabel("The amount of change: ");
		changeTextField = new JTextField(5);
		changeTextField.setEditable(false);
		changePanel.add(changeLabel);
		changePanel.add(changeTextField);
		fieldsPanel.add(moneyPanel);
		fieldsPanel.add(changePanel);
		
		add(buttonsPanel, BorderLayout.CENTER);
		add(fieldsPanel, BorderLayout.SOUTH);
		setVisible(true);
	}
	
	private class ButtonListener implements ActionListener {
		
		public void actionPerformed(ActionEvent e) {
			if (moneyTextField.getText().isEmpty()) {
				JOptionPane.showMessageDialog(null, "The money text field is empty");
			} else {
				try {
					double money = Double.parseDouble(moneyTextField.getText());
					double change = 0;
					if (e.getSource() == colaButton) {
						if (colaNum == 0)
							JOptionPane.showMessageDialog(null, "The cola drink is out of stock");
						else {
							if (money < 0.75)
								JOptionPane.showMessageDialog(null, "Not enough money");
							else {
								colaNum--;
								change = money - 0.75;
							}
						}
					} else if (e.getSource() == lemonLimeSodaButton) {
						if (lemonLimeSodaNum == 0)
							JOptionPane.showMessageDialog(null, "The lemon lime soda drink is out of stock");
						else {
							if (money < 0.75)
								JOptionPane.showMessageDialog(null, "Not enough money");
							else {
								lemonLimeSodaNum--;
								change = money - 0.75;
							}
						}
					} else if (e.getSource() == grapeSodaButton) {
						if (grapeSodaNum == 0)
							JOptionPane.showMessageDialog(null, "The grape soda drink is out of stock");
						else {
							if (money < 0.75)
								JOptionPane.showMessageDialog(null, "Not enough money");
							else {
								grapeSodaNum--;
								change = money - 0.75;
							}
						}
					} else if (e.getSource() == rootBeerButton) {
						if (rootBeerNum == 0)
							JOptionPane.showMessageDialog(null, "The root beer is out of stock");
						else {
							if (money < 0.75)
								JOptionPane.showMessageDialog(null, "Not enough money");
							else {
								rootBeerNum--;
								change = money - 0.75;
							}
						} 
					} else {
						if (bottledWaterNum == 0)
							JOptionPane.showMessageDialog(null, "The bottled water is out of stock");
						else {
							if (money < 0.75)
								JOptionPane.showMessageDialog(null, "Not enough money");
							else {
								bottledWaterNum--;
								change = money - 0.75;
							}
						} 
					}
					changeTextField.setText(String.valueOf(change));
				} catch (Exception ex) {
					JOptionPane.showMessageDialog(null, "Invalid value of money");
					moneyTextField.setText("");
				}
			}			
		}
	}
}