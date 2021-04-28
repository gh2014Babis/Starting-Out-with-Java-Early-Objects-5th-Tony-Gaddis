import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class UpperCaseFile {
	
	private String file1;
	private String file2;
	
	public UpperCaseFile(String file1, String file2) {
		this.file1 = file1;
		this.file2 = file2;
	}
	
	public void displayFile1Contents() throws FileNotFoundException {
		Scanner inputFile = new Scanner(new File(file1));
		while (inputFile.hasNext()) {
			System.out.println(inputFile.nextLine());
		}
		inputFile.close();
	}
	
	public void displayFile2Contents() throws FileNotFoundException {
		Scanner inputFile = new Scanner(new File(file2));
		while (inputFile.hasNext()) {
			System.out.println(inputFile.nextLine());
		}
		inputFile.close();
	}
	
	public void copyFile1ToFile2() throws FileNotFoundException {		
		Scanner inputFile = new Scanner(new File(file1));
		PrintWriter outputFile = new PrintWriter(new File(file2));
		while (inputFile.hasNext()) {
			outputFile.println(inputFile.nextLine().toUpperCase());
		}
		inputFile.close();
		outputFile.close();
	}
}
