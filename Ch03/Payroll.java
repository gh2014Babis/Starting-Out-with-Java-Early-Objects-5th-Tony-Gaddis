
public class Payroll {
	
	private String name;
	private int id;
	private double payRate;
	private int hoursWorked;
	
	public Payroll(String name, int id) {
		this.name = name;
		this.id = id;
	}
	
	public void setPayRate(double payRate) {
		this.payRate = payRate;
	}
	
	public void setHoursWorked(int hoursWorked) {
		this.hoursWorked = hoursWorked;
	}
	
	public String getName() {
		return name;
	}
	
	public int getID() {
		return id;
	}
	
	public double getPayRate() {
		return payRate;
	}
	
	public int getHoursWorked() {
		return hoursWorked;
	}
	
	public double grossPay() {
		return payRate * hoursWorked; 
	}
}
