import java.io.FileNotFoundException;

public class Challenge14 {

	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub
		FileDisplay fd = new FileDisplay("Challenge14.txt");
		fd.displayHead();
		fd.displayWithLineNumbers();
	}
}
