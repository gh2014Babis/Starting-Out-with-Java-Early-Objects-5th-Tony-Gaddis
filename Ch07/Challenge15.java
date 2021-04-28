import java.util.*;
import java.io.*;

public class Challenge15 {

	public static void main(String[] args) throws IOException {
		Scanner input = new Scanner(System.in);
		File file = new File("WorldSeriesWinners.txt");
		Scanner inputFile = new Scanner(file);
		ArrayList<String> teams = new ArrayList<String>();
		while (inputFile.hasNext()) {
			teams.add(inputFile.nextLine());
		}
		System.out.print("Enter a team's name: ");
		String team = input.nextLine();
		int count = 0;
		for (int i = 0; i < teams.size(); i++) {
			if (team.equals(teams.get(i))) 
				count++;
		}
		System.out.println("The team " + team + " won " + count + " times");
		inputFile.close();
		input.close();
	}
}