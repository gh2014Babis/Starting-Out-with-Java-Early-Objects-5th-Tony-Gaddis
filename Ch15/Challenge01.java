package challenges;

import java.util.Scanner;

public class Challenge01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.print("Give an integer x: ");
		int x = input.nextInt();
		System.out.print("Give an integer y: ");
		int y = input.nextInt();
		System.out.println("The result of multiplication " + x + " * " + y + " = " + recursiveMultiplication(x, y));
		input.close();
	}
	
	public static int recursiveMultiplication(int x, int y) {
		if (x == 0)
			return 0;
		else 
			return y + recursiveMultiplication(x - 1, y);
	}
}
