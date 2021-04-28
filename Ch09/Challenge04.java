public class Challenge04 {
	
	public static void main(String[] args) {
		Essay e = new Essay(15, 34, 26, 20);
		System.out.println("Grammar: " + e.getGrammar());
		System.out.println("Spelling: " + e.getSpelling());
		System.out.println("Correct length: " + e.getCorrectLength());
		System.out.println("Content: " + e.getContent());
		e.setScore();
		System.out.println("Final score: " + e.getScore());
		System.out.println("Final grade: " + e.getGrade());
	}
}