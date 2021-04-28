import java.util.*;

public class Challenge09 {
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a series of single digit numbers with nothing separating them: ");
		String numbers = input.nextLine();
		int sum = 0;
		int lowest = 10, highest = -1;
		for (int i = 0; i < numbers.length(); i++) {
			sum += Character.getNumericValue(numbers.charAt(i));
			if (i == 0) {
				lowest = Character.getNumericValue(numbers.charAt(i));
				highest = Character.getNumericValue(numbers.charAt(i));
			} else {
				if (Character.getNumericValue(numbers.charAt(i)) < lowest) 
					lowest = Character.getNumericValue(numbers.charAt(i));
				if (Character.getNumericValue(numbers.charAt(i)) > highest)
					highest = Character.getNumericValue(numbers.charAt(i));
			}
		}
		System.out.println("Sum of numbers: " + sum);
		System.out.println("Lowest number: " + lowest);
		System.out.println("Highest number: " + highest);
		input.close();
	}
}