import java.io.Serializable;

@SuppressWarnings("serial")
public class TestScores3 implements Serializable {
	
	private double[] scores;
	
	public TestScores3(double[] scores) {
		this.scores = new double[scores.length];
		for (int i = 0; i < scores.length; i++) {
			this.scores[i] = scores[i];
		}
	}
	
	public double getAverage() {
		double sum = 0;
		for (int i = 0; i < scores.length; i++) {
			if (scores[i] < 0 || scores[i] > 100)
				throw new IllegalArgumentException("Description: The element is < 0 or > 100");
			sum += scores[i];
		}
		return sum / scores.length;
	}
}
