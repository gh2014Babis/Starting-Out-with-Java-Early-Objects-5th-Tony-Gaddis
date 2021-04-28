import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class FileDisplay {
	
	private String fileName;
	
	public FileDisplay(String fileName) {
		this.fileName = fileName;
	}
	
	public void displayHead() throws FileNotFoundException {
		Scanner inputFile = new Scanner(new File(fileName));
		int n = 0;
		while (inputFile.hasNext()) {
			n++;
			inputFile.nextLine();
		}
		inputFile.close();
		if (n >= 5) {
			inputFile = new Scanner(new File(fileName));
			int k = 0;
			while (inputFile.hasNext() && k < 5) {
				k++;
				System.out.println(inputFile.nextLine());
			}
			inputFile.close();
		} else {
			displayContents();
		}
	}
	
	public void displayContents() throws FileNotFoundException {
		Scanner inputFile = new Scanner(new File(fileName));
		while (inputFile.hasNext()) {
			System.out.println(inputFile.nextLine());
		}
		inputFile.close();
	}
	
	public void displayWithLineNumbers() throws FileNotFoundException {
		Scanner inputFile = new Scanner(new File(fileName));
		int n = 0;
		while (inputFile.hasNext()) {
			n++;
			System.out.println(n + ";" + inputFile.nextLine());
		}
		inputFile.close();
	}
}
