import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class Challenge09a {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		TestScores3[] ts = new TestScores3[5];
		FileOutputStream outStream = new FileOutputStream("Objects.dat");
		ObjectOutputStream objectOutputFile = new ObjectOutputStream(outStream); 
		double[] a1 = {34, 56, 78, 29, 44};
		ts[0] = new TestScores3(a1);
		double[] a2 = {40, 35, 64, 88, 60};
		ts[1] = new TestScores3(a2);
		double[] a3 = {65, 67, 82, 79, 54};
		ts[2] = new TestScores3(a3);
		double[] a4 = {95, 100, 93, 97, 92};
		ts[3] = new TestScores3(a4);
		double[] a5 = {80, 96, 83, 77, 90};
		ts[4] = new TestScores3(a5);
		for (int i = 0; i < ts.length; i++) {
			objectOutputFile.writeObject(ts[i]);
		}
		objectOutputFile.close();
	}
}
