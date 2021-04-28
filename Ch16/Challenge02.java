package challenges;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class Challenge02 {
	
	static final String DB_URL = "jdbc:derby:CoffeeDB";
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub		
		try {
			Scanner keyboard = new Scanner(System.in);	
			Connection conn = DriverManager.getConnection(DB_URL);
			Statement stmt = conn.createStatement();
			String q1 = "SELECT * FROM CUSTOMER";
			ResultSet res1 = stmt.executeQuery(q1);
			while (res1.next()) {
				System.out.print(res1.getString(1) + " " + res1.getString(2) + " " + res1.getString(3) + " " + res1.getString(4)
				                 + " " + res1.getString(5) + " " + res1.getString(6) + "\n");
			}
			String customerNumber = "";
			boolean found = false;
			while (!found) {
				System.out.print("Enter the customer number: ");
				customerNumber = keyboard.next();
				if (findCustomerNumber(customerNumber)) {
					found = true;
				} else {
					System.out.println("There is not this customer number");
				}
			}
			int choice;
			do {
				System.out.println("--Select the field for update--");
				System.out.println("1. Name");
				System.out.println("2. Address");
				System.out.println("3. City");
				System.out.println("4. State");
				System.out.println("5. Zip");
				System.out.print("Enter your choice: ");
				choice = keyboard.nextInt();
				if (choice < 1 || choice > 5)
					System.out.println("Invalid choice");
			} while (choice < 1 || choice > 5);
			stmt = conn.createStatement();
			keyboard.nextLine();
			String q2;
			int rows;
			if (choice == 1) {
				System.out.print("Enter a new name: ");
				String name = keyboard.nextLine();
				q2 = "UPDATE CUSTOMER SET Name = '" + name + "' WHERE CustomerNumber = '" + customerNumber + "'";
				rows = stmt.executeUpdate(q2);
				System.out.println(rows + " row(s) updated in the table.");
			} else if (choice == 2) {
				System.out.print("Enter a new address: ");
				String address = keyboard.nextLine();
				q2 = "UPDATE CUSTOMER SET Address = '" + address + "' WHERE CustomerNumber = '" + customerNumber + "'";
				rows = stmt.executeUpdate(q2);
				System.out.println(rows + " row(s) updated in the table.");
			} else if (choice == 3) {
				System.out.print("Enter a new city: ");
				String city = keyboard.nextLine();
				q2 = "UPDATE CUSTOMER SET City = '" + city + "' WHERE CustomerNumber = '" + customerNumber + "'";
				rows = stmt.executeUpdate(q2);
				System.out.println(rows + " row(s) updated in the table.");
			} else if (choice == 4) {
				System.out.print("Enter a new state: ");
				String state = keyboard.nextLine();
				state = Character.toUpperCase(state.charAt(0)) + "" + Character.toUpperCase(state.charAt(1));
				q2 = "UPDATE CUSTOMER SET State = '" + state + "' WHERE CustomerNumber = '" + customerNumber + "'";
				rows = stmt.executeUpdate(q2);
				System.out.println(rows + " row(s) updated in the table.");
			} else {
					System.out.print("Enter a new zip: ");
					String zip = keyboard.nextLine();
					while (zip.length() != 5) {
						System.out.println("Enter a five digit zip code");
						zip = keyboard.nextLine();
					}
					q2 = "UPDATE CUSTOMER SET Zip = '" + zip + "' WHERE CustomerNumber = '" + customerNumber + "'";
					rows = stmt.executeUpdate(q2);
					System.out.println(rows + " row(s) updated in the table.");
			} 
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