
public abstract class BankAccount {
	
	protected double balance;
	protected int deposits;
	protected int withdrawals;
	protected double annualInterestRate;
	protected double charges;
	
	public BankAccount(double balance, double annualInterestRate) {
		this.balance = balance;
		this.annualInterestRate = annualInterestRate;
		deposits = 0;
		withdrawals = 0;
		charges = 0;
	}
	
	public void deposit(double amount) {
		balance += amount;
		deposits++;
	}
	
	public void withdraw(double amount) {
		balance -= amount;
		withdrawals++;
	}
	
	public void calcInterest() {
		double monthlyInterestRate = annualInterestRate / 12;
		double monthlyInterest = balance * monthlyInterestRate;
		balance += monthlyInterest;
	}
	
	public void monthlyProcess() {
		balance -= charges;
		calcInterest();
		deposits = 0;
		withdrawals = 0;
		charges = 0;
	}
}
