import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class Challenge09b {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		TestScores3[] ts = new TestScores3[5];
		FileInputStream inStream = new FileInputStream("Objects.dat");
		ObjectInputStream objectInputFile = new ObjectInputStream(inStream); 
		for (int i = 0; i < ts.length; i++) {
			ts[i] = (TestScores3)objectInputFile.readObject();
		}
		objectInputFile.close();
		for (int i = 0; i < ts.length; i++) {
			System.out.println(ts[i].getAverage());
		}
	}
}
