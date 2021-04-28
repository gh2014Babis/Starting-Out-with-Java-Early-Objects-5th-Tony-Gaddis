import java.util.Scanner;

public class Challenge14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a month (1-12): ");
		int month = input.nextInt();
		System.out.print("Enter a year: ");
		int year = input.nextInt();
		MonthDays m = new MonthDays(month, year);
		System.out.println(m.getNumberOfDays());
		input.close();
	}
}
