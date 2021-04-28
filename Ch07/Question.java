public class Question {

	private String question;
	private String[] possibleAnswers;
	private int correct;
	
	public Question() {
		question = "";
		possibleAnswers = new String[4];
		correct = 0;
	}
	
	public Question(String question, String[] possibleAnswers, int correct) {
		this.question = question;
		this.possibleAnswers = new String[possibleAnswers.length];
		for (int i = 0; i < possibleAnswers.length; i++) {
			this.possibleAnswers[i] = possibleAnswers[i];
		}
		this.correct = correct;
	}
	
	public void setQuestion(String question) {
		this.question = question;
	}
	
	public void setPossibleAnswers(String[] possibleAnswers) {
		for (int i = 0; i < possibleAnswers.length; i++)
			this.possibleAnswers[i] = possibleAnswers[i];
	}
	
	public void setCorrect(int correct) {
		this.correct = correct;
	}
	
	public String getQuestion() {
		return question;
	}
	
	public String[] getPossibleAnswers() {
		return possibleAnswers;
	}
	
	public int getCorrect() {
		return correct;
	}
}