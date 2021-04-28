import java.util.Scanner;

public class Challenge08 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a number: ");
		int number = input.nextInt();
		int n = 0;
		int max = (int)(-(Math.pow(10, 10)));
		int min = (int)((Math.pow(10, 10)));;
		while (number != -99) {
			n++;
			if (n == 1) {
				max = number;
				min = number;
			} else {
				if (number > max)
					max = number;
				if (number < min)
					min = number;
			}
			System.out.print("Enter another number: ");
			number = input.nextInt();
		}
		if (n > 0) {
			System.out.println("Max: " + max);
			System.out.println("Min: " + min);
		} else {
			System.out.println("No valid input values");
		}
		input.close();
	}
}
