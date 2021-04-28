package challenges;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.io.FileNotFoundException;

import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;

@SuppressWarnings({ "unused", "serial" })
public class Challenge06 extends JFrame {
	
	private JPanel packagePanel;
	private JPanel cellPanel;
	private JPanel servicePanel;
	private JPanel msgPanel;
	private JLabel packageLabel;
	private JLabel cellLabel;
	@SuppressWarnings("rawtypes")
	private JComboBox packages;
	@SuppressWarnings("rawtypes")
	private JComboBox cells;
	private JCheckBox mail;
	private JCheckBox messaging;
	private JLabel label1;
	private JLabel label2;
	private JLabel label3;
	private JLabel label4;
	private JLabel label5;
	private String[] pack = {"300 minutes", "800 minutes", "1500 minutes"};
	private double[] packCost = {45.00, 65.00, 99.00};
	private String[] cell = {"Model 100", "Model 110", "Model 200"};
	private double[] cellCost = {29.95, 49.95, 99.95};
	private final double MAIL_COST = 5.00;
	private final double MESSAGING_COST = 10.00;
	private final double SALES_TAX = 0.06;
	private double pCost = 0;
	private double cCost = 0;
	private double mailCost = 0;
	private double messagingCost = 0;
	private double total = 0;
	
	public Challenge06() {
		super("Cell Phone Packages");
		setSize(500, 200);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLayout(new BorderLayout());
		
		buildPackagePanel();
		buildCellPanel();
		buildServicePanel();
		buildMsgPanel();		
		
		add(packagePanel, BorderLayout.WEST);
		add(cellPanel, BorderLayout.CENTER);
		add(servicePanel, BorderLayout.EAST);
		add(msgPanel, BorderLayout.SOUTH);
		
		setVisible(true);
	}
	
	@SuppressWarnings({ "unchecked", "rawtypes" })
	private void buildPackagePanel() {
		packagePanel = new JPanel();
		packagePanel.setLayout(new BorderLayout());
		
		packageLabel = new JLabel("Select a package:");
		packages = new JComboBox(pack);
		packages.addActionListener(new ComboBoxListener());
		
		JPanel p11 = new JPanel();
		JPanel p12 = new JPanel();
		p11.add(packageLabel);
		p12.add(packages);		
		
		packagePanel.add(p11, BorderLayout.NORTH);
		packagePanel.add(p12, BorderLayout.CENTER);
	}
	
	@SuppressWarnings({ "rawtypes", "unchecked" })
	private void buildCellPanel() {
		cellPanel = new JPanel();
		cellPanel.setLayout(new BorderLayout());
		
		cellLabel = new JLabel("Select a cell model:");
		cells = new JComboBox(cell);
		cells.addActionListener(new ComboBoxListener());
		
		JPanel p21 = new JPanel();
		JPanel p22 = new JPanel();
		p21.add(cellLabel);
		p22.add(cells);		
		
		cellPanel.add(p21, BorderLayout.NORTH);
		cellPanel.add(p22, BorderLayout.CENTER);
	}
	
	private void buildServicePanel() {
		servicePanel = new JPanel();
		servicePanel.setLayout(new GridLayout(2, 1));
		
		mail = new JCheckBox("Voice mail");
		mail.addItemListener(new CheckBoxListener());
		
		messaging = new JCheckBox("Text messaging");
		messaging.addItemListener(new CheckBoxListener());
		
		servicePanel.add(mail);
		servicePanel.add(messaging);
	}
	
	private void buildMsgPanel() {
		msgPanel = new JPanel();
		msgPanel.setLayout(new GridLayout(5, 1));
		label1 = new JLabel("Package:  Cost: $0.00");
		label2 = new JLabel("Cell model:  Cost: $0.00");
		label3 = new JLabel("Voice mail: $0.00");
		label4 = new JLabel("Text messaging: $0.00");
		label5 = new JLabel("Total cost: $0.00");
		msgPanel.add(label1);
		msgPanel.add(label2);
		msgPanel.add(label3);
		msgPanel.add(label4);
		msgPanel.add(label5);
	}
	
	private class ComboBoxListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			String s1;
			int s2;
			if (e.getSource() == packages) {
				s1 = (String) packages.getSelectedItem();
				s2 = packages.getSelectedIndex();
				pCost = packCost[s2];
				label1.setText("Package: " + s1 + " Cost: $" + pCost);
			} else {
				s1 = (String) cells.getSelectedItem();
				s2 = cells.getSelectedIndex();
				cCost = packCost[s2];
				cCost = cCost + cCost * SALES_TAX;
				label2.setText("Cell model: " + s1 + " Cost: $" + cCost);
			}
			total = mailCost + messagingCost + pCost + cCost;
			label5.setText("Total cost: $" + total);
	    }
	}
	
	private class CheckBoxListener implements ItemListener {
		public void itemStateChanged(ItemEvent e) {
			if (e.getSource() == mail) {
				if (mail.isSelected()) {
					mailCost = MAIL_COST;
	            } else {
	            	mailCost = 0;
	            }
				label3.setText("Voice mail: $" + mailCost);
			} else if (e.getSource() == messaging) {
				if (messaging.isSelected()) {
					messagingCost = MESSAGING_COST;
	            } else {
	            	messagingCost = 0;
	            }
				label4.setText("Text messaging: $" + messagingCost);
			}
			total = mailCost + messagingCost + pCost + cCost;
			label5.setText("Total cost: $" + total);
		}
	}
	
	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub
		new Challenge06();
	}
}
