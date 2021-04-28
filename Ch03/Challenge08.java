import java.util.Scanner;

public class Challenge08 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		TestScores t = new TestScores();
		System.out.print("Enter the first score: ");
		int score1 = input.nextInt();
		System.out.print("Enter the second score: ");
		int score2 = input.nextInt();
		System.out.print("Enter the third score: ");
		int score3 = input.nextInt();
		t.setScore1(score1);
		t.setScore2(score2);
		t.setScore3(score3);
		System.out.println("Average: " + t.getAVG());
		input.close();
	}
}
