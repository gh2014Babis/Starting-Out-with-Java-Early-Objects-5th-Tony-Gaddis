import java.util.*;
import java.io.*;

public class ChargeAccount2 {

	public static boolean find(int account, String fileName) throws IOException {
		File f = new File(fileName);
		Scanner inputFile = new Scanner(f);
		boolean found = false;
		while (inputFile.hasNext() && !found) {
			int a = Integer.parseInt(inputFile.nextLine());
			if (account == a)
				found = true;
		} 
		inputFile.close();
		return found;
	}
}