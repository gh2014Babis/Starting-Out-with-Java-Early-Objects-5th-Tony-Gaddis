import java.util.Scanner;

public class Challenge24 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		String answer;
		Die p1, p2, c1, c2;
		int pwins = 0, cwins = 0;
		do {
			System.out.print("Do you want to roll the dice (Yes/No)? ");
			answer = input.next().toUpperCase();
			while (!answer.equals("YES") && !answer.equals("NO")) {
				System.out.println("Invalid answer");
				System.out.print("Do you want to roll the dice (Yes/No)? ");
				answer = input.next().toUpperCase();
			}
			if (answer.equals("YES")) {
				c1 = new Die(6);
				c2 = new Die(6);
				p1 = new Die(6);
				p2 = new Die(6);
				int cpoints = c1.getValue() + c2.getValue();
				int ppoints = p1.getValue() + p2.getValue();
				if (cpoints > ppoints)
					cwins++;
				else if (ppoints > cpoints)
					pwins++;
			} else {
				System.out.println("End of game");
			}
		} while (answer.equals("YES") && pwins < 21 && cwins < 21);
		if (cwins > pwins)
			System.out.println("Computer wins");
		else if (cwins < pwins)
			System.out.println("Player wins");
		else
			System.out.println("Tie");
		input.close();
	}
}
