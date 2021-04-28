package challenges;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Challenge05 {
	
	static final String DB_URL = "jdbc:derby:CityDB";

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			Connection conn = DriverManager.getConnection(DB_URL);
			Statement stmt = conn.createStatement();
			String q1 = "SELECT * FROM City ORDER BY Population";
			String q2 = "SELECT * FROM City ORDER BY Population DESC";
			String q3 = "SELECT * FROM City ORDER BY CityName";
			String q4 = "SELECT SUM(Population) FROM City";
			String q5 = "SELECT AVG(Population) FROM City";
			String q6 = "SELECT MAX(Population) FROM City";
			String q7 = "SELECT MIN(Population) FROM City";
			
			ResultSet res;
			System.out.println("The list of cities by population, in ascending order");
			res = stmt.executeQuery(q1);
			while (res.next()) {
				System.out.println(res.getString("CityName") + " " + res.getDouble("Population"));
			}
			
			System.out.println("\nThe list of cities by population, in descending order");
			res = stmt.executeQuery(q2);
			while (res.next()) {
				System.out.println(res.getString("CityName") + " " + res.getDouble("Population"));
			}
			
			System.out.println("\nThe list of cities by name");
			res = stmt.executeQuery(q3);
			while (res.next()) {
				System.out.println(res.getString("CityName") + " " + res.getDouble("Population"));
			}
			
			System.out.println("\nThe total population of all the cities");
			res = stmt.executeQuery(q4);
			if (res.next()) {
				System.out.println(res.getDouble(1));
			}
			
			System.out.println("\nThe average population of all the cities");
			res = stmt.executeQuery(q5);
			if (res.next()) {
				System.out.println(res.getDouble(1));
			}
			
			System.out.println("\nThe highest population");
			res = stmt.executeQuery(q6);
			if (res.next()) {
				System.out.println(res.getDouble(1));
			}
			
			System.out.println("\nThe lowest population");
			res = stmt.executeQuery(q7);
			if (res.next()) {
				System.out.println(res.getDouble(1));
			}
			conn.close();
		} catch(Exception ex) {
			System.out.println("ERROR: " + ex.getMessage());
		}	
	}
}
