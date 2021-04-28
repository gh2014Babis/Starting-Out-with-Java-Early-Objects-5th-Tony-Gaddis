import java.util.ArrayList;
import java.util.Scanner;

public class Challenge09 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		ArrayList<String> names = new ArrayList<String>();
		char[] grades = {'A', 'B', 'C', 'D', 'F'};
		double[] scores1 = new double[4];
		double[] scores2 = new double[4];
		double[] scores3 = new double[4];
		double[] scores4 = new double[4];
		double[] scores5 = new double[4];
		String name;
		for (int i = 0; i < 5; i++) {
			System.out.print("Enter the student's name: ");
			name = input.nextLine();
			names.add(name);
			if (i == 0) {
				for (int j = 0; j < 4; j++) {
					System.out.print("Enter the score: ");
					scores1[j] = Double.parseDouble(input.next());
					while (scores1[j] < 0 || scores1[j] > 100) {
						System.out.println("Invalid input value");
						System.out.print("Enter the score: ");
						scores1[j] = Double.parseDouble(input.next());
					}
				}
			} else if (i == 1) {
				for (int j = 0; j < 4; j++) {
					System.out.print("Enter the score: ");
					scores2[j] = Double.parseDouble(input.next());
					while (scores2[j] < 0 || scores2[j] > 100) {
						System.out.println("Invalid input value");
						System.out.print("Enter the score: ");
						scores2[j] = Double.parseDouble(input.next());
					}
				}
			} else if (i == 2) {
				for (int j = 0; j < 4; j++) {
					System.out.print("Enter the score: ");
					scores3[j] = Double.parseDouble(input.next());
					while (scores3[j] < 0 || scores3[j] > 100) {
						System.out.println("Invalid input value");
						System.out.print("Enter the score: ");
						scores3[j] = Double.parseDouble(input.next());
					}
				}
			} else if (i == 3) {
				for (int j = 0; j < 4; j++) {
					System.out.print("Enter the score: ");
					scores4[j] = Double.parseDouble(input.next());
					while (scores4[j] < 0 || scores4[j] > 100) {
						System.out.println("Invalid input value");
						System.out.print("Enter the score: ");
						scores4[j] = Double.parseDouble(input.next());
					}
				}
			} else {
				for (int j = 0; j < 4; j++) {
					System.out.print("Enter the score: ");
					scores5[j] = Double.parseDouble(input.next());
					while (scores5[j] < 0 || scores5[j] > 100) {
						System.out.println("Invalid input value");
						System.out.print("Enter the score: ");
						scores5[j] = Double.parseDouble(input.next());
					}
				}
			}
			input.nextLine();
		}
		GradeBook gb = new GradeBook(names, grades, scores1, scores2, scores3, scores4, scores5);
		for (int i = 0; i < 5; i++) {
			System.out.print("Student: " + gb.getName(i));
			System.out.print(" Average score: " + gb.getAvg(i));
			System.out.print(" Minimum score: " + gb.getMinScore(i));
			System.out.println(" Grade: " + gb.getGrade(i));
		}
		input.close();
	}
}
