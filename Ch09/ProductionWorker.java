public class ProductionWorker extends Employee {
	
	private int shift;
	private double hourlyPayRate;
	
	public ProductionWorker(String name, String employeeNumber, String hireDate, int shift, double hourlyPayRate) {
		super(name, employeeNumber, hireDate);
		this.shift = shift;
		this.hourlyPayRate = hourlyPayRate;
	}
	
	public void setShift(int shift) {
		this.shift = shift;
	}
	
	public void setHourlyPayRate(double hourlyPayRate) {
		this.hourlyPayRate = hourlyPayRate;
	}
	
	public int getShift() {
		return shift;
	}
	
	public double getHourlyPayRate() {
		return hourlyPayRate;
	}
}