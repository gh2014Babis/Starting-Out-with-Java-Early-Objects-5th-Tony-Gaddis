import java.io.*;
import java.util.*;

public class Challenge14 {

	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub
		File file = new File("USpopulation.txt");
		Scanner inputFile = new Scanner(file);
		ArrayList<Integer> populations = new ArrayList<Integer>();
		while (inputFile.hasNext()) {
			populations.add(Integer.parseInt(inputFile.nextLine()));			
		}
		inputFile.close();
		int minIncrease = (int)Math.pow(10, 10);
		int maxIncrease = 0;
		int minYear = 0, maxYear = 0;
		for (int i = 1; i < populations.size(); i++) {
			int inc = populations.get(i) - populations.get(i - 1);
			if (inc < minIncrease) {
				minIncrease = inc;
				minYear = 1950 + i;
			}
			if (inc > maxIncrease) {
				maxIncrease = inc;
				maxYear = 1950 + i;
			}
		}
		System.out.println("The smallest increase was " + minIncrease + " between " + minYear + " and " + (minYear - 1));
		System.out.println("The greatest increase was " + maxIncrease + " between " + maxYear + " and " + (maxYear - 1));
	}
}
