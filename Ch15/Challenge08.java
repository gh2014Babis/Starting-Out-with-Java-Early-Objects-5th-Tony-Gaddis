package challenges;

import java.util.Scanner;

public class Challenge08 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.print("Give an integer x: ");
		int x = input.nextInt();
		System.out.println("The sum of 1 to " + x + " = " + sumOfNums(x, 1));
		input.close();
	}
	
	public static int sumOfNums(int x, int start) {
		if (start > x)
			return 0;
		else 
			return start + sumOfNums(x, start + 1);
	}
}
