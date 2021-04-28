import java.io.*;
import java.util.Scanner;

public class Challenge11 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		SavingsAccount sa = new SavingsAccount(0.5, 500);
		File file1 = new File("Deposits.txt");
		File file2 = new File("Withdrawals.txt");
		Scanner inputFile = new Scanner(file1);
		while (inputFile.hasNext()) {
			sa.deposit(Double.parseDouble(inputFile.nextLine()));
		}
		inputFile.close();
		inputFile = new Scanner(file2);
		while (inputFile.hasNext()) {
			sa.withdrawal(Double.parseDouble(inputFile.nextLine()));
		}
		inputFile.close();
		System.out.println("Monthly interest: " + (sa.getAnnualInterestRate() / 12));
		sa.addMonthlyInterest();
		System.out.println("Ending balance: $" + sa.getBalance());
		System.out.println("Total interest: $" + sa.getMonthlyInterest());
	}
}
