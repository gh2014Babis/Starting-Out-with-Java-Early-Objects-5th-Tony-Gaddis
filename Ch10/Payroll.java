
public class Payroll {
	
	private String name;
	private int id;
	private double payRate;
	private int hoursWorked;
	
	public Payroll() {
		name = "";
		id = 0;
	}
	
	public Payroll(String name, int id) throws InvalidEmployeeName, InvalidIDNumber {
		if (name.isEmpty())
			throw new InvalidEmployeeName();
		else
			this.name = name;
		if (id <= 0)
			throw new InvalidIDNumber();
		else
			this.id = id;
	}
	
	public void setName(String name) throws InvalidEmployeeName {
		if (name.isEmpty())
			throw new InvalidEmployeeName();
		else
			this.name = name;
	}
	
	public void setIDNumber(int id) throws InvalidIDNumber {
		if (id <= 0)
			throw new InvalidIDNumber();
		else
			this.id = id;
	}
	
	public void setPayRate(double payRate) throws InvalidHourlyPayRate {
		if (payRate < 0 || payRate > 25)
			throw new InvalidHourlyPayRate();
		else
			this.payRate = payRate;
	}
	
	public void setHoursWorked(int hoursWorked) throws InvalidHoursWorked {
		if (hoursWorked < 0 || hoursWorked > 84)
			throw new InvalidHoursWorked();
		else
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
