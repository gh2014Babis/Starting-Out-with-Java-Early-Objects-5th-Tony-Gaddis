package challenges;

import java.util.Scanner;

public class Challenge07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.print("Give an integer x: ");
		int x = input.nextInt();
		System.out.print("Give an integer y: ");
		int y = input.nextInt();
		System.out.println("The result of power " + x + "^" + y + " = " + recursivePower(x, y));
		input.close();
	}
	
	public static int recursivePower(int x, int y) {
		if (y == 0)
			return 1;
		else 
			return x * recursivePower(x, y - 1);
	}
}
