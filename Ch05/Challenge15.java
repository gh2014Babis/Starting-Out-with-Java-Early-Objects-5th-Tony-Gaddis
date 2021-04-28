import java.io.FileNotFoundException;

public class Challenge15 {

	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub
		UpperCaseFile ucf = new UpperCaseFile("Challenge15a.txt", "Challenge15b.txt");
		ucf.copyFile1ToFile2();
		ucf.displayFile2Contents();
	}
}
