import java.util.Scanner;

public class Challenge11 {
	
	private static final double PACKAGE_A_COST = 39.99;
	private static final double PACKAGE_B_COST = 59.99;
	private static final double PACKAGE_C_COST = 69.99;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the package (A/B/C): ");
		char pack = input.next().charAt(0);
		if (pack != 'A' && pack != 'B' && pack != 'C') 
			System.out.println("Invalid package value");
		else {
			System.out.print("Enter the minutes: ");
			int minutes = input.nextInt();
			if (minutes < 0)
				System.out.println("Invalid minutes value");
			else {
				double charges = getCharges(pack, minutes);
				System.out.println("Total charges: $" + charges);
			}
		}
		input.close();
	}
	
	public static double getCharges(char pack, int minutes) {
		double charges;
		if (pack == 'A') {
			if (minutes <= 450)
				charges = PACKAGE_A_COST;
			else 
				charges = PACKAGE_A_COST + (minutes - 450) * 0.45;
		} else if (pack == 'B') {
			if (minutes <= 900)
				charges = PACKAGE_B_COST;
			else 
				charges = PACKAGE_B_COST + (minutes - 900) * 0.40;
		} else {
			charges = PACKAGE_C_COST;
		}
		return charges;
	}
}
