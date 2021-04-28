package challenges;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class Challenge09_1 {
	
	public static void main(String[] args) throws Exception {
		
		final String DB_URL = "jdbc:derby:PhoneBook;create=true";
		
		try {
			// Create a connection to the database.
			Connection conn = DriverManager.getConnection(DB_URL);
			
			// Create a Statement object.
			Statement stmt = conn.createStatement();
            
			System.out.println("Creating the Entries table...");
			stmt.execute("CREATE TABLE Entries (" +
                         "name CHAR(25), " +
                         "phone CHAR(10))");
			
			// Close the resources.
			stmt.close();
			conn.close();
			System.out.println("Done");
		} catch(Exception ex) {
			System.out.println("ERROR: " + ex.getMessage());
		}
	} 
}