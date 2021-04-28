package challenges;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.GridLayout;

import javax.swing.BorderFactory;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.ListSelectionModel;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

@SuppressWarnings("serial")
public class Challenge04 extends JFrame {
	
	private JPanel deckPanel;
	private JPanel truckPanel;
	private JPanel wheelPanel;
	private JPanel productPanel;
	private JPanel msgPanel;
	@SuppressWarnings("rawtypes")
	private JList deckList;
	@SuppressWarnings("rawtypes")
	private JList truckList;
	@SuppressWarnings("rawtypes")
	private JList wheelList;
	@SuppressWarnings("rawtypes")
	private JList productList;
	private JLabel label1;
	private JLabel label2;
	private JLabel label3;
	private JLabel label4;
	private JLabel msg1;
	private JLabel msg2;
	private JLabel msg3;
	private String[] decks = {"The Master Thrasher", "The Dictator", "The Street King"};
	private String[] trucks = {"7.75-inch", "8-inch", "8.5-inch"};
	private String[] wheels = {"51 mm", "55 mm", "58 mm", "61 mm"};
	private String[] products = {"Grip tape", "Bearings", "Riser pads", "Nuts & bolts kit"};
	private double[] decksCost = {60, 45, 50};
	private double[] trucksCost = {35, 40, 45};
	private double[] wheelsCost = {30, 22, 24, 28};
	private double[] productsCost = {10, 30, 2, 3};	
	
	public Challenge04() {
		super("Skateboard Designer");
		setSize(600, 500);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLayout(new GridLayout(3, 2));
		
		buildDeckPanel();
		buildTruckPanel();
		buildWheelPanel();
		buildProductPanel();
		msgPanel = new JPanel();
		msgPanel.setLayout(new GridLayout(3, 1));
		msg1 = new JLabel("Subtotal: $");
		msg2 = new JLabel("Sales Tax: $");
		msg3 = new JLabel("Total: $");
		msgPanel.add(msg1);
		msgPanel.add(msg2);
		msgPanel.add(msg3);
		add(deckPanel);
		add(truckPanel);
		add(wheelPanel);
		add(productPanel);
		add(msgPanel);
		setVisible(true);
	}
	
	@SuppressWarnings({ "unchecked", "rawtypes" })
	public void buildDeckPanel() {
		deckPanel = new JPanel();
		deckPanel.setLayout(new BorderLayout());
		label1 = new JLabel("Decks");
		deckList = new JList(decks);
		deckList.setBorder(BorderFactory.createLineBorder(Color.BLACK, 1));
		deckList.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		deckList.addListSelectionListener(new ListListener());
		deckPanel.add(label1, BorderLayout.NORTH);
		deckPanel.add(deckList, BorderLayout.CENTER);
	}
	
	@SuppressWarnings({ "unchecked", "rawtypes" })
	public void buildTruckPanel() {
		truckPanel = new JPanel();
		truckPanel.setLayout(new BorderLayout());
		label2 = new JLabel("Trucks");
		truckList = new JList(trucks);
		truckList.setBorder(BorderFactory.createLineBorder(Color.RED, 1));
		truckList.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		truckList.addListSelectionListener(new ListListener());
		truckPanel.add(label2, BorderLayout.NORTH);
		truckPanel.add(truckList, BorderLayout.CENTER);
	}
	
	@SuppressWarnings({ "unchecked", "rawtypes" })
	public void buildWheelPanel() {
		wheelPanel = new JPanel();
		wheelPanel.setLayout(new BorderLayout());
		label3 = new JLabel("Wheels");
		wheelList = new JList(wheels);
		wheelList.setBorder(BorderFactory.createLineBorder(Color.GREEN, 1));
		wheelList.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		wheelList.addListSelectionListener(new ListListener());
		wheelPanel.add(label3, BorderLayout.NORTH);
		wheelPanel.add(wheelList, BorderLayout.CENTER);
	}
	
	@SuppressWarnings({ "unchecked", "rawtypes" })
	public void buildProductPanel() {
		productPanel = new JPanel();
		productPanel.setLayout(new BorderLayout());
		label4 = new JLabel("Products");
		productList = new JList(products);
		productList.setBorder(BorderFactory.createLineBorder(Color.BLUE, 1));
		productList.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		productList.addListSelectionListener(new ListListener());
		productPanel.add(label4, BorderLayout.NORTH);
		productPanel.add(productList, BorderLayout.CENTER);
	}
	
	private class ListListener implements ListSelectionListener {
		
		public void valueChanged(ListSelectionEvent e) {
			double subTotal = 0;
			int idx1 = deckList.getSelectedIndex();
			if (idx1 != -1)
				subTotal += decksCost[idx1];
			int idx2 = truckList.getSelectedIndex();
			if (idx2 != -1)
				subTotal += trucksCost[idx2];
			int idx3 = wheelList.getSelectedIndex();
			if (idx3 != -1)
				subTotal += wheelsCost[idx3];
			int[] selections = productList.getSelectedIndices();
			for (int i = 0; i < selections.length; i++) {
				subTotal += productsCost[i];
			}
			msg1.setText("Subtotal: $" + subTotal);
			double tax = subTotal * 0.06;
			msg2.setText("Sales Tax: $" + tax);
			msg3.setText("Total: $" + (subTotal + tax));
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Challenge04();
	}

}
