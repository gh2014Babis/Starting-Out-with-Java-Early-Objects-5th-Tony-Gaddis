
public class Challenge21 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Coin quarter;
		Coin dime;
		Coin nickel;
		double balance = 0;
		while (balance < 1) {
			quarter = new Coin();
			dime = new Coin();
			nickel = new Coin();
			if (quarter.getSideUp().equals("heads"))
				balance += 0.25;
			if (dime.getSideUp().equals("heads"))
				balance += 0.10;
			if (nickel.getSideUp().equals("heads"))
				balance += 0.05;
		}
		if (balance == 1)
			System.out.println("You win the game");
		else
			System.out.println("You lose the game");
	}
}
