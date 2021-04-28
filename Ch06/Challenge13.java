/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/
import java.util.Random;

/**
 * The Die class simulates a die with a specified number of sides.
 */
class Die {
    private int sides; // Number of sides
    private int value; // The die's value
    
    /**
     * The constructor performs an initial
     * roll of the die. The number of sides
     * for the die is passed as an argument.
     */
    public Die(int numSides) {
        sides = numSides;
        roll();
    }

    /**
     * The roll method simulates the rolling of
     * the die.
     */
    public void roll() {
        // Create a Random object.
        Random rand = new Random();
        // Get a random value for the die.
        value = rand.nextInt(sides) + 1;
    }

    /**
     * The getSides method returns the
     * number of sides for the die.
     */
    public int getSides() {
        return sides;
    }

    /**
     * The getValue method returns the
     * value of the die.
     */
    public int getValue() {
        return value;
    }
}

public class Challenge13 {
    
	public static void main(String[] args) {
		int points1 = 50, points2 = 50;
		Random rand = new Random();
		int turn = rand.nextInt(2) + 1;
		Die d1, d2;
		int sum1, sum2;
		while (true) {
		    if (turn == 1) {
		        turn = 2;
		        d1 = new Die(6);
		        d2 = new Die(6);
		        sum1 = d1.getValue() + d2.getValue();
		        if (points1 - sum1 < 1) {
		            points1 += sum1;
		        } else if (points1 - sum1 > 1) {
		            points1 -= sum1;
		        } else {
		            points1 = 1;
		            break;
		        }
		    } else {
		        turn = 1;
		        d1 = new Die(6);
		        d2 = new Die(6);
		        sum2 = d1.getValue() + d2.getValue();
		        if (points2 - sum2 < 1) {
		            points2 += sum2;
		        } else if (points2 - sum2 > 1) {
		            points2 -= sum2;
		        } else {
		            points2 = 1;
		            break;
		        }
		    }
		}
		if (points1 == 1)
		    System.out.println("Player1 wins");
		else    
		    System.out.println("Player2 wins");
	}
}
