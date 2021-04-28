import java.util.Scanner;

public class Challenge05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the account balance: ");
		double account = Double.parseDouble(input.next());
		account -= 12 * 10;
		if (account < 400)
			account -= 15;
		System.out.print("Enter the number of checks: ");
		int checks = input.nextInt();
		double fees = getFees(checks);
		account -= fees;
		System.out.println("Ending balance: $" + account);
		input.close();
	}
	
	public static double getFees(int checks) {	
		double fees = 0;
		if (checks < 20) 
			fees = checks * 0.1;
		else if (checks < 40)
			fees = checks * 0.08;
		else if (checks < 60)
			fees = checks * 0.06;
		else 
			fees = checks * 0.04;
		return fees;
	}
}
