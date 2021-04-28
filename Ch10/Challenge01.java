
public class Challenge01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double[] scores = {12, 45, 167, 44, 90, 77, 38, 42};
		TestScores ts = new TestScores(scores);
		System.out.println("Average: " + ts.getAverage());
	}
}
