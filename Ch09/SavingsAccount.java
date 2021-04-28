
public class SavingsAccount extends BankAccount {
	
	private boolean activeAccount;
	
	public SavingsAccount(double balance, double annualInterestRate) {
		super(balance, annualInterestRate);
		if (balance < 25)
			activeAccount = false;
		else
			activeAccount = true;
	}
	
	public void withdraw(double amount) {
		if (activeAccount) {
			super.withdraw(amount);
			if (balance < 25)
				activeAccount = false;
		} else {
			System.out.println("The account is inactive");
		}
	}
	
	public void deposit(double amount) {
		super.deposit(amount);
		if (!activeAccount && balance > 25)
			activeAccount = true;
	}
	
	public void monthlyProcess() {
		if (deposits > 4) {
			charges += (deposits - 4) * 1;
		}
		super.monthlyProcess();
		if (balance < 25)
			activeAccount = false;
	}
}
