import java.util.*;

public class Challenge08 {
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a series of numbers separated by commas: ");
		String numbers = input.nextLine();
		String[] nums = numbers.split(",");
		int sum = 0;
		for (int i = 0; i < nums.length; i++) {
			sum += Integer.parseInt(nums[i]);
		}
		System.out.println("Sum of numbers: " + sum);
		input.close();
	}
}