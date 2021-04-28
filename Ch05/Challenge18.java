import java.util.Scanner;

public class Challenge18 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int randomNumber = (int)(Math.random() * 100) + 1;
		System.out.println(randomNumber);
		System.out.print("Guess a number: ");
		int guess = input.nextInt();
		int n = 1;
		while (guess != randomNumber) {
			if (guess > randomNumber) {
				System.out.println("Your number is bigger");
			} else {
				System.out.println("Your number is smaller");
			}
			System.out.print("Guess a number: ");
			guess = input.nextInt();
			n++;
		}
		System.out.println("Congrats after " + n + " efforts!!!");
		input.close();
	}
}