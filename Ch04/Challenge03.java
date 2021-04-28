import java.util.Scanner;

public class Challenge03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the first score: ");
		int score1 = input.nextInt();
		System.out.print("Enter the second score: ");
		int score2 = input.nextInt();
		System.out.print("Enter the third score: ");
		int score3 = input.nextInt();
		if ((score1 < 0 || score1 > 100) || (score2 < 0 || score2 > 100) || (score3 < 0 || score3 > 100)) {
			System.out.println("One or more of scores are invalid");
		} else {
			TestScores t = new TestScores(score1, score2, score3);
			System.out.println("Average: " + t.getAVG());
			System.out.println("Grade: " + t.getGrade());
		}
		input.close();
	}
}
