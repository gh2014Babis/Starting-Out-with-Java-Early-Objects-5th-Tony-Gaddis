import java.util.Scanner;

public class Challenge01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a positive nonzero integer value: ");
		int pn = input.nextInt();
		while (pn <= 0) {
			System.out.println("Invalid input value");
			System.out.print("Enter a positive nonzero integer value: ");
			pn = input.nextInt();
		}
		int sum = 0;
		for (int i = 1; i <= pn; i++) {
			sum += i;
		}
		System.out.println("The sum of numbers " + 1 + " to " + pn + " is " + sum);
		input.close();
	}
}
