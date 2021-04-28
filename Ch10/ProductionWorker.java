public class ProductionWorker extends Employee {
	
	private int shift;
	private double hourlyPayRate;
	
	public ProductionWorker(String name, String employeeNumber, String hireDate, int shift, double hourlyPayRate) throws InvalidShift, InvalidPayRate, InvalidEmployeeNumber {
		super(name, employeeNumber, hireDate);
		if (shift < 0)
			throw new InvalidShift();
		else
			this.shift = shift;
		if (hourlyPayRate < 0)
			throw new InvalidPayRate();
		else 
			this.hourlyPayRate = hourlyPayRate;
	}
	
	public void setShift(int shift) throws InvalidShift {
		if (shift < 0)
			throw new InvalidShift();
		else
			this.shift = shift;
	}
	
	public void setHourlyPayRate(double hourlyPayRate) throws InvalidPayRate {
		if (hourlyPayRate < 0)
			throw new InvalidPayRate();
		else 
			this.hourlyPayRate = hourlyPayRate;
	}
	
	public int getShift() {
		return shift;
	}
	
	public double getHourlyPayRate() {
		return hourlyPayRate;
	}
}