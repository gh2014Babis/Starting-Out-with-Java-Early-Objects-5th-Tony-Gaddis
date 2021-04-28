package challenges;

import java.util.Scanner;

public class Challenge05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner keyboard = new Scanner(System.in);
		System.out.print("Enter a sentence: ");
		String s = keyboard.nextLine();
		System.out.println("Is palindrome? " + palindrome(s, 0, s.length() - 1));
		keyboard.close();
	}
	
	public static boolean palindrome(String s, int start, int end) {
		if (start >= end)
			return true;
		else if (Character.isLetter(s.charAt(start)) && Character.isLetter(s.charAt(end))) {
			if (Character.toLowerCase(s.charAt(start)) != Character.toLowerCase(s.charAt(end)))
				return false;
			else
				return palindrome(s, start + 1, end - 1);
		} else {
			if (!Character.isLetter(s.charAt(start)) && !Character.isLetter(s.charAt(end)))
				return palindrome(s, start + 1, end - 1);
			else if (!Character.isLetter(s.charAt(start)))
				return palindrome(s, start + 1, end);
			else
				return palindrome(s, start, end - 1);
		}
	}
}
