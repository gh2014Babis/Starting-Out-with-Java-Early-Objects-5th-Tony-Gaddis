package challenges;

import java.awt.BorderLayout;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextField;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

@SuppressWarnings("serial")
public class Challenge04 extends JFrame {
	
	static final String DB_URL = "jdbc:derby:CoffeeDB";
	private final int WIDTH = 500;
	private final int HEIGHT = 400;
	@SuppressWarnings("rawtypes")
	JList customerList;
	JLabel totalCostLabel;
	JTextField totalCostTextField;
	
	@SuppressWarnings({ "unchecked", "rawtypes" })
	public Challenge04() {
		super("Unpaid Order Lookup");
		setSize(WIDTH, HEIGHT);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLayout(new BorderLayout());
		try {
			String[] customerNumbers = getCustomerNumbers();
			customerList = new JList(customerNumbers);
			customerList.setVisibleRowCount(5);
			customerList.addListSelectionListener(new ListListener());
			JScrollPane scrollPane = new JScrollPane(customerList);
			add(scrollPane, BorderLayout.CENTER);
			
			totalCostLabel = new JLabel("Total cost: $");
			totalCostTextField = new JTextField(10);
			JPanel costPanel = new JPanel();
			costPanel.add(totalCostLabel);
			costPanel.add(totalCostTextField);
			add(costPanel, BorderLayout.SOUTH);
			
			pack();
			setVisible(true);
		} catch(Exception ex) {
			System.out.println("ERROR: " + ex.getMessage());
		}	
	}
	
	private class ListListener implements ListSelectionListener {
		public void valueChanged(ListSelectionEvent e) {
			// Get the selected string from the list.
	        String selection = (String) customerList.getSelectedValue();
	        try {
		        Connection conn = DriverManager.getConnection(DB_URL);
				Statement stmt = conn.createStatement();
				ResultSet resultSet = stmt.executeQuery("SELECT SUM(Cost) FROM UNPAIDORDER WHERE CustomerNumber = '" + selection + "'");
				if (resultSet.next()) {
					totalCostTextField.setText(String.valueOf(resultSet.getDouble(1)));
				} 
				conn.close();
	        } catch(Exception ex) {
				System.out.println("ERROR: " + ex.getMessage());
	        } 
	    }
	}
	
	public String[] getCustomerNumbers() throws SQLException {
		Connection conn = DriverManager.getConnection(DB_URL);
		Statement stmt = conn.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_READ_ONLY);
		ResultSet resultSet = stmt.executeQuery("SELECT CustomerNumber FROM Customer");

	    resultSet.last();                 
	    int numRows = resultSet.getRow();
	    resultSet.first();    
	        
	    String[] listData = new String[numRows];

	    for (int index = 0; index < numRows; index++) {
	    	listData[index] = resultSet.getString(1);
	    	resultSet.next();
	    }
	    
	    conn.close();
	    stmt.close();
	    return listData;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Challenge04();
	}

}
