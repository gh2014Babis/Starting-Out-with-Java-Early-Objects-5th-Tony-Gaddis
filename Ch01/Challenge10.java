import java.util.Scanner;

public class Challenge10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the first score: ");
		int score1 = input.nextInt();
		System.out.print("Enter the second score: ");
		int score2 = input.nextInt();
		System.out.print("Enter the third score: ");
		int score3 = input.nextInt();
		double avg = (score1 + score2 + score3) / 3.0;
		System.out.println("Score1 = " + score1);
		System.out.println("Score2 = " + score2);
		System.out.println("Score3 = " + score3);
		System.out.println("Average = " + avg);
		input.close();
	}
}
