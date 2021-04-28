package challenges;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.ButtonGroup;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.ListSelectionModel;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

@SuppressWarnings("serial")
public class Challenge08 extends JFrame {
	
	private JPanel typePanel;
	private JPanel dinnerPanel;
	private JPanel workshopPanel;
	private JPanel msgPanel;
	private JRadioButton generalType;
	private JRadioButton studentType;
	private ButtonGroup typeGroup;
	private JCheckBox dinnerCheck;
	@SuppressWarnings("rawtypes")
	private JList workshopList;
	private JLabel msgLabel;
	private String[] workshops = {"Introduction to E-commerce", "The Future of the Web", "Advanced Java Programming", "Network Security"};
	private double[] workshopCost = {295, 295, 395, 395};
	private final double GENERAL_COST = 895;
	private final double STUDENT_COST = 495;
	private final double DINNER_COST = 30;
	private double typeCost = 0;
	private double dinnerCost = 0;
	private double workshopsCost = 0;
	private double totalCost = 0;
	
	public Challenge08() {
		super("Conference Registration System");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(500, 500);
		setLayout(new BorderLayout());
		
		buildTypePanel();
		buildDinnerPanel();
		buildWorkshopPanel();
		buildMsgPanel();
		
		add(typePanel, BorderLayout.WEST);
		add(dinnerPanel, BorderLayout.CENTER);
		add(workshopPanel, BorderLayout.EAST);
		add(msgPanel, BorderLayout.SOUTH);
		
		pack();
		setVisible(true);
	}
	
	private void buildTypePanel() {
		typePanel = new JPanel();
		typePanel.setLayout(new BorderLayout());
		
		generalType = new JRadioButton("General person");
		studentType = new JRadioButton("Student");
		generalType.addActionListener(new RadioButtonListener());
		studentType.addActionListener(new RadioButtonListener());
		typeGroup = new ButtonGroup();
		typeGroup.add(generalType);
		typeGroup.add(studentType);
		
		typePanel.add(generalType, BorderLayout.NORTH);
		typePanel.add(studentType, BorderLayout.CENTER);
	}
	
	private void buildDinnerPanel() {
		dinnerPanel = new JPanel();
		dinnerCheck = new JCheckBox("Dinner with keynote speech");
		dinnerCheck.addItemListener(new CheckBoxListener());
		dinnerPanel.add(dinnerCheck);
	}		
	
	@SuppressWarnings({ "rawtypes", "unchecked" })
	private void buildWorkshopPanel() {
		workshopPanel = new JPanel();
		workshopList = new JList(workshops);
		workshopList.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		workshopList.addListSelectionListener(new ListListener());
		workshopPanel.add(workshopList);
	}
	
	private void buildMsgPanel() {
		msgPanel = new JPanel();
		msgLabel = new JLabel("Total cost: $0");
		msgPanel.add(msgLabel);
	}
	
	private class RadioButtonListener implements ActionListener {
		
		public void actionPerformed(ActionEvent e) {
			if (e.getSource() == generalType)
				typeCost = GENERAL_COST;
			else
				typeCost = STUDENT_COST;
			totalCost = typeCost + dinnerCost + workshopsCost;
			msgLabel.setText("Total cost: $" + totalCost);
		}
	}
	
	private class CheckBoxListener implements ItemListener {
		
		public void itemStateChanged(ItemEvent e) {
			if (dinnerCheck.isSelected()) 
				dinnerCost = DINNER_COST;
			else
				dinnerCost = 0;
			totalCost = typeCost + dinnerCost + workshopsCost;
			msgLabel.setText("Total cost: $" + totalCost);
		}
	}
	
	private class ListListener implements ListSelectionListener {
	
		public void valueChanged(ListSelectionEvent e) {
			workshopsCost = 0;
			int[] indeces = workshopList.getSelectedIndices();
			for (int i = 0; i < indeces.length; i++)
				workshopsCost += workshopCost[indeces[i]];
			totalCost = typeCost + dinnerCost + workshopsCost;
			msgLabel.setText("Total cost: $" + totalCost);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Challenge08();
	}
}
