import java.util.Scanner;

public class Challenge08 {
	
	final static double STATE_SALES_TAX_RATE = 0.055;
	final static double COUNTRY_SALES_TAX_RATE = 0.02;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the amount of a purchase: ");
		double amount = Double.parseDouble(input.next());
		double stateTax = amount * STATE_SALES_TAX_RATE;
		double countryTax = amount * COUNTRY_SALES_TAX_RATE;
		double totalTax = stateTax + countryTax;
		double totalAmount = amount + totalTax;
		System.out.println("The amount of the purchase: $" + amount);
		System.out.println("The state sales tax: $" + stateTax);
		System.out.println("The country sales tax: $" + countryTax);
		System.out.println("The total sales tax: $" + totalTax);
		System.out.println("The total sale: $" + totalAmount);
		input.close();
	}
}
