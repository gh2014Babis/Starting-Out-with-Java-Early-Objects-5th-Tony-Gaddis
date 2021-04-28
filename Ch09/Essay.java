public class Essay extends GradedActivity {

	private double grammar;
	private double spelling;
	private double correctLength;
	private double content;
	
	public Essay(double grammar, double spelling, double correctLength, double content) {
		super();
		this.grammar = grammar;
		this.spelling = spelling;
		this.correctLength = correctLength;
		this.content = content;
	}
	
	public void setScore() {
		double score = grammar + spelling + correctLength + content;
		super.setScore(score);
	}
	
	public double getGrammar() {
		return grammar;
	}
	
	public double getSpelling() {
		return spelling;
	}
	
	public double getCorrectLength() {
		return correctLength;
	}
	
	public double getContent() {
		return content;
	}
}