import java.io.*;
import java.util.*;

public class Challenge12 {

	public static void main(String[] args) throws IOException {
		double[] numbers = new double[1000];
		File file = new File("Numbers.txt");
		Scanner inputFile = new Scanner(file);
		double sum = 0;
		int k = -1;
		while (inputFile.hasNext()) {
			k++;
			numbers[k] = Double.parseDouble(inputFile.nextLine());
		}
		if (k != -1) {
			double max = numbers[0];
			double min = numbers[0];
			for (int i = 1; i <= k; i++) {
				sum += numbers[i];
				if (numbers[i] < min)
					min = numbers[i];
				if (numbers[i] > max)
					max = numbers[i];
			}
			System.out.println("Total of numbers: " + (k + 1));
			System.out.println("Lowest number: " + min);
			System.out.println("Highest number: " + max);
			System.out.println("Average: " + (sum / (k + 1)));
		} else {
			System.out.println("The file is empty");
		}
		inputFile.close();
	}
}		