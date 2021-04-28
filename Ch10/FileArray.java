import java.io.*;

public class FileArray {
	
	public static void writeArray(String fileName, int[] numbers) throws IOException {
		FileOutputStream fstream = new FileOutputStream("Numbers.dat");
	    DataOutputStream outputFile = new DataOutputStream(fstream); 
	    for (int i = 0; i < numbers.length; i++) {
	    	outputFile.writeInt(numbers[i]);
	    }
	    outputFile.close(); 
	}
	
	public static void readArray(String fileName, int[] numbers) throws IOException {
		int number;
		boolean endOfFile = false;
		FileInputStream fstream = new FileInputStream("Numbers.dat"); 
		DataInputStream inputFile = new DataInputStream(fstream); 
		while (!endOfFile) {
			try {
				number = inputFile.readInt();
				System.out.print(number + " ");
			} catch (EOFException e) {
				endOfFile = true;
			}
		}
		inputFile.close();
	}
}
