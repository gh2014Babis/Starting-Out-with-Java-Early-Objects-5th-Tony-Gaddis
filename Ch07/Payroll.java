
public class Payroll {
	
	private int[] employeeId = {5658845, 4520125, 7895122, 8777541, 8451277, 1302850, 7580489};
	private int[] hours;
	private double[] payRate;
	private double[] wages;
	
	public Payroll(int[] hours, double[] payRate, double[] wages) {
		this.hours = new int[hours.length];
		this.payRate = new double[payRate.length];
		this.wages = new double[wages.length];
		for (int i = 0; i < employeeId.length; i++) {
			this.hours[i] = hours[i];
			this.payRate[i] = payRate[i];
			this.wages[i] = wages[i];
		}
	}
	
	public void setEmployeeId(int[] employeeId) {
		for (int i = 0; i < employeeId.length; i++) {
			this.employeeId[i] = employeeId[i];
		}
	}
	
	public void setHours(int[] hours) {
		for (int i = 0; i < hours.length; i++) {
			this.hours[i] = hours[i];
		}
	}
	
	public void setPayRate(double[] payRate) {
		for (int i = 0; i < payRate.length; i++) {
			this.payRate[i] = payRate[i];
		}
	}
	
	public void setWages(double[] wages) {
		for (int i = 0; i < wages.length; i++) {
			this.wages[i] = wages[i];
		}
	}
	
	public int[] getEmployeeId() {
		return employeeId;
	}
	
	public int[] getHours() {
		return hours;
	}
	
	public double[] getPayRate() {
		return payRate;
	}
	
	public double[] getWages() {
		return wages;
	}
	
	public double getGrossPayOfID(int id) {
		int i = 0; 
		while (i < employeeId.length) {
			if (employeeId[i] == id)
				break;
			else
				i++;
		}
		return wages[i];
	}
}
