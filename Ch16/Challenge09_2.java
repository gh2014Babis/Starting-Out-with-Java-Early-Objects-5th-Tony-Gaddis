package challenges;

import java.awt.BorderLayout;
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
import javax.swing.SpringLayout;

@SuppressWarnings("serial")
public class Challenge09_2 extends JFrame {
	
	private int numRows;
	private int curRow;
	private ResultSet resSearch;
	private String curName;
	private String curPhoneNumber;
	
	private final String DB_URL = "jdbc:derby:PhoneBook";	
	private Connection conn;
	private Statement stmt; 
	
	private final int WIDTH = 500;
	private final int HEIGHT = 500;
	private JLabel searchLabel;
	private JTextField searchTextField;
	private JButton searchButton;
	private JLabel nameLabel;
	private JTextField nameTextField;
	private JLabel phoneNumberLabel;
	private JTextField phoneNumberTextField;
	private JButton updateButton;
	private JButton insertButton;
	private JButton deleteButton;
	private JButton forwardButton;
	private JButton backwardButton;
	
	public Challenge09_2() throws SQLException {
		super("PhoneBook Database");
		setSize(WIDTH, HEIGHT);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLayout(new BorderLayout());
		
		numRows = 0;
		curRow = 0;
		curName = "";
		curPhoneNumber = "";
		conn = DriverManager.getConnection(DB_URL);
		conn.setAutoCommit(false);
		stmt = conn.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_READ_ONLY);
		
		JPanel searchPanel = new JPanel();
		searchLabel = new JLabel("Enter a name: ");
		searchTextField = new JTextField(25);
		searchButton = new JButton("Search");
		searchButton.addActionListener(new ButtonListener());
		searchPanel.add(searchLabel);
		searchPanel.add(searchTextField);
		searchPanel.add(searchButton);
		
		JPanel fieldsPanel = new JPanel(new SpringLayout());
		nameLabel = new JLabel("Name: ", JLabel.TRAILING);
		nameTextField = new JTextField(25);
		phoneNumberLabel = new JLabel("Phone: ", JLabel.TRAILING);
		phoneNumberTextField = new JTextField(10);
				
		JPanel buttonsPanel = new JPanel();
		buttonsPanel.setLayout(new BorderLayout());
		backwardButton = new JButton("Backward");
		forwardButton = new JButton("Forward");		
		insertButton = new JButton("Insert Entry");
		updateButton = new JButton("Update Entry");
		deleteButton = new JButton("Delete Entry");
		forwardButton.addActionListener(new ButtonListener());
		backwardButton.addActionListener(new ButtonListener());
		insertButton.addActionListener(new ButtonListener());
		updateButton.addActionListener(new ButtonListener());
		deleteButton.addActionListener(new ButtonListener());
		forwardButton.setEnabled(false);
		backwardButton.setEnabled(false);
		updateButton.setEnabled(false);
		deleteButton.setEnabled(false);
		
		JPanel bp1 = new JPanel();
		bp1.add(backwardButton);
		bp1.add(forwardButton);		
		
		JPanel bp2 = new JPanel();
		bp2.add(insertButton);
		bp2.add(updateButton);
		bp2.add(deleteButton);
		
		buttonsPanel.add(bp1, BorderLayout.CENTER);
		buttonsPanel.add(bp2, BorderLayout.SOUTH);
		
		fieldsPanel.add(nameLabel);
		nameLabel.setLabelFor(nameTextField);
		fieldsPanel.add(nameTextField);
		fieldsPanel.add(phoneNumberLabel);
		phoneNumberLabel.setLabelFor(phoneNumberTextField);
		fieldsPanel.add(phoneNumberTextField);
		SpringUtilities.makeCompactGrid(fieldsPanel, 2, 2, 6, 6, 6, 6); 
		
		add(searchPanel, BorderLayout.NORTH);
		add(fieldsPanel, BorderLayout.CENTER);
		add(buttonsPanel, BorderLayout.SOUTH);
		
		pack();
		setVisible(true);
	}
	
	private class ButtonListener implements ActionListener {
		
		public void actionPerformed(ActionEvent e) {
			if (e.getSource() == searchButton) {
				if (searchTextField.getText().trim().isEmpty()) {
					JOptionPane.showMessageDialog(null, "You must fill the search field");
				} else {
					try {
						String name = searchTextField.getText().trim();
						String query = "SELECT * FROM Entries WHERE name LIKE '%" + name + "%'";
						resSearch = stmt.executeQuery(query);
						
						resSearch.last();     
						numRows = resSearch.getRow(); 
						resSearch.first();   
						
						if (numRows == 0) {
							JOptionPane.showMessageDialog(null, "There is no entry with name contains " + name);
							searchTextField.setText("");
						} else {
							if (numRows > 1) {
								backwardButton.setEnabled(false);
								forwardButton.setEnabled(true);
							} else {
								forwardButton.setEnabled(false);
								backwardButton.setEnabled(false);
							}
							curRow = 1;
							resSearch.absolute(curRow);
							nameTextField.setText(resSearch.getString(1));
							phoneNumberTextField.setText(resSearch.getString(2));
							curName = nameTextField.getText().trim();
							curPhoneNumber = phoneNumberTextField.getText().trim();
							updateButton.setEnabled(true);
							deleteButton.setEnabled(true);
						}
					} catch(Exception ex) {
						System.out.println("ERROR: " + ex.getMessage());
					} 
				}
			} else if (e.getSource() == insertButton) {
				if (nameTextField.getText().trim().isEmpty() || phoneNumberTextField.getText().trim().isEmpty()) {
					JOptionPane.showMessageDialog(null, "You must fill all the fields");
				} else {
					String phoneNumber = phoneNumberTextField.getText().trim();
					if (phoneNumber.length() != 10 || !phoneNumber.matches("^[0-9]*$")) {
						JOptionPane.showMessageDialog(null, "Invalid value for phone number (10 digits only)");
					} else {
						try {
							if (findPhoneNumber(phoneNumber)) {
								JOptionPane.showMessageDialog(null, "The phone number exists");
							} else {
								String name = nameTextField.getText().trim();
								String query = "INSERT INTO Entries VALUES ('" + name + "', '" + phoneNumber + "')";
								int rows = stmt.executeUpdate(query);
								JOptionPane.showMessageDialog(null, rows + " row inserted.");
								conn.commit();
								forwardButton.setEnabled(false);
								backwardButton.setEnabled(false);
								searchTextField.setText("");
							} 
						} catch(Exception ex) {
							System.out.println("ERROR: " + ex.getMessage());
							try {
								conn.rollback();
							} catch (SQLException e1) {
								// TODO Auto-generated catch block
								e1.printStackTrace();
							}
						}
					}
				}
			} else if (e.getSource() == updateButton) {
				if (nameTextField.getText().trim().isEmpty() || phoneNumberTextField.getText().trim().isEmpty()) {
					JOptionPane.showMessageDialog(null, "You must fill all the fields");
				} else {
					try {
						String name = nameTextField.getText().trim();
						String phoneNumber = phoneNumberTextField.getText().trim();
						String query = "UPDATE Entries SET name ='" + name + "', phone = '" + phoneNumber + "' WHERE name = '" + curName + "' AND phone = '" + curPhoneNumber + "'";
						int rows = stmt.executeUpdate(query);
						JOptionPane.showMessageDialog(null, rows + " row(s) updated in the table.");
						conn.commit();						
						searchTextField.setText("");
						nameTextField.setText("");
						phoneNumberTextField.setText("");
						backwardButton.setEnabled(false);
						forwardButton.setEnabled(false);
						updateButton.setEnabled(false);
						deleteButton.setEnabled(false);						
					} catch(Exception ex) {
						System.out.println("ERROR: " + ex.getMessage());
						try {
							conn.rollback();
						} catch (SQLException e1) {
							// TODO Auto-generated catch block
							e1.printStackTrace();
						}
					}
				}
			} else if (e.getSource() == deleteButton) {
				if (nameTextField.getText().trim().isEmpty() || phoneNumberTextField.getText().trim().isEmpty()) {
					JOptionPane.showMessageDialog(null, "You must fill all the fields");
				} else {
					try {
						String name = nameTextField.getText().trim();
						String phoneNumber = phoneNumberTextField.getText().trim();
						if (name.equals(curName) && phoneNumber.equals(curPhoneNumber)) {
							String query = "DELETE FROM Entries WHERE name = '" + name + "' AND phone = '" + phoneNumber + "'";
							int rows = stmt.executeUpdate(query);
							JOptionPane.showMessageDialog(null, rows + " deleted from the table.");
							conn.commit();	
							searchTextField.setText("");
							nameTextField.setText("");
							phoneNumberTextField.setText("");
							backwardButton.setEnabled(false);
							forwardButton.setEnabled(false);
							updateButton.setEnabled(false);
							deleteButton.setEnabled(false);	
						} else {
							JOptionPane.showMessageDialog(null, "You have change the contents of entry before delete the entry");
						}						
					} catch(Exception ex) {
						System.out.println("ERROR: " + ex.getMessage());
						try {
							conn.rollback();
						} catch (SQLException e1) {
							// TODO Auto-generated catch block
							e1.printStackTrace();
						}
					}
				}				
			}  else if (e.getSource() == forwardButton) {
				curRow++;
				if (curRow == numRows) {
					backwardButton.setEnabled(true);
					forwardButton.setEnabled(false);
				}
				try {
					resSearch.absolute(curRow);
					nameTextField.setText(resSearch.getString(1));
					phoneNumberTextField.setText(resSearch.getString(2));
					curName = nameTextField.getText().trim();
					curPhoneNumber = phoneNumberTextField.getText().trim();
				} catch(Exception ex) {
					System.out.println("ERROR: " + ex.getMessage());
				}				
			} else {
				curRow--;
				if (curRow == 1) {
					backwardButton.setEnabled(false);
					forwardButton.setEnabled(true);
				}
				try {
					resSearch.absolute(curRow);
					nameTextField.setText(resSearch.getString(1));
					phoneNumberTextField.setText(resSearch.getString(2));
					curName = nameTextField.getText().trim();
					curPhoneNumber = phoneNumberTextField.getText().trim();
				} catch(Exception ex) {
					System.out.println("ERROR: " + ex.getMessage());
				}	
			}		
		}
	}
	
	public boolean findPhoneNumber(String phoneNumber) throws SQLException {
		Connection conn = DriverManager.getConnection(DB_URL);
		try {			
			Statement stmt = conn.createStatement();
			String query = "SELECT * FROM Entries WHERE phone = '" + phoneNumber + "'";
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

	public static void main(String[] args) throws SQLException {
		// TODO Auto-generated method stub
		new Challenge09_2();
	}
}