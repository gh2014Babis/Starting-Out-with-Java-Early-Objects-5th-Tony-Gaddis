
public class TestScores {
	
	private int score1;
	private int score2;
	private int score3;
	private double avg;
	
	public TestScores(int score1, int score2, int score3) {
		this.score1 = score1;
		this.score2 = score2;
		this.score3 = score3;
		avg = (score1 + score2 + score3) / 3.0;
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
		return avg;
	}
	
	public char getGrade() {
		char grade = ' ';
		if (avg < 60) {
			grade = 'F';
		} else if (avg < 70) {
			grade = 'D';
		} else if (avg < 80) {
			grade = 'C';
		} else if (avg < 90) {
			grade = 'B';			
		} else {
			grade = 'A';
		} 
		return grade;
	}
}
