
public class SavingsAccount {
	
	private double annualInterestRate;
	private double balance;
	
	public SavingsAccount(double annualInterestRate, double balance) {
		this.annualInterestRate = annualInterestRate;
		this.balance = balance;
	}
	
	public double getBalance() {
		return balance;
	}
	
	public double getAnnualInterestRate() {
		return annualInterestRate;
	}
	
	public double getMonthlyInterest() {
		return (annualInterestRate / 12) * balance;
	}
	
	public void withdrawal(double amount) {
		balance -= amount;
	}
	
	public void deposit(double amount) {
		balance += amount;
	}
	
	public void addMonthlyInterest() {
		balance += getMonthlyInterest();
	}
}
