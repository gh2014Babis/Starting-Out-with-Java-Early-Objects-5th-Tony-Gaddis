package challenges;

import java.sql.*;
 
public class Challenge06 {
	
	public static void main(String[] args) throws Exception {
		
		String sql;
		final String DB_URL = "jdbc:derby:Personnel;create=true";
		
		try {
			// Create a connection to the database.
			Connection conn = DriverManager.getConnection(DB_URL);
			
			// Create a Statement object.
			Statement stmt = conn.createStatement();
            
			System.out.println("Creating the Employee table...");
			stmt.execute("CREATE TABLE Employee (" +
                         "ID CHAR(10) NOT NULL PRIMARY KEY, " +
                         "name CHAR(25), " +
                         "position CHAR(25), " +
                         "hourlyPayRate DOUBLE)");
							 
			// Add some rows to the new table.
			sql = "INSERT INTO Employee VALUES" +
			      "('100', 'Babis Antonopoulos', 'Boss', 20.00)";
			stmt.executeUpdate(sql);
			
			sql = "INSERT INTO Employee VALUES" +
	              "('101', 'Angel Liakopoulou', 'Assistant', 18.50)";
			stmt.executeUpdate(sql);
				
			sql = "INSERT INTO Employee VALUES" +
		          "('102', 'Christos Antonopoulos', 'Big Boss', 28.00)";
			stmt.executeUpdate(sql);
			
			sql = "INSERT INTO Employee VALUES" +
			      "('103', 'Nikos Mpeltsos', 'Junior Developer ', 13.80)";
			stmt.executeUpdate(sql);
				
			sql = "INSERT INTO Employee VALUES" +
				  "('104', 'Kostas Vakalopoulos', 'Driver', 12.00)";
			stmt.executeUpdate(sql);
			
			// Close the resources.
			stmt.close();
			conn.close();
			System.out.println("Done");
		} catch(Exception ex) {
			System.out.println("ERROR: " + ex.getMessage());
		}
	} 
}