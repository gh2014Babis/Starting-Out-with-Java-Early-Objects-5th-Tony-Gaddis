import java.util.Scanner;

public class Challenge13 {
	
	final static double TAX_RATE = 0.075;
	final static double TIP_RATE = 0.18;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the charge of the meal: ");
		double charge = Double.parseDouble(input.next());
		double tax = charge * TAX_RATE;
		double tip = (charge + tax) * TIP_RATE;
		double totalBill = charge + tax + tip;
		System.out.println("The meal charge: $" + charge);
		System.out.println("The tax amount: $" + tax);
		System.out.println("The tip amount: $" + tip);
		System.out.println("The total bill: $" + totalBill);
		input.close();
	}
}
