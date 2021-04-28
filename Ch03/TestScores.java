
public class TestScores {
	
	private int score1;
	private int score2;
	private int score3;
	
	public void setScore1(int score1) {
		this.score1 = score1;
	}
	
	public void setScore2(int score2) {
		this.score2 = score2;
	}
	
	public void setScore3(int score3) {
		this.score3 = score3;
	}
	
	public int getScore1() {
		return score1;
	}
	
	public int getScore2() {
		return score2;
	}
	
	public int getScore3() {
		return score3;
	}
	
	public double getAVG() {
		return (score1 + score2 + score3) / 3.0;
	}
}
