package challenges;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.InputMismatchException;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

@SuppressWarnings("serial")
public class Challenge07 extends JFrame {
	
	private final double BASE_FEE = 50.00;
	private JPanel numberPanel;
	private JPanel stylePanel;
	private JPanel sizePanel;
	private JPanel colorPanel;
	private JPanel calcPanel;
	private JLabel numberLabel;
	private JTextField numberText;
	private JLabel styleLabel;
	@SuppressWarnings("rawtypes")
	private JComboBox styleCombo;
	private JLabel sizeLabel;
	@SuppressWarnings("rawtypes")
	private JComboBox sizeCombo;
	private JLabel colorLabel;
	@SuppressWarnings("rawtypes")
	private JComboBox colorCombo;
	private JButton calcButton;
	private JLabel msgLabel;
	private String[] styles = {"Regular", "Folding", "Roman"};
	private double[] stylesCost = {0, 10, 15};
	private String[] sizes = {"25", "27", "32", "40"};
	private double[] sizesCost = {0, 2, 4, 6};
	private String[] colors = {"Natural", "Blue", "Teal", "Red", "Green"};
	private double[] colorsCost = {5, 0, 0, 0, 0};
	
	public Challenge07() {
		super("Shade Designer");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(500, 500);
		setLayout(new BorderLayout());
		
		buildNumberPanel();
		buildStylePanel();
		buildSizePanel();
		buildColorPanel();
		buildCalcPanel();
		
		add(numberPanel, BorderLayout.NORTH);
		add(stylePanel, BorderLayout.WEST);
		add(sizePanel, BorderLayout.CENTER);
		add(colorPanel, BorderLayout.EAST);
		add(calcPanel, BorderLayout.SOUTH);
		
		pack();
		setVisible(true);
	}
	
	private void buildNumberPanel() {
		numberPanel = new JPanel();
		numberPanel.setLayout(new FlowLayout());
		
		JPanel p1 = new JPanel();
		numberLabel = new JLabel("Give the number of shades:");
		numberText = new JTextField(10);
		p1.add(numberLabel);
		p1.add(numberText);
		
		numberPanel.add(p1);
	}
	
	@SuppressWarnings({ "rawtypes", "unchecked" })
	private void buildStylePanel() {
		stylePanel = new JPanel();
		stylePanel.setLayout(new BorderLayout());
		
		JPanel p21 = new JPanel();
		JPanel p22 = new JPanel();
		styleLabel = new JLabel("Styles");
		styleCombo = new JComboBox(styles);
		p21.add(styleLabel);
		p22.add(styleCombo);
		
		stylePanel.add(p21, BorderLayout.NORTH);
		stylePanel.add(p22, BorderLayout.CENTER);
	}
	
	@SuppressWarnings({ "rawtypes", "unchecked" })
	private void buildSizePanel() {
		sizePanel = new JPanel();
		sizePanel.setLayout(new BorderLayout());
		
		JPanel p31 = new JPanel();
		JPanel p32 = new JPanel();
		sizeLabel = new JLabel("Sizes");
		sizeCombo = new JComboBox(sizes);
		p31.add(sizeLabel);
		p32.add(sizeCombo);
		
		sizePanel.add(p31, BorderLayout.NORTH);
		sizePanel.add(p32, BorderLayout.CENTER);
	}
	
	@SuppressWarnings({ "rawtypes", "unchecked" })
	private void buildColorPanel() {
		colorPanel = new JPanel();
		colorPanel.setLayout(new BorderLayout());
		
		JPanel p41 = new JPanel();
		JPanel p42 = new JPanel();
		colorLabel = new JLabel("Colors");
		colorCombo = new JComboBox(colors);
		p41.add(colorLabel);
		p42.add(colorCombo);
		
		colorPanel.add(p41, BorderLayout.NORTH);
		colorPanel.add(p42, BorderLayout.CENTER);
	}
	
	private void buildCalcPanel() {
		calcPanel = new JPanel();
		
		JPanel p51 = new JPanel();
		JPanel p52 = new JPanel();
		calcButton = new JButton("Calculate");
		calcButton.addActionListener(new ButtonListener());
		p51.add(calcButton);
		msgLabel = new JLabel("Total cost: 0$");
		p52.add(msgLabel);
		
		calcPanel.add(p51);
		calcPanel.add(p52);
	}
	
	private class ButtonListener implements ActionListener {
		
		public void actionPerformed(ActionEvent e) {
			if (numberText.getText().isEmpty()) {
				JOptionPane.showMessageDialog(null, "You haven't give the number of shades");
			} else {
				try {
					double finalCost = 0;
					double styleCost = 0;
					double sizeCost = 0;
					double colorCost = 0;
					int idx1 = styleCombo.getSelectedIndex();
					if (idx1 == -1) {
						JOptionPane.showMessageDialog(null, "You haven't select the style of shades");
						System.exit(0);
					} else {
						styleCost = stylesCost[idx1];
					}
					int idx2 = sizeCombo.getSelectedIndex();
					if (idx2 == -1) {
						JOptionPane.showMessageDialog(null, "You haven't select the size of shades");
						System.exit(0);
					} else {
						sizeCost = sizesCost[idx2];
					}
					int idx3 = colorCombo.getSelectedIndex();
					if (idx3 == -1) {
						JOptionPane.showMessageDialog(null, "You haven't select the color of shades");
						System.exit(0);
					} else {
						colorCost = colorsCost[idx3];
					}
					finalCost = Integer.parseInt(numberText.getText()) * (BASE_FEE + styleCost + sizeCost + colorCost);
					msgLabel.setText("Total cost: $" + finalCost);
				} catch (InputMismatchException exception) {
					JOptionPane.showMessageDialog(null, "The text field value is not an integer");
					numberText.setText("");
				} catch (NumberFormatException exception) {
					JOptionPane.showMessageDialog(null, "The text field value is not a number");
					numberText.setText("");				
				}
			}
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Challenge07();
	}
}
