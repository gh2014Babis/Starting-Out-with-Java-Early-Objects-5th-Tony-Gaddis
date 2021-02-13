import java.util.Scanner;

public class Challenge15 {
	
	final static double CUPS_OF_SUGAR = 1.5;
	final static double CUPS_OF_BUTTER = 1;
	final static double CUPS_OF_FLOUR = 2.75;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the number of cookies you want to make: ");
		int cookies = input.nextInt();
		System.out.println("Cups of sugar: " + (cookies * CUPS_OF_SUGAR / 48));
		System.out.println("Cups of butter: " + (cookies * CUPS_OF_BUTTER / 48));
		System.out.println("Cups of flour: " + (cookies * CUPS_OF_FLOUR / 48));
		input.close();
	}
}
