package challenges;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SpringLayout;

@SuppressWarnings("serial")
public class Challenge08 extends JFrame {
	
	private final String DB_URL = "jdbc:derby:Personnel";	
	private final int WIDTH = 500;
	private final int HEIGHT = 500;
	private JLabel searchLabel;
	private JTextField searchTextField;
	private JButton searchButton;
	private JLabel idLabel;
	private JTextField idTextField;
	private JLabel nameLabel;
	private JTextField nameTextField;
	private JLabel positionLabel;
	private JTextField positionTextField;
	private JLabel hourlyPayRateLabel;
	private JTextField hourlyPayRateTextField;
	private JButton updateButton;
	
	public Challenge08() {
		super("Employee Updater");
		setSize(WIDTH, HEIGHT);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLayout(new BorderLayout());
		
		JPanel searchPanel = new JPanel();
		searchLabel = new JLabel("Enter an ID: ");
		searchTextField = new JTextField(10);
		searchButton = new JButton("Search");
		searchButton.addActionListener(new ButtonListener());
		searchPanel.add(searchLabel);
		searchPanel.add(searchTextField);
		searchPanel.add(searchButton);
		
		JPanel fieldsPanel = new JPanel(new SpringLayout());
		idLabel = new JLabel("ID: ", JLabel.TRAILING);
		idTextField = new JTextField(10);
		idTextField.setEnabled(false);
		nameLabel = new JLabel("Name: ", JLabel.TRAILING);
		nameTextField = new JTextField(25);
		nameTextField.setEnabled(false);
		positionLabel = new JLabel("Position: ", JLabel.TRAILING);
		positionTextField = new JTextField(25);
		positionTextField.setEnabled(false);
		hourlyPayRateLabel = new JLabel("Hourly pay rate: ", JLabel.TRAILING);
		hourlyPayRateTextField = new JTextField(10);
		hourlyPayRateTextField.setEnabled(false);
				
		JPanel updateButtonPanel = new JPanel();
		updateButton = new JButton("Update Employee");
		updateButton.setEnabled(false);
		updateButton.addActionListener(new ButtonListener());
		updateButtonPanel.add(updateButton);		
		
		fieldsPanel.add(idLabel);
		idLabel.setLabelFor(idTextField);
		fieldsPanel.add(idTextField);
		fieldsPanel.add(nameLabel);
		nameLabel.setLabelFor(nameTextField);
		fieldsPanel.add(nameTextField);
		fieldsPanel.add(positionLabel);
		positionLabel.setLabelFor(positionTextField);
		fieldsPanel.add(positionTextField);
		fieldsPanel.add(hourlyPayRateLabel);
		hourlyPayRateLabel.setLabelFor(hourlyPayRateTextField);
		fieldsPanel.add(hourlyPayRateTextField);
		SpringUtilities.makeCompactGrid(fieldsPanel, 4, 2, 6, 6, 6, 6); 
		
		add(searchPanel, BorderLayout.NORTH);
		add(fieldsPanel, BorderLayout.CENTER);
		add(updateButtonPanel, BorderLayout.SOUTH);
		
		pack();
		setVisible(true);
	}
	
	private class ButtonListener implements ActionListener {
		
		public void actionPerformed(ActionEvent e) {
			if (e.getSource() == updateButton) {
				if (nameTextField.getText().trim().isEmpty() || positionTextField.getText().trim().isEmpty() || hourlyPayRateTextField.getText().trim().isEmpty()) {
					JOptionPane.showMessageDialog(null, "You must fill all the fields");
				} else {
					String id = idTextField.getText();
					try {
						Connection conn = DriverManager.getConnection(DB_URL);
						Statement stmt = conn.createStatement();
						String name = nameTextField.getText();
						String position = positionTextField.getText();
						Double hpr = Double.parseDouble(hourlyPayRateTextField.getText());
						String query = "UPDATE Employee SET name ='" + name + "', position = '" + position + "', hourlyPayRate = " + hpr + " WHERE ID = '" + id + "'";
						int rows = stmt.executeUpdate(query);
						JOptionPane.showMessageDialog(null, rows + " row(s) updated in the table.");
						conn.close();
					} catch(Exception ex) {
						System.out.println("ERROR: " + ex.getMessage());
					}
				}
			} else {
				if (searchTextField.getText().isEmpty()) {
					JOptionPane.showMessageDialog(null, "You must fill the search field");
				} else {
					try {
						Connection conn = DriverManager.getConnection(DB_URL);
						Statement stmt = conn.createStatement();
						String id = searchTextField.getText();
						String query = "SELECT * FROM Employee WHERE id = '" + id + "'";
						ResultSet res = stmt.executeQuery(query);
						if (res.next()) {
							idTextField.setText(res.getString(1));
							nameTextField.setEnabled(true);
							nameTextField.setText(res.getString(2));
							positionTextField.setEnabled(true);
							positionTextField.setText(res.getString(3));
							hourlyPayRateTextField.setEnabled(true);
							hourlyPayRateTextField.setText(String.valueOf(res.getDouble(4)));
							updateButton.setEnabled(true);
						} else {
							JOptionPane.showMessageDialog(null, "There is no employee with id = " + id);
							searchTextField.setText("");
						}
						conn.close();
					} catch(Exception ex) {
						System.out.println("ERROR: " + ex.getMessage());
					}
				}
			}
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Challenge08();
	}

}