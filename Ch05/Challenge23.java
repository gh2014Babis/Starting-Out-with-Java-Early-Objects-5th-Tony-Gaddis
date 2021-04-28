import java.util.Scanner;

public class Challenge23 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		String answer;
		System.out.print("Do you want to continue fishing (Yes/No)? ");
		answer = input.next().toUpperCase();
		while (!answer.equals("YES") && !answer.equals("NO")) {
			System.out.println("Invalid answer");
			System.out.print("Do you want to continue fishing (Yes/No)? ");
			answer = input.next().toUpperCase();
		}
		Die d;
		int points = 0;
		while (!answer.equals("NO")) {
			d = new Die(6);
			int value = d.getValue();
			if (value == 1) {
				System.out.println("A huge fish");
				points += 3;
			} else if (value == 2) {
				System.out.println("An old shoe");
				points -= 1;
			} else if (value == 3) {
				System.out.println("A little fish");
				points += 1;
			} else if (value == 4) {
				System.out.println("A tyre");
				points -= 2;
			} else if (value == 5) {
				System.out.println("A medium fish");
				points += 2;
			} else {
				System.out.println("A box");
				points -= 3;
			}
			//points += d.getValue();
			System.out.print("Do you want to continue fishing (Yes/No): ");
			answer = input.next().toUpperCase();
			while (!answer.equals("YES") && !answer.equals("NO")) {
				System.out.println("Invalid answer");
				System.out.print("Do you want to continue fishing (Yes/No): ");
				answer = input.next().toUpperCase();
			}
		}
		System.out.println(points);
		if (points > 0) 
			System.out.println("Congratulations");
		else
			System.out.println("I'm sorry...next time");
		input.close();
	}
}
