import java.io.*;
import java.util.Scanner;

public class Challenge10 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the name of a file: ");
		String fileName = input.next();
		File file = new File(fileName);
		if (!file.exists())
			System.exit(0);
		Scanner inputFile = new Scanner(file);
		int totalWords = 0;
		while (inputFile.hasNext()) {
			 String sentence = inputFile.nextLine();
			 String[] words = sentence.split(" ");
			 totalWords += words.length;
		}
		inputFile.close();
		System.out.println("Total words: " + totalWords);
		input.close();
	}
}
