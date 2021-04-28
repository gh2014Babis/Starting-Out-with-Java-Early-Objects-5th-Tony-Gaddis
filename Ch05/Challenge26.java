import java.util.Random;
import java.util.Scanner;

public class Challenge26 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		Random rand = new Random();
		double amount, totalAmount = 0, totalAmountWon = 0;
		int r1, r2, r3;
		String answer, word1, word2, word3;
		do {
			System.out.print("Enter the amount of money: ");
			amount = Double.parseDouble(input.next());
			while (amount <= 0) {
				System.out.println("Invalid input value");
				System.out.print("Enter the amount of money: ");
				amount = Double.parseDouble(input.next());
			}
			totalAmount += amount;
			r1 = rand.nextInt(6);
			r2 = rand.nextInt(6);
			r3 = rand.nextInt(6);
			word1 = getWord(r1);
			word2 = getWord(r2);
			word3 = getWord(r3);
			System.out.println(word1 + " - " + word2 + " - " + word3);
			if (r1 != r2 && r2 != r3 && r1 != r3) {
				System.out.println("You won $0");
			} else if (r1 == r2 && r2 == r3) {
				System.out.println("You won $" + (3 * amount));
				totalAmountWon += 3 * amount;
			} else {
				System.out.println("You won $" + (2 * amount));
				totalAmountWon += 2 * amount;
			}
			System.out.print("Do you want to play again (Yes/No)? ");
			answer = input.next().toUpperCase();
			while (!answer.equals("YES") && !answer.equals("NO")) {
				System.out.println("Invalid answer");
				System.out.print("Do you want to play again (Yes/No)? ");
				answer = input.next().toUpperCase();
			}
		} while (answer.equals("YES"));
		System.out.println("Total amount entered: $" + totalAmount);
		System.out.println("Total amount won: $" + totalAmountWon);
		input.close();
	}
	
	public static String getWord(int r) {
		String word;
		if (r == 0)
			word = "Cherries";
		else if (r == 1)
			word = "Oranges";
		else if (r == 2)
			word = "Plums";
		else if (r == 3)
			word = "Bells";
		else if (r == 4)
			word = "Melons";
		else 
			word = "Bars";
		return word;
	}
}
