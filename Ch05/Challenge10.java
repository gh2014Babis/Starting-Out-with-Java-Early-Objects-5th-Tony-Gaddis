import java.util.Scanner;

public class Challenge10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the annual interest rate: ");
		double annualInterestRate = Double.parseDouble(input.next());
		System.out.println("Enter the starting balance: ");
		double balance = Double.parseDouble(input.next());
		System.out.print("Enter a period of time in months: ");
		int months = input.nextInt();
		SavingsAccount sa = new SavingsAccount(annualInterestRate, balance);
		double d, w, totalDeposits = 0, totalWithdrawals = 0, totalInterest = 0;
		for (int i = 1; i <= months; i++) {
			System.out.println("Month " + i);
			System.out.print("Enter the amount deposited into the account: ");
			d = Double.parseDouble(input.next());
			while (d < 0) {
				System.out.println("Invalid input value");
				System.out.print("Enter the amount deposited into the account: ");
				d = Double.parseDouble(input.next());
			}
			totalDeposits += d;
			sa.deposit(d);
			System.out.print("Enter the amount withdrawn from the account: ");
			w = Double.parseDouble(input.next());
			while (w < 0 || w > sa.getBalance()) {
				System.out.println("Invalid input value");
				System.out.print("Enter the amount withdrawn from the account: ");
				w = Double.parseDouble(input.next());
			}
			totalWithdrawals += w;
			sa.withdrawal(w);
			sa.addMonthlyInterest();
			totalInterest += sa.getMonthlyInterest();
		}
		System.out.println("Ending balance: $" + sa.getBalance());
		System.out.println("Total amount of deposits: $" + totalDeposits);
		System.out.println("Total amount of withdrawals: $" + totalWithdrawals);
		System.out.println("Total interest earned: $" + totalInterest);
		input.close();
	}
}
