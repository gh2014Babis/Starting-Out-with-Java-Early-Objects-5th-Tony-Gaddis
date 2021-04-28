package challenges;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

@SuppressWarnings("serial")
public class Challenge03 extends JFrame {
	
	private JPanel panel1;
	private JPanel panel2;
	private JPanel panel3;
	@SuppressWarnings("rawtypes")
	private JComboBox dormitoryBox; 
	@SuppressWarnings("rawtypes")
	private JComboBox mealBox;
	private JLabel dormitoryLabel; 
	private JLabel mealLabel; 
	private JLabel label; 
	private String[] dormitory = {"Allen Hall", "Pike Hall", "Farthing Hall", "University Suites"};
	private String[] meal = {"7", "14", "Unlimited"};
	private double[] dormitoryCost = {1500, 1600, 1200, 1800};
	private double[] mealCost = {560, 1095, 1500};
	
	@SuppressWarnings({ "rawtypes", "unchecked" })
	public Challenge03() {
		super("Dorm and Meal Plan Calculator");
		setSize(300, 300);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLayout(new GridLayout(2, 2));
	    
	    panel1 = new JPanel();
	    panel1.setLayout(new BorderLayout());
	    JPanel j1 = new JPanel();	    
	    dormitoryLabel = new JLabel("Select a dormitory:");
	    j1.add(dormitoryLabel);
	    JPanel j2 = new JPanel();
	    dormitoryBox = new JComboBox(dormitory);
	    dormitoryBox.addActionListener(new ComboBoxListener());
	    j2.add(dormitoryBox);	    
	    panel1.add(j1, BorderLayout.NORTH);
	    panel1.add(j2, BorderLayout.CENTER);
	    
	    panel2 = new JPanel();
	    panel2.setLayout(new BorderLayout());
	    JPanel j3 = new JPanel();
		mealLabel = new JLabel("Select a meal:");
		j3.add(mealLabel);
		JPanel j4 = new JPanel();
		mealBox = new JComboBox(meal);
		mealBox.addActionListener(new ComboBoxListener());
		j4.add(mealBox);
		panel2.add(j3, BorderLayout.NORTH);
		panel2.add(j4, BorderLayout.CENTER);
		
		panel3 = new JPanel();
		label = new JLabel();
		panel3.add(label);
		
	    add(panel1);
	    add(panel2);
	    add(panel3);
	    setVisible(true);
	}
	
	private class ComboBoxListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			double totalCharges = 0;
			totalCharges = dormitoryCost[dormitoryBox.getSelectedIndex()] + mealCost[mealBox.getSelectedIndex()];
			label.setText("Total charges: $" + totalCharges);
		}
	}
	
	public static void main(String[] args) {
		new Challenge03();
	}
}
