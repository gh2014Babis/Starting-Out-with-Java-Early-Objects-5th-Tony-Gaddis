import java.util.*;

public class Challenge06 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		char[] answers = new char[20];
		char answer;
		for (int i = 0; i < answers.length; i++) {
			System.out.print("Enter the answer (A/B/C/D) for the " + (i + 1) + " question: "); 		
			answer = input.next().charAt(0);
			while (answer != 'A' && answer != 'B' && answer != 'C' && answer != 'D') {
				System.out.println("Invalid answer");
				System.out.print("Enter the answer (A/B/C/D) for the " + (i + 1) + " question: "); 		
				answer = input.next().charAt(0);
			}
			answers[i] = answer;
		}
		DriverExam de = new DriverExam(answers);
		System.out.println("The student passed the exams: " + de.passed());
		System.out.println("The student answered " + de.totalCorrect() + " correct answers");
		System.out.println("The student answered " + de.totalIncorrect() + " incorrect answers");
		int[] missed = de.questionsMissed();
		for (int i = 0; i < missed.length; i++)
			System.out.print(missed[i] + " ");
		input.close();
	}
}