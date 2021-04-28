import java.util.*;

public class Challenge10 {
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int[] playerNumbers = new int[5];
		for (int i = 0; i < playerNumbers.length; i++) {
			System.out.print("Enter a number: ");
			int number = input.nextInt();
			boolean found = find(playerNumbers, number);
			while (found || (number < 0 || number > 9)) {
				if (found) 
					System.out.println("The number exists");
				if (number < 0 || number > 9)
					System.out.println("Invalid input value");
				System.out.print("Enter a number: ");
				number = input.nextInt();
				found = find(playerNumbers, number);
			}
			playerNumbers[i] = number;
		}
		Lottery l = new Lottery();
		int total = l.compare(playerNumbers);
		int[] lotteryNumbers = l.getLotteryNumbers();
		System.out.print("Lottery numbers: ");
		for (int i = 0; i < lotteryNumbers.length; i++)
			System.out.print(lotteryNumbers[i] + " ");
		System.out.print("\nPlayer numbers: ");
		for (int i = 0; i < playerNumbers.length; i++)
			System.out.print(playerNumbers[i] + " ");
		System.out.println("\nTotal matches: " + total);
		if (total == 5)
			System.out.println("the user is a grand prize winner");
		input.close();
	}
	
	public static boolean find(int[] playerNumbers, int number) {
		int i = 0;
		while (i < playerNumbers.length) {
			if (playerNumbers[i] == number)
				return true;
			i++;
		}
		return false;
	}
}