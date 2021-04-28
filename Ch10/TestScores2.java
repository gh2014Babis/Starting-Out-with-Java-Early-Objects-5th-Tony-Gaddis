
public class TestScores2 {
	
	private double[] scores;
	
	public TestScores2(double[] scores) {
		this.scores = new double[scores.length];
		for (int i = 0; i < scores.length; i++) {
			this.scores[i] = scores[i];
		}
	}
	
	public double getAverage() throws InvalidTestScore {
		double sum = 0;
		for (int i = 0; i < scores.length; i++) {
			if (scores[i] < 0 || scores[i] > 100)
				throw new InvalidTestScore();
			sum += scores[i];
		}
		return sum / scores.length;
	}
}
