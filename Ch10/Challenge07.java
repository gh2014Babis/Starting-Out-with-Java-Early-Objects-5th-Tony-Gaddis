import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Challenge07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			File file1 = new File("Challenge07.txt");
			Scanner inputFile = new Scanner(file1);
			File file2 = new File("EncryptedChallenge07.txt");
			PrintWriter outputFile = new PrintWriter(file2);
			while (inputFile.hasNext()) {
				String line = inputFile.nextLine();
				String str = "";
				for (int i = 0; i < line.length(); i++) {
					int c = line.charAt(i) + 10;
					str += (char)c;
				}
				outputFile.write(str);
				outputFile.write("\n");
			}
			inputFile.close();
			outputFile.close();
		} catch (FileNotFoundException e) {
			System.out.println("The file for encryption does not exist");
		}
	}
}
