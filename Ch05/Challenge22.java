
public class Challenge22 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Die player;
		Die computer;
		int playerWins = 0, computerWins = 0;
		for (int i = 1; i <= 10; i++) {
			player = new Die(6);
			computer = new Die(6);
			if (player.getValue() > computer.getValue()) {
				System.out.println("Player wins in loop " + i);
				playerWins++;
			} else if (player.getValue() < computer.getValue()) {
				System.out.println("Computer wins in loop " + i);
				computerWins++;
			} else
				System.out.println("Tie in loop " + i);
		}
		if (playerWins > computerWins)
			System.out.println("Player is the grand winner");
		else if (playerWins < computerWins)
			System.out.println("Computer is the grand winner");
		else
			System.out.println("It's a tie");		
	}
}
