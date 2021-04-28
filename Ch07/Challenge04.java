import java.util.*;

public class Challenge04 {

	public static void main(String[] args) {
		int[] nums = {12, 34, 5, 78, 4, 2, 11, 26, 20};
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a number: ");
		int number = input.nextInt();
		sort(nums);
		int i = 0;
		while (i < nums.length) {
			if (nums[i] > number)
				break;
			i++;
		}
		for (int k = i; k < nums.length; k++) 
			System.out.print(nums[k] + " ");
		input.close();
	}
	
	public static void sort(int[] nums) {
		for (int i = 1; i < nums.length; i++) {
			for (int j = nums.length - 1; j >= i; j--) {
				if (nums[j - 1] > nums[j]) {
					int temp = nums[j - 1];
					nums[j - 1] = nums[j];
					nums[j] = temp;
				}
			}
		}
	}
}
	
	