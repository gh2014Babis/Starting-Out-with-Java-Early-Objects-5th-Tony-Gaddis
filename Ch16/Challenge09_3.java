package challenges;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Challenge09_3 {
	public static void main(String[] args) {
		// Create a named constant for the URL.
		// NOTE: This value is specific for Java DB.
		final String DB_URL = "jdbc:derby:PhoneBook";
		
		try {
			// Create a connection to the database.
			Connection conn = DriverManager.getConnection(DB_URL);
			
			// Create a Statement object.
			Statement stmt = conn.createStatement();
			
			// Create a string with a SELECT statement.
			String sqlStatement = "SELECT * FROM Entries";
			
			// Send the statement to the DBMS.
			ResultSet result = stmt.executeQuery(sqlStatement);
			
			// Display the contents of the result set.
			// The result set will have three columns.
			while (result.next()) {
	            System.out.printf("%25s %10s\n", result.getString("name"), result.getString("phone"));
	        }
			
			// Close the connection.
			conn.close();
		} catch(Exception ex) {
			System.out.println("ERROR: " + ex.getMessage());
		}
	}
}