package challenges;

import java.util.Scanner;

public class Challenge02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {67, 56, 23, 15, 34, 9, 26, 33, 95};
		Scanner keyboard = new Scanner(System.in);
		char answer;
		int value, idx;
		do {
			System.out.print("Enter an integer: ");
			value = keyboard.nextInt();
			idx = 0;
			if (isMember(arr, idx, value))
				System.out.println("The value " + value + " was found in the array");
			else
				System.out.println("The value " + value + " was not found in the array");
			System.out.print("Will you continue (Y/y or N/n)? ");
			answer = keyboard.next().charAt(0);
			while (answer != 'Y' && answer != 'y' && answer != 'N' && answer != 'n') {
				System.out.println("Invalid answer");
				System.out.print("Will you continue (Y/y or N/n)? ");
				answer = keyboard.next().charAt(0);
			}
			if (answer == 'N' || answer == 'n')
				System.out.print("End of searching");
		} while (answer == 'Y' || answer == 'y');
		keyboard.close();
	}
	
	public static boolean isMember(int[] arr, int idx, int value) {
		if (idx == arr.length)
			return false;
		else if (arr[idx] == value)
			return true;
		else 
			return isMember(arr, idx + 1, value);
	}
}
