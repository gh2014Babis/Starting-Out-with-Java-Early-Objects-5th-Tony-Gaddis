import java.util.*;

public class Challenge04 {
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a string: ");
		String str = input.nextLine();
		VowelsConsonants vc = new VowelsConsonants(str);
		char choice = ' ';
		do {
			System.out.println("---MENU---");
			System.out.println("a. Count the number of vowels in the string");
			System.out.println("b. Count the number of consonants in the string");
			System.out.println("c. Count both the vowels and consonants in the string");
			System.out.println("d. Enter another string");
			System.out.println("e. Exit the program");
			System.out.print("Enter your choice: ");
			choice = input.next().charAt(0);
			while (choice != 'a' && choice != 'b' && choice != 'c' && choice != 'd' && choice != 'e') {
				System.out.println("Invalid input");
				System.out.print("Enter your choice: ");
				choice = input.next().charAt(0);
			}
			if (choice == 'a') 
				System.out.println("The number of vowels: " + vc.getNumberOfVowels());
			else if (choice == 'b')
				System.out.println("The number of consonants: " + vc.getNumberOfConsonants());
			else if (choice == 'c')
				System.out.println("The number of vowles and consonants: " + (vc.getNumberOfVowels() + vc.getNumberOfConsonants()));
			else if (choice == 'd') {
				input.nextLine();
				System.out.print("Enter a string: ");
				str = input.nextLine();
				vc.setStr(str);
			} else 
				System.out.println("EXIT OF PROGRAM");
		} while (choice != 'e');
		input.close();
	}
}