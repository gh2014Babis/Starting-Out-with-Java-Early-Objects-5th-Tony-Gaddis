package challenges;

import java.util.Scanner;

public class Challenge06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char[] arr = {'a', 'c', 'w', 'a', 'k', 'c', 'b', 'k', 'm', 'v', 'o', 'c', 'a'};
		Scanner keyboard = new Scanner(System.in);
		System.out.print("Enter a character: ");
		char c = keyboard.nextLine().charAt(0);
		System.out.println("The character '" + c + "' occurs " + counter(arr, 0, 0, c) + " times");
		keyboard.close();
	}
	
	public static int counter(char[] arr, int idx, int count, char c) {
		if (idx == arr.length)
			return count;
		else {
			if (arr[idx] == c)
				count++;
			return counter(arr, idx + 1, count, c);
		}
	}
}