import java.util.Scanner;

public class Challenge19 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a positive number <= 15: ");
		int number = input.nextInt();
		while (number <= 0 || number > 15) {
			System.out.println("Invalid input value");
			System.out.print("Enter again a positive number <= 15: ");
			number = input.nextInt();
		}
		for (int i = 1; i <= number; i++) {
			for (int j = 1; j <= number; j++) {
				System.out.print("X");
			}
			System.out.println();
		}
		input.close();
	}
}
