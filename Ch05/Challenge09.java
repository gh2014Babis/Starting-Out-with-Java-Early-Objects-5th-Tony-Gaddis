import java.util.Scanner;

public class Challenge09 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int id;
		double grossPay;
		double stateTax;
		double federalTax;
		double fica;
		double netPay;
		double totalGrossPay = 0;
		double totalStateTax = 0;
		double totalFederalTax = 0;
		double totalFICA = 0;
		double totalNetPay = 0;
		System.out.print("Enter the employee's ID: ");
		id = input.nextInt();
		while (id != 0) {
			System.out.print("Enter the gross pay: ");
			grossPay = Double.parseDouble(input.next());
			while (grossPay < 0) {
				System.out.println("Invalid input value for gross pay");
				System.out.print("Enter a gross pay >= 0: ");
				grossPay = Double.parseDouble(input.next());
			}
			do {
				System.out.print("Enter the state tax: ");
				stateTax = Double.parseDouble(input.next());
				while (stateTax < 0 || stateTax > grossPay) {
					System.out.println("Invalid input value for state tax");
					System.out.print("Enter a state tax >= 0 and <= " + grossPay + ": ");
					stateTax = Double.parseDouble(input.next());
				}
				System.out.print("Enter the federal tax: ");
				federalTax = Double.parseDouble(input.next());
				while (federalTax < 0 || federalTax > grossPay) {
					System.out.println("Invalid input value for federal tax");
					System.out.print("Enter a federal tax >= 0 and <= " + grossPay + ": ");
					federalTax = Double.parseDouble(input.next());
				}
				System.out.print("Enter the fica: ");
				fica = Double.parseDouble(input.next());
				while (fica < 0 || fica > grossPay) {
					System.out.println("Invalid input value for fica");
					System.out.print("Enter a fica >= 0 and <= " + grossPay + ": ");
					fica = Double.parseDouble(input.next());
				}
				if (stateTax + federalTax + fica > grossPay) {
					System.out.println("Invalid values for state tax or federal tax or fica");
				}
			} while (stateTax + federalTax + fica > grossPay);		
			totalGrossPay += grossPay;
			totalStateTax += stateTax;
			totalFederalTax += federalTax;
			totalFICA += fica;
			Payroll p = new Payroll(id, grossPay, stateTax, federalTax, fica);
			netPay = p.getNetPay();
			System.out.println("Net pay: $" + netPay);
			totalNetPay += netPay;
			System.out.print("Enter the employee's ID: ");
			id = input.nextInt();
		}
		System.out.println("Total gross pay: $" + totalGrossPay);
		System.out.println("Total state tax: $" + totalStateTax);
		System.out.println("Total federal tax: $" + totalFederalTax);
		System.out.println("Total fica: $" + totalFICA);
		System.out.println("Total net pay: $" + totalNetPay);		
		input.close();
	}
}
