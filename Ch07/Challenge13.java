import java.io.*;
import java.util.*;

public class Challenge13 {

	@SuppressWarnings("unused")
	public static void main(String[] args) throws IOException {
		Scanner input = new Scanner(System.in);
		double[] numbers = new double[1000];
		File file1 = new File("GirlNames.txt");
		Scanner inputFile1 = new Scanner(file1);
		File file2 = new File("BoyNames.txt");
		Scanner inputFile2 = new Scanner(file2);
		String[] girls = new String[200];
		String[] boys = new String[200];
		String girlName, boyName;
		int k = -1;
		while (inputFile1.hasNext()) {
			k++;
			girls[k] = inputFile1.nextLine();
		}
		inputFile1.close();
		k = -1;
		while (inputFile2.hasNext()) {
			k++;
			boys[k] = inputFile2.nextLine();
		}
		inputFile2.close();
		System.out.print("Enter a boy's name: ");
		boyName = input.nextLine();
		System.out.print("Enter a girl's name: ");
		girlName = input.nextLine();
		boolean found = false;
		int i = 0;
		while (i <= k && !found) {
			if (boys[i].equals(boyName))
				found = true;
			else
				i++;
		}
		if (found)
			System.out.println("The name " + boyName + " is among the 200 most popular names given to boys");
		else
			System.out.println("The name " + boyName + " is not among the 200 most popular names given to boys");
		found = false;
		i = 0;
		while (i <= k && !found) {
			if (girls[i].equals(girlName))
				found = true;
			else
				i++;
		}
		if (found)
			System.out.println("The name " + girlName + " is among the 200 most popular names given to girls");
		else
			System.out.println("The name " + girlName + " is not among the 200 most popular names given to girls");
		input.close();
	}
}		