import java.util.Scanner;

public class Challenge07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the number of years: ");
		int years = input.nextInt();
		while (years < 1) {
			System.out.println("Invalid input value");
			System.out.print("Enter the number of years: ");
			years = input.nextInt();
		}
		double rainFall;
		double totalRainFalls = 0;
		for (int i = 1; i <= years; i++) {
			System.out.println("Year " + i);
			for (int j = 1; j <= 12; j++) {
				do {
					System.out.print(j + " >Enter the monthly rainfall: ");
					rainFall = Double.parseDouble(input.next());
					if (rainFall < 0)
						System.out.println("Invalid input value");
				} while (rainFall < 0);
				totalRainFalls += rainFall;
			}
		}
		int totalMonths = years * 12;
		double avg = totalRainFalls / totalMonths;
		System.out.println("Total number of months: " + totalMonths);
		System.out.println("Total inches of rainfall: " + totalRainFalls);
		System.out.println("Average rainfall per month: " + avg);
		input.close();
	}
}