
public class BankAccount {
	
	private double balance;
	private int deposits;
	private int withdrawals;
	private double annualInterestRate;
	private double charges;
	
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
	
	public double getBalance() {
		return balance;
	}
	
	public int getDeposits() {
		return deposits;
	}
	
	public int getWithdrawals() {
		return withdrawals;
	}
	
	public double getAnnualInterestRate() {
		return annualInterestRate;
	}
	
	public double getCharges() {
		return charges;
	}
}
