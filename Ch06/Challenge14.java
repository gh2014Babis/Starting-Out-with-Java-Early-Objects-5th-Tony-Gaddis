/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/
import java.util.*;

class Coin {
    
    private String sideUp;
    
    public Coin() {
        toss();
    }
    
    public void toss() {
        int num = (int)Math.round(Math.random());
        if (num == 0)
            sideUp = "heads";
        else
            sideUp = "tails";
    }
    
    public String getSideUp() {
        return sideUp;
    }
}

public class Challenge14 {
    
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int points1 = 0, points2 = 0;
		String guess1, guess2;
		Coin c;
		while (points1 < 5 && points2 < 5) {
		    System.out.print("Enter the guess of player 1 (heads or tails): ");
		    guess1 = input.next();
		    while (!guess1.equals("heads") && !guess1.equals("tails")) {
		        System.out.println("Invalid input value");
		        System.out.print("Enter the guess of player 1 (heads or tails): ");
		        guess1 = input.next();
		    }
		    System.out.print("Enter the guess of player 2 (heads or tails): ");
		    guess2 = input.next();
		    while (!guess2.equals("heads") && !guess2.equals("tails")) {
		        System.out.println("Invalid input value");
		        System.out.print("Enter the guess of player 2 (heads or tails): ");
		        guess2 = input.next();
		    }
		    c = new Coin();
		    System.out.println("COIN: " + c.getSideUp());
		    if (c.getSideUp().equals(guess1)) {
		    	System.out.println("Player1 guessed correctly");
		    	points1++;
		    }		       
		    if (c.getSideUp().equals(guess2)) {
		    	System.out.println("Player2 guessed correctly");
		    	points2++;
		    }		        
		}
		if (points1 == 5 && points2 < 5)
		    System.out.println("Player1 wins");
		else if (points1 < 5 && points2 == 5)
		     System.out.println("Player2 wins");
		else
		     System.out.println("It's tie");
		input.close();
	}
}
