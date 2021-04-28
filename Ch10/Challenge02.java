
public class Challenge02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double[] scores = {12, 45, 167, 44, 90, 77, 38, 42};		
		try {
			TestScores2 ts = new TestScores2(scores);
			System.out.println("Average: " + ts.getAverage());
		} catch (InvalidTestScore e) {
			System.out.println(e.getMessage());
		}
	}
}
