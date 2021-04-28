package challenges;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.ListSelectionModel;

@SuppressWarnings("serial")
public class Challenge05 extends JFrame {
	
	private JPanel panel1;
	private JPanel panel2;
	private JPanel panel3;
	private JPanel panel4;
	private JLabel booksLabel;
	@SuppressWarnings("rawtypes")
	private JList booksList;
	@SuppressWarnings("rawtypes")
	private JList cartList;
	private JButton addBooks;
	private JButton removeBooks;
	private JButton clearShoppingCart;
	private JButton checkOut;
	private JLabel subTotalLabel;
	private JLabel salesTaxLabel;
	private JLabel totalLabel;
	private ArrayList<String> titles;
	private ArrayList<Double> prices;
	private ArrayList<String> cartTitles;
	private ArrayList<Double> cartPrices;
	
	@SuppressWarnings({ "unchecked", "rawtypes" })
	public Challenge05() throws FileNotFoundException {
		super("Shopping Cart System");
		setSize(600, 500);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLayout(new GridLayout(2, 2));
		
		File file = new File("E:\\BABIS\\Programming\\Java\\Java Early Objects\\Ch12\\src\\challenges\\BookPrices.txt");
		Scanner inputFile = new Scanner(file);
		titles = new ArrayList<String>();
		prices = new ArrayList<Double>();
		while (inputFile.hasNext()) {
			String record = inputFile.nextLine();
			String[] parts = record.split(",");
			titles.add(parts[0]);
			prices.add(Double.parseDouble(parts[1]));
		}
		inputFile.close();
		cartTitles = new ArrayList<String>();
		cartPrices = new ArrayList<Double>();
		
		panel1 = new JPanel();
		panel1.setLayout(new BorderLayout());
		booksList = new JList(titles.toArray());
		booksList.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		booksLabel = new JLabel("Available books for sale");		
		panel1.add(booksLabel, BorderLayout.NORTH);
		panel1.add(booksList, BorderLayout.CENTER);
		
		panel2 = new JPanel();
		panel2.setLayout(new GridLayout(4, 1));
		addBooks = new JButton("Add Books");
		addBooks.addActionListener(new ButtonListener());
		removeBooks = new JButton("Remove Books");
		removeBooks.addActionListener(new ButtonListener());
		clearShoppingCart = new JButton("Clear Shopping Cart");
		clearShoppingCart.addActionListener(new ButtonListener());
		checkOut = new JButton("Check Out");
		checkOut.addActionListener(new ButtonListener());
		panel2.add(addBooks);
		panel2.add(removeBooks);
		panel2.add(clearShoppingCart);
		panel2.add(checkOut);
		
		panel3 = new JPanel();
		cartList = new JList();
		cartList.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		panel3.add(cartList);
		
		panel4 = new JPanel();
		panel4.setLayout(new BorderLayout());
		subTotalLabel = new JLabel("Sub total: $");
		salesTaxLabel = new JLabel("Sales tax (6%): $");
		totalLabel = new JLabel("Total cost: $");
		panel4.add(subTotalLabel, BorderLayout.NORTH);
		panel4.add(salesTaxLabel, BorderLayout.CENTER);
		panel4.add(totalLabel, BorderLayout.SOUTH);
		
		add(panel1);
		add(panel2);
		add(panel3);
		add(panel4);
		setVisible(true);
	}
	
	private class ButtonListener implements ActionListener {
		@SuppressWarnings({ "unchecked", "deprecation" })
		public void actionPerformed(ActionEvent e) {
			Object[] selections1 = booksList.getSelectedValues(); 
			int[] selections2 = booksList.getSelectedIndices();
			if (e.getSource() == addBooks) {	
				cartTitles.clear();
				cartPrices.clear();
				for (int i = 0; i < selections1.length; i++) {
					cartTitles.add((String) selections1[i]);
					cartPrices.add(prices.get(selections2[i]));
				}
				cartList.setListData(cartTitles.toArray());
			} else if (e.getSource() == removeBooks) {
				Object[] s1 = cartList.getSelectedValues();
				for (int i = 0; i < s1.length; i++) {
					cartTitles.remove(s1[i]);
					double price = 0;
					for (int j = 0; j < titles.size(); j++) {
						if (s1[i].equals(titles.get(j))) {
							price = prices.get(j);
							break;
						}
					}
					cartPrices.remove(price);
				}
				System.out.println(cartTitles + " " + cartPrices);
				cartList.setListData(cartTitles.toArray());
			} else if (e.getSource() == clearShoppingCart) {
				cartTitles.clear();
				cartPrices.clear();
				cartList.setListData(cartTitles.toArray());
			} else {
				double subTotal = 0;
				double tax = 0;
				double total = 0;
				for (int i = 0; i < cartPrices.size(); i++) {
					subTotal += cartPrices.get(i);
				} 
				tax = subTotal * 0.06;
				total = subTotal + tax;
				subTotalLabel.setText("Sub total: $" + subTotal);
				salesTaxLabel.setText("Sales tax (6%): $" + tax);
				totalLabel.setText("Total cost: $" + total);
			}
		}
	}

	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub
		new Challenge05();
	}
}
