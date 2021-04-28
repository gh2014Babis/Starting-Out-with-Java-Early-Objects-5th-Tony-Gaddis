package challenges;

import java.util.Scanner;

public class Challenge03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner keyboard = new Scanner(System.in);
		System.out.print("Enter a string: ");
		String str = keyboard.next();
		System.out.println("In reverse order: " + reverser(str, str.length() - 1));
		keyboard.close();
	}
	
	public static String reverser(String str, int idx) {
		if (idx == -1)
			return "";
		else 
			return str.charAt(idx) + reverser(str, idx - 1);
	}
}
