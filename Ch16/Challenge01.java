package challenges;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class Challenge01 {
	
	static final String DB_URL = "jdbc:derby:CoffeeDB";
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub		
		try {
			Connection conn = DriverManager.getConnection(DB_URL);
			Statement stmt = conn.createStatement();
			Scanner keyboard = new Scanner(System.in);			
			boolean found = true;
			String customerNumber = "";
			while (found) {
				System.out.print("Enter the customer number: ");
				customerNumber = keyboard.next();
				if (!findCustomerNumber(customerNumber)) {
					found = false;
				} else {
					System.out.println("The customer number already exists");
				}
			}
			keyboard.nextLine();
			System.out.print("Enter the name: ");
			String name = keyboard.nextLine();
			System.out.print("Enter the address: ");
			String address = keyboard.nextLine();
			System.out.print("Enter the city: ");
			String city = keyboard.nextLine();
			System.out.print("Enter the state: ");
			String state = keyboard.nextLine();
			state = Character.toUpperCase(state.charAt(0)) + "" + Character.toUpperCase(state.charAt(1));
			System.out.print("Enter the zip: ");
			String zip = keyboard.nextLine();
			while (zip.length() != 5) {
				System.out.println("Enter a five digit zip code");
				zip = keyboard.nextLine();
			}
			String sqlStatement = "INSERT INTO CUSTOMER "
								+ "VALUES('" + customerNumber + "', '" + name + "', '" + address + "', '" + city + "', '" + state + "', '" + zip + "')";
			int rows = stmt.executeUpdate(sqlStatement);
			// Display the results.
			System.out.println(rows + " row(s) added to the table.");
			// Close the connection.
			conn.close();
			keyboard.close();
		} catch(Exception ex) {
			System.out.println("ERROR: " + ex.getMessage());
		}
	}
		
	public static boolean findCustomerNumber(String customerNumber) throws SQLException {
		Connection conn = DriverManager.getConnection(DB_URL);
		try {			
			Statement stmt = conn.createStatement();
			String query = "SELECT * FROM CUSTOMER WHERE customerNumber = '" + customerNumber + "'";
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
}
