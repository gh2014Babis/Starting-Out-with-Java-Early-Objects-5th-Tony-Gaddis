package challenges;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

@SuppressWarnings("serial")
public class Challenge07_1 extends JFrame {
	
	private final String DB_URL = "jdbc:derby:Personnel";	
	private final int WIDTH = 500;
	private final int HEIGHT = 500;
	private JLabel idLabel;
	private JTextField idTextField;
	private JLabel nameLabel;
	private JTextField nameTextField;
	private JLabel positionLabel;
	private JTextField positionTextField;
	private JLabel hourlyPayRateLabel;
	private JTextField hourlyPayRateTextField;
	private JButton insertButton;
	
	public Challenge07_1() {
		super("Employee Inserter");
		setSize(WIDTH, HEIGHT);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLayout(new BorderLayout());
		
		JPanel fieldsPanel = new JPanel();
		fieldsPanel.setLayout(new GridLayout(4, 2));
		
		idLabel = new JLabel("ID: ");
		idTextField = new JTextField(10);
		
		nameLabel = new JLabel("Name: ");
		nameTextField = new JTextField(25);
		
		positionLabel = new JLabel("Position: ");
		positionTextField = new JTextField(25);
		
		hourlyPayRateLabel = new JLabel("Hourly pay rate: ");
		hourlyPayRateTextField = new JTextField(10);
		
		JPanel insertButtonPanel = new JPanel();
		insertButton = new JButton("Insert Employee");
		insertButton.addActionListener(new ButtonListener());
		insertButtonPanel.add(insertButton);
		
		fieldsPanel.add(idLabel);
		fieldsPanel.add(idTextField);
		fieldsPanel.add(nameLabel);
		fieldsPanel.add(nameTextField);
		fieldsPanel.add(positionLabel);
		fieldsPanel.add(positionTextField);
		fieldsPanel.add(hourlyPayRateLabel);
		fieldsPanel.add(hourlyPayRateTextField);
		add(fieldsPanel, BorderLayout.CENTER);
		add(insertButtonPanel, BorderLayout.SOUTH);
		
		pack();
		setVisible(true);
	}
	
	private class ButtonListener implements ActionListener {
		
		public void actionPerformed(ActionEvent e) {
			if (idTextField.getText().isEmpty() || nameTextField.getText().isEmpty() || positionTextField.getText().isEmpty() || hourlyPayRateTextField.getText().isEmpty()) {
				JOptionPane.showMessageDialog(null, "You must fill all the fields");
			} else {
				String id = idTextField.getText();
				try {
					if (findEmployeeID(id)) {
						JOptionPane.showMessageDialog(null, "The id already exists");
						idTextField.setText("");
					} else {
						Connection conn = DriverManager.getConnection(DB_URL);
						Statement stmt = conn.createStatement();
						String name = nameTextField.getText();
						String position = positionTextField.getText();
						Double hpr = Double.parseDouble(hourlyPayRateTextField.getText());
						String query = "INSERT INTO Employee VALUES ('" + id + "', '" + name + "', '" + position + "', " + hpr + ")";
						int rows = stmt.executeUpdate(query);
						JOptionPane.showMessageDialog(null, rows + " row(s) added to the table.");
					}
				} catch(Exception ex) {
					System.out.println("ERROR: " + ex.getMessage());
				}
			}
		}
	}
	
	public boolean findEmployeeID(String id) throws SQLException {
		Connection conn = DriverManager.getConnection(DB_URL);
		try {			
			Statement stmt = conn.createStatement();
			String query = "SELECT * FROM Employee WHERE ID = '" + id + "'";
			ResultSet result = stmt.executeQuery(query);
			if (result.next()) {				
				return true;
			}
		} catch (Exception ex) {
			System.out.println("ERROR: " + ex.getMessage());			
	    } finally {
	    	conn.close();
	    }
		return false;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Challenge07_1();
	}

}
