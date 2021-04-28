package challenges;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Challenge03 {
	
	static final String DB_URL = "jdbc:derby:CoffeeDB";
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub		
		try {
			Connection conn = DriverManager.getConnection(DB_URL);
			Statement stmt = conn.createStatement();
			String q = "SELECT SUM(Cost) FROM UNPAIDORDER";
			ResultSet res = stmt.executeQuery(q);
			if (res.next()) {
				System.out.println("Total cost: $" + res.getString(1));
			}
			conn.close();
		} catch(Exception ex) {
			System.out.println("ERROR: " + ex.getMessage());
		}
	}
}